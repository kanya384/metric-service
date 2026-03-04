package ru.grafana.metrics.controller;

import com.github.luben.zstd.Zstd;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xerial.snappy.Snappy;
import ru.grafana.metrics.dto.prometheus.Remote;
import ru.grafana.metrics.dto.prometheus.Types;

import java.io.ByteArrayOutputStream;

@RestController
public class RecieverController {
    @PostMapping("/metrics")
    public String recive(HttpServletRequest request) throws Exception {
        String contentEncoding = request.getHeader("Content-Encoding");

        // 1. Читаем сырые данные из запроса
        byte[] compressedData = readAllBytes(request.getInputStream());
        byte[] uncompressedData = null;

        if (contentEncoding.equals("snappy")) {
            uncompressedData = Snappy.uncompress(compressedData);
        } else if (contentEncoding.equals("zstd")) {
            uncompressedData = Zstd.decompress(compressedData);
        }

        Remote.WriteRequest writeRequest = Remote.WriteRequest.parseFrom(uncompressedData);
        writeRequest.getTimeseriesList().forEach(timeSeries -> {
            var metricName = getMetricName(timeSeries);
            if (metricName != null && metricName.equals("pgwatch2_bgwriter_checkpoint_write_time")) {
                System.out.println("found");
            }
        });

        return null;
    }

    private byte[] readAllBytes(ServletInputStream inputStream) throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] data = new byte[1024];
        int nRead;
        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }
        buffer.flush();
        return buffer.toByteArray();
    }

    private String getMetricName(Types.TimeSeries timeSeries) {
        for (Types.Label label : timeSeries.getLabelsList()) {
            if ("__name__".equals(label.getName())) {
                return label.getValue();
            }
        }
        return null;
    }
}
