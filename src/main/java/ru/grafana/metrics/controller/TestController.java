package ru.grafana.metrics.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public ResponseEntity<String> returnMetrics() {
        return ResponseEntity.ok()
                .contentType(MediaType.TEXT_PLAIN)
                .body("""
                # HELP available Is RL Service available (0 no, 1 yes)
                # TYPE available gauge
                available 1
                # HELP go_gc_duration_seconds A summary of the wall-time pause (stop-the-world) duration in garbage collection cycles.
                # TYPE go_gc_duration_seconds summary
                go_gc_duration_seconds{quantile="0"} 2.8693e-05
                go_gc_duration_seconds{quantile="0.25"} 3.498e-05
                go_gc_duration_seconds{quantile="0.5"} 3.9433e-05
                go_gc_duration_seconds{quantile="0.75"} 4.5038e-05
                go_gc_duration_seconds{quantile="1"} 0.000180826
                go_gc_duration_seconds_sum 0.184811989
                go_gc_duration_seconds_count 3764
                # HELP go_gc_gogc_percent Heap size target percentage configured by the user, otherwise 100. This value is set by the GOGC environment variable, and the runtime/debug.SetGCPercent function. Sourced from /gc/gogc:percent.
                # TYPE go_gc_gogc_percent gauge
                go_gc_gogc_percent 100
                # HELP go_gc_gomemlimit_bytes Go runtime memory limit configured by the user, otherwise math.MaxInt64. This value is set by the GOMEMLIMIT environment variable, and the runtime/debug.SetMemoryLimit function. Sourced from /gc/gomemlimit:bytes.
                # TYPE go_gc_gomemlimit_bytes gauge
                go_gc_gomemlimit_bytes 3.145728e+08
                # HELP go_goroutines Number of goroutines that currently exist.
                # TYPE go_goroutines gauge
                go_goroutines 34
                # HELP go_info Information about the Go environment.
                # TYPE go_info gauge
                go_info{version="go1.24.4"} 1
                # HELP go_memstats_alloc_bytes Number of bytes allocated in heap and currently in use. Equals to /memory/classes/heap/objects:bytes.
                # TYPE go_memstats_alloc_bytes gauge
                go_memstats_alloc_bytes 5.63596e+06
                # HELP go_memstats_alloc_bytes_total Total number of bytes allocated in heap until now, even if released already. Equals to /gc/heap/allocs:bytes.
                # TYPE go_memstats_alloc_bytes_total counter
                go_memstats_alloc_bytes_total 4.532057152e+09
                # HELP go_memstats_buck_hash_sys_bytes Number of bytes used by the profiling bucket hash table. Equals to /memory/classes/profiling/buckets:bytes.
                # TYPE go_memstats_buck_hash_sys_bytes gauge
                go_memstats_buck_hash_sys_bytes 1.56215e+06
                # HELP go_memstats_frees_total Total number of heap objects frees. Equals to /gc/heap/frees:objects + /gc/heap/tiny/allocs:objects.
                # TYPE go_memstats_frees_total counter
                go_memstats_frees_total 5.1981771e+07
                # HELP go_memstats_gc_sys_bytes Number of bytes used for garbage collection system metadata. Equals to /memory/classes/metadata/other:bytes.
                # TYPE go_memstats_gc_sys_bytes gauge
                go_memstats_gc_sys_bytes 3.3424e+06
                # HELP go_memstats_heap_alloc_bytes Number of heap bytes allocated and currently in use, same as go_memstats_alloc_bytes. Equals to /memory/classes/heap/objects:bytes.
                # TYPE go_memstats_heap_alloc_bytes gauge
                go_memstats_heap_alloc_bytes 5.63596e+06
                # HELP go_memstats_heap_idle_bytes Number of heap bytes waiting to be used. Equals to /memory/classes/heap/released:bytes + /memory/classes/heap/free:bytes.
                # TYPE go_memstats_heap_idle_bytes gauge
                go_memstats_heap_idle_bytes 4.808704e+06
                # HELP go_memstats_heap_inuse_bytes Number of heap bytes that are in use. Equals to /memory/classes/heap/objects:bytes + /memory/classes/heap/unused:bytes
                # TYPE go_memstats_heap_inuse_bytes gauge
                go_memstats_heap_inuse_bytes 7.118848e+06
                # HELP go_memstats_heap_objects Number of currently allocated objects. Equals to /gc/heap/objects:objects.
                # TYPE go_memstats_heap_objects gauge
                go_memstats_heap_objects 20874
                # HELP go_memstats_heap_released_bytes Number of heap bytes released to OS. Equals to /memory/classes/heap/released:bytes.
                # TYPE go_memstats_heap_released_bytes gauge
                go_memstats_heap_released_bytes 3.997696e+06
                # HELP go_memstats_heap_sys_bytes Number of heap bytes obtained from system. Equals to /memory/classes/heap/objects:bytes + /memory/classes/heap/unused:bytes + /memory/classes/heap/released:bytes + /memory/classes/heap/free:bytes.
                # TYPE go_memstats_heap_sys_bytes gauge
                go_memstats_heap_sys_bytes 1.1927552e+07
                # HELP go_memstats_last_gc_time_seconds Number of seconds since 1970 of last garbage collection.
                # TYPE go_memstats_last_gc_time_seconds gauge
                go_memstats_last_gc_time_seconds 1.7726131850500762e+09
                # HELP go_memstats_mallocs_total Total number of heap objects allocated, both live and gc-ed. Semantically a counter version for go_memstats_heap_objects gauge. Equals to /gc/heap/allocs:objects + /gc/heap/tiny/allocs:objects.
                # TYPE go_memstats_mallocs_total counter
                go_memstats_mallocs_total 5.2002645e+07
                # HELP go_memstats_mcache_inuse_bytes Number of bytes in use by mcache structures. Equals to /memory/classes/metadata/mcache/inuse:bytes.
                # TYPE go_memstats_mcache_inuse_bytes gauge
                go_memstats_mcache_inuse_bytes 1208
                # HELP go_memstats_mcache_sys_bytes Number of bytes used for mcache structures obtained from system. Equals to /memory/classes/metadata/mcache/inuse:bytes + /memory/classes/metadata/mcache/free:bytes.
                # TYPE go_memstats_mcache_sys_bytes gauge
                go_memstats_mcache_sys_bytes 15704
                # HELP go_memstats_mspan_inuse_bytes Number of bytes in use by mspan structures. Equals to /memory/classes/metadata/mspan/inuse:bytes.
                # TYPE go_memstats_mspan_inuse_bytes gauge
                go_memstats_mspan_inuse_bytes 117440
                # HELP go_memstats_mspan_sys_bytes Number of bytes used for mspan structures obtained from system. Equals to /memory/classes/metadata/mspan/inuse:bytes + /memory/classes/metadata/mspan/free:bytes.
                # TYPE go_memstats_mspan_sys_bytes gauge
                go_memstats_mspan_sys_bytes 130560
                # HELP go_memstats_next_gc_bytes Number of heap bytes when next garbage collection will take place. Equals to /gc/heap/goal:bytes.
                # TYPE go_memstats_next_gc_bytes gauge
                go_memstats_next_gc_bytes 1.0722098e+07
                # HELP go_memstats_other_sys_bytes Number of bytes used for other system allocations. Equals to /memory/classes/other:bytes.
                # TYPE go_memstats_other_sys_bytes gauge
                go_memstats_other_sys_bytes 541514
                # HELP go_memstats_stack_inuse_bytes Number of bytes obtained from system for stack allocator in non-CGO environments. Equals to /memory/classes/heap/stacks:bytes.
                # TYPE go_memstats_stack_inuse_bytes gauge
                go_memstats_stack_inuse_bytes 655360
                # HELP go_memstats_stack_sys_bytes Number of bytes obtained from system for stack allocator. Equals to /memory/classes/heap/stacks:bytes + /memory/classes/os-stacks:bytes.
                # TYPE go_memstats_stack_sys_bytes gauge
                go_memstats_stack_sys_bytes 655360
                # HELP go_memstats_sys_bytes Number of bytes obtained from system. Equals to /memory/classes/total:byte.
                # TYPE go_memstats_sys_bytes gauge
                go_memstats_sys_bytes 1.817524e+07
                # HELP go_sched_gomaxprocs_threads The current runtime.GOMAXPROCS setting, or the number of operating system threads that can execute user-level Go code simultaneously. Sourced from /sched/gomaxprocs:threads.
                # TYPE go_sched_gomaxprocs_threads gauge
                go_sched_gomaxprocs_threads 1
                # HELP go_threads Number of OS threads created.
                # TYPE go_threads gauge
                go_threads 7
                # HELP process_cpu_seconds_total Total user and system CPU time spent in seconds.
                # TYPE process_cpu_seconds_total counter
                process_cpu_seconds_total 186.84
                # HELP process_max_fds Maximum number of open file descriptors.
                # TYPE process_max_fds gauge
                process_max_fds 1.048576e+06
                # HELP process_network_receive_bytes_total Number of bytes received by the process over the network.
                # TYPE process_network_receive_bytes_total counter
                process_network_receive_bytes_total 1.920941539e+09
                # HELP process_network_transmit_bytes_total Number of bytes sent by the process over the network.
                # TYPE process_network_transmit_bytes_total counter
                process_network_transmit_bytes_total 1.639151985e+09
                # HELP process_open_fds Number of open file descriptors.
                # TYPE process_open_fds gauge
                process_open_fds 37
                # HELP process_resident_memory_bytes Resident memory size in bytes.
                # TYPE process_resident_memory_bytes gauge
                process_resident_memory_bytes 3.2538624e+07
                # HELP process_start_time_seconds Start time of the process since unix epoch in seconds.
                # TYPE process_start_time_seconds gauge
                process_start_time_seconds 1.77215966992e+09
                # HELP process_virtual_memory_bytes Virtual memory size in bytes.
                # TYPE process_virtual_memory_bytes gauge
                process_virtual_memory_bytes 1.283506176e+09
                # HELP process_virtual_memory_max_bytes Maximum amount of virtual memory available in bytes.
                # TYPE process_virtual_memory_max_bytes gauge
                process_virtual_memory_max_bytes 1.8446744073709552e+19
                # HELP promhttp_metric_handler_requests_in_flight Current number of scrapes being served.
                # TYPE promhttp_metric_handler_requests_in_flight gauge
                promhttp_metric_handler_requests_in_flight 1
                # HELP promhttp_metric_handler_requests_total Total number of scrapes by HTTP status code.
                # TYPE promhttp_metric_handler_requests_total counter
                promhttp_metric_handler_requests_total{code="200"} 7143
                promhttp_metric_handler_requests_total{code="500"} 0
                promhttp_metric_handler_requests_total{code="503"} 0
                # HELP ratelimiterservice_config_load_error Number of configuration load errors
                # TYPE ratelimiterservice_config_load_error counter
                ratelimiterservice_config_load_error 0
                # HELP ratelimiterservice_config_load_success Number of successful configuration load
                # TYPE ratelimiterservice_config_load_success counter
                ratelimiterservice_config_load_success 1
                # HELP ratelimiterservice_config_manager_error Number of errors communicating config manager
                # TYPE ratelimiterservice_config_manager_error counter
                ratelimiterservice_config_manager_error 0
                # HELP ratelimiterservice_localcache_averageAccessTime Returns the average unix timestamp when a entry being accessed
                # TYPE ratelimiterservice_localcache_averageAccessTime gauge
                ratelimiterservice_localcache_averageAccessTime 0
                # HELP ratelimiterservice_localcache_entryCount The number of items currently in the cache
                # TYPE ratelimiterservice_localcache_entryCount gauge
                ratelimiterservice_localcache_entryCount 0
                # HELP ratelimiterservice_localcache_evacuateCount Indicating the number of times an eviction occurred
                # TYPE ratelimiterservice_localcache_evacuateCount gauge
                ratelimiterservice_localcache_evacuateCount 0
                # HELP ratelimiterservice_localcache_expiredCount Indicating the number of times an expire occurred
                # TYPE ratelimiterservice_localcache_expiredCount gauge
                ratelimiterservice_localcache_expiredCount 0
                # HELP ratelimiterservice_localcache_hitCount Returns number of times a key was found in the cache
                # TYPE ratelimiterservice_localcache_hitCount gauge
                ratelimiterservice_localcache_hitCount 0
                # HELP ratelimiterservice_localcache_lookupCount Returns the number of times a lookup for a given key occurred
                # TYPE ratelimiterservice_localcache_lookupCount gauge
                ratelimiterservice_localcache_lookupCount 0
                # HELP ratelimiterservice_localcache_missCount Returns the number of times a miss occurred in the cache
                # TYPE ratelimiterservice_localcache_missCount gauge
                ratelimiterservice_localcache_missCount 0
                # HELP ratelimiterservice_localcache_overwriteCount Number of times entries have been overridden
                # TYPE ratelimiterservice_localcache_overwriteCount gauge
                ratelimiterservice_localcache_overwriteCount 0
                # HELP ratelimiterservice_radish_config_connection_status connection to radish status (0 - off, 1 - on)
                # TYPE ratelimiterservice_radish_config_connection_status gauge
                ratelimiterservice_radish_config_connection_status 1
                # HELP ratelimiterservice_radish_config_connections_broken total number broken radish connections
                # TYPE ratelimiterservice_radish_config_connections_broken counter
                ratelimiterservice_radish_config_connections_broken 0
                # HELP ratelimiterservice_radish_config_connections_closed closed radish connections
                # TYPE ratelimiterservice_radish_config_connections_closed counter
                ratelimiterservice_radish_config_connections_closed 1
                # HELP ratelimiterservice_radish_config_connections_created created radish connections
                # TYPE ratelimiterservice_radish_config_connections_created counter
                ratelimiterservice_radish_config_connections_created 2
                # HELP ratelimiterservice_radish_config_connections_pool_grow total number of radish connections opened to handle increased load
                # TYPE ratelimiterservice_radish_config_connections_pool_grow counter
                ratelimiterservice_radish_config_connections_pool_grow 0
                # HELP ratelimiterservice_radish_config_connections_pool_shrink total number of radish connections closed by shrink
                # TYPE ratelimiterservice_radish_config_connections_pool_shrink counter
                ratelimiterservice_radish_config_connections_pool_shrink 0
                # HELP ratelimiterservice_radish_config_connections_total radish connections pool current size
                # TYPE ratelimiterservice_radish_config_connections_total gauge
                ratelimiterservice_radish_config_connections_total 1
                # HELP ratelimiterservice_radish_config_dial_attempts total number of radish dial attempts
                # TYPE ratelimiterservice_radish_config_dial_attempts counter
                ratelimiterservice_radish_config_dial_attempts 2
                # HELP ratelimiterservice_radish_config_errors_count radish client errors count
                # TYPE ratelimiterservice_radish_config_errors_count counter
                ratelimiterservice_radish_config_errors_count 0
                # HELP ratelimiterservice_radish_config_master_reconnects number of reconnects to new radish master
                # TYPE ratelimiterservice_radish_config_master_reconnects counter
                ratelimiterservice_radish_config_master_reconnects 1
                # HELP ratelimiterservice_radish_config_message_count number of radish pubsub messages
                # TYPE ratelimiterservice_radish_config_message_count counter
                ratelimiterservice_radish_config_message_count 0
                # HELP ratelimiterservice_radish_config_read responses read from radish
                # TYPE ratelimiterservice_radish_config_read counter
                ratelimiterservice_radish_config_read 4
                # HELP ratelimiterservice_radish_config_resolve_count number of radish master success resolve attempts
                # TYPE ratelimiterservice_radish_config_resolve_count counter
                ratelimiterservice_radish_config_resolve_count 1
                # HELP ratelimiterservice_radish_config_resubscribe_count number of radish resubscribe events
                # TYPE ratelimiterservice_radish_config_resubscribe_count counter
                ratelimiterservice_radish_config_resubscribe_count 0
                # HELP ratelimiterservice_radish_config_retries_count number of radish request retries
                # TYPE ratelimiterservice_radish_config_retries_count counter
                ratelimiterservice_radish_config_retries_count 0
                # HELP ratelimiterservice_radish_config_send requests sent to radish
                # TYPE ratelimiterservice_radish_config_send counter
                ratelimiterservice_radish_config_send 4
                # HELP ratelimiterservice_radish_config_subscribe_count number of radish subscribe events
                # TYPE ratelimiterservice_radish_config_subscribe_count counter
                ratelimiterservice_radish_config_subscribe_count 0
                # HELP ratelimiterservice_radish_config_unexpected_responses_count radish client invalid responses count
                # TYPE ratelimiterservice_radish_config_unexpected_responses_count counter
                ratelimiterservice_radish_config_unexpected_responses_count 0
                # HELP ratelimiterservice_radish_config_unresolve_count number of radish master fail resolve attempts
                # TYPE ratelimiterservice_radish_config_unresolve_count counter
                ratelimiterservice_radish_config_unresolve_count 0
                # HELP ratelimiterservice_radish_connection_status connection to radish status (0 - off, 1 - on)
                # TYPE ratelimiterservice_radish_connection_status gauge
                ratelimiterservice_radish_connection_status 1
                # HELP ratelimiterservice_radish_connections_broken total number broken radish connections
                # TYPE ratelimiterservice_radish_connections_broken counter
                ratelimiterservice_radish_connections_broken 1
                # HELP ratelimiterservice_radish_connections_closed closed radish connections
                # TYPE ratelimiterservice_radish_connections_closed counter
                ratelimiterservice_radish_connections_closed 23
                # HELP ratelimiterservice_radish_connections_created created radish connections
                # TYPE ratelimiterservice_radish_connections_created counter
                ratelimiterservice_radish_connections_created 43
                # HELP ratelimiterservice_radish_connections_pool_grow total number of radish connections opened to handle increased load
                # TYPE ratelimiterservice_radish_connections_pool_grow counter
                ratelimiterservice_radish_connections_pool_grow 0
                # HELP ratelimiterservice_radish_connections_pool_shrink total number of radish connections closed by shrink
                # TYPE ratelimiterservice_radish_connections_pool_shrink counter
                ratelimiterservice_radish_connections_pool_shrink 0
                # HELP ratelimiterservice_radish_connections_total radish connections pool current size
                # TYPE ratelimiterservice_radish_connections_total gauge
                ratelimiterservice_radish_connections_total 20
                # HELP ratelimiterservice_radish_dial_attempts total number of radish dial attempts
                # TYPE ratelimiterservice_radish_dial_attempts counter
                ratelimiterservice_radish_dial_attempts 43
                # HELP ratelimiterservice_radish_errors_count radish client errors count
                # TYPE ratelimiterservice_radish_errors_count counter
                ratelimiterservice_radish_errors_count 4
                # HELP ratelimiterservice_radish_master_reconnects number of reconnects to new radish master
                # TYPE ratelimiterservice_radish_master_reconnects counter
                ratelimiterservice_radish_master_reconnects 2
                # HELP ratelimiterservice_radish_message_count number of radish pubsub messages
                # TYPE ratelimiterservice_radish_message_count counter
                ratelimiterservice_radish_message_count 0
                # HELP ratelimiterservice_radish_read responses read from radish
                # TYPE ratelimiterservice_radish_read counter
                ratelimiterservice_radish_read 45403
                # HELP ratelimiterservice_radish_resolve_count number of radish master success resolve attempts
                # TYPE ratelimiterservice_radish_resolve_count counter
                ratelimiterservice_radish_resolve_count 2
                # HELP ratelimiterservice_radish_resubscribe_count number of radish resubscribe events
                # TYPE ratelimiterservice_radish_resubscribe_count counter
                ratelimiterservice_radish_resubscribe_count 0
                # HELP ratelimiterservice_radish_retries_count number of radish request retries
                # TYPE ratelimiterservice_radish_retries_count counter
                ratelimiterservice_radish_retries_count 1
                # HELP ratelimiterservice_radish_send requests sent to radish
                # TYPE ratelimiterservice_radish_send counter
                ratelimiterservice_radish_send 45405
                # HELP ratelimiterservice_radish_subscribe_count number of radish subscribe events
                # TYPE ratelimiterservice_radish_subscribe_count counter
                ratelimiterservice_radish_subscribe_count 0
                # HELP ratelimiterservice_radish_unexpected_responses_count radish client invalid responses count
                # TYPE ratelimiterservice_radish_unexpected_responses_count counter
                ratelimiterservice_radish_unexpected_responses_count 0
                # HELP ratelimiterservice_radish_unresolve_count number of radish master fail resolve attempts
                # TYPE ratelimiterservice_radish_unresolve_count counter
                ratelimiterservice_radish_unresolve_count 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_get_paym_account_transaction_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_get_paym_account_transaction_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_get_paym_account_transaction_service_SECOND 5
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_get_paym_account_transaction_service_devpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_get_paym_account_transaction_service_devpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_get_paym_account_transaction_service_devpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_private_package_option_send_mod_info_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_private_package_option_send_mod_info_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_private_package_option_send_mod_info_service_SECOND 50
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_private_package_option_send_mod_info_service_devpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_private_package_option_send_mod_info_service_devpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_private_package_option_send_mod_info_service_devpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_get_level_remains_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_get_level_remains_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_get_level_remains_service_SECOND 250
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_get_level_remains_service_devpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_get_level_remains_service_devpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_get_level_remains_service_devpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_level_data_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_level_data_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_level_data_service_SECOND 5
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_level_data_service_devpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_level_data_service_devpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__sbercard_srv_level_data_service_devpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_MINUTE Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_MINUTE gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_MINUTE 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_CI03242266_DEV_pcap_MINUTE Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_CI03242266_DEV_pcap_MINUTE gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_CI03242266_DEV_pcap_MINUTE 10
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_CI04234301_IFT_gpbift_MINUTE Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_CI04234301_IFT_gpbift_MINUTE gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_CI04234301_IFT_gpbift_MINUTE 3
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_MINUTE Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_MINUTE gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_MINUTE 1
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_efs_MINUTE Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_efs_MINUTE gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_devpoint_devpoint_prefix__test_service_devpoint_rls_cert_cn_efs_MINUTE 5
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_get_paym_account_transaction_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_get_paym_account_transaction_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_get_paym_account_transaction_service_SECOND 5
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_get_paym_account_transaction_service_iftpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_get_paym_account_transaction_service_iftpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_get_paym_account_transaction_service_iftpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_private_package_option_send_mod_info_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_private_package_option_send_mod_info_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_private_package_option_send_mod_info_service_SECOND 50
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_private_package_option_send_mod_info_service_iftpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_private_package_option_send_mod_info_service_iftpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_private_package_option_send_mod_info_service_iftpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_get_level_remains_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_get_level_remains_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_get_level_remains_service_SECOND 250
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_get_level_remains_service_iftpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_get_level_remains_service_iftpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_get_level_remains_service_iftpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_level_data_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_level_data_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_level_data_service_SECOND 5
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_level_data_service_iftpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_level_data_service_iftpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_iftpoint_iftpoint_prefix__sbercard_srv_level_data_service_iftpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_get_paym_account_transaction_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_get_paym_account_transaction_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_get_paym_account_transaction_service_SECOND 5
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_get_paym_account_transaction_service_ntpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_get_paym_account_transaction_service_ntpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_get_paym_account_transaction_service_ntpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_private_package_option_send_mod_info_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_private_package_option_send_mod_info_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_private_package_option_send_mod_info_service_SECOND 50
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_private_package_option_send_mod_info_service_ntpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_private_package_option_send_mod_info_service_ntpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_private_package_option_send_mod_info_service_ntpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_get_level_remains_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_get_level_remains_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_get_level_remains_service_SECOND 250
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_get_level_remains_service_ntpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_get_level_remains_service_ntpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_get_level_remains_service_ntpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_level_data_service_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_level_data_service_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_level_data_service_SECOND 5
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_level_data_service_ntpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_level_data_service_ntpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__sbercard_srv_level_data_service_ntpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_SECOND 0
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_ntpoint_rls_cert_cn_00CA0001CSOWAMODINFO_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_ntpoint_rls_cert_cn_00CA0001CSOWAMODINFO_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_ntpoint_rls_cert_cn_00CA0001CSOWAMODINFO_SECOND 100
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_ntpoint_rls_cert_cn_CI03242266_DEV_pcap_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_ntpoint_rls_cert_cn_CI03242266_DEV_pcap_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_ntpoint_rls_cert_cn_CI03242266_DEV_pcap_SECOND 200
                # HELP ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_ntpoint_rls_cert_cn_SECOND Metric with settings (shows the value of the limits for a specific key)
                # TYPE ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_ntpoint_rls_cert_cn_SECOND gauge
                ratelimiterservice_rate_limit_ci03056952_edevgeni_gpb_dev_rl_endpoint_ntpoint_ntpoint_prefix__srvgetpprbcardhistory_ntpoint_rls_cert_cn_SECOND 0
                # HELP ratelimiterservice_rate_limit_success_requests Number of successful requests to rate limiter
                # TYPE ratelimiterservice_rate_limit_success_requests counter
                ratelimiterservice_rate_limit_success_requests 0
                # HELP ratelimiterservice_rate_limit_total_requests Total number of requests to rate limiter
                # TYPE ratelimiterservice_rate_limit_total_requests counter
                ratelimiterservice_rate_limit_total_requests 0
                # HELP ratelimiterservice_ratelimit_server_ShouldRateLimit_response_time Time spent answering
                # TYPE ratelimiterservice_ratelimit_server_ShouldRateLimit_response_time gauge
                ratelimiterservice_ratelimit_server_ShouldRateLimit_response_time 0
                # HELP ratelimiterservice_ratelimit_server_ShouldRateLimit_total_requests Total number of requests
                # TYPE ratelimiterservice_ratelimit_server_ShouldRateLimit_total_requests counter
                ratelimiterservice_ratelimit_server_ShouldRateLimit_total_requests 111658
                # HELP ratelimiterservice_sender_log_mode log mode (0 Ц off, 1 Ц Kafka, 2 Ц REST)
                # TYPE ratelimiterservice_sender_log_mode gauge
                ratelimiterservice_sender_log_mode 0
                # HELP ratelimiterservice_sender_log_status log sender status (0 Ц OK, 1 Ц ERROR)
                # TYPE ratelimiterservice_sender_log_status gauge
                ratelimiterservice_sender_log_status 0
                # HELP ratelimiterservice_should_rate_limit_backend_error Number of backend cache errors
                # TYPE ratelimiterservice_should_rate_limit_backend_error counter
                ratelimiterservice_should_rate_limit_backend_error 0
                # HELP ratelimiterservice_should_rate_limit_body_size_error Number of errors related to body size limits
                # TYPE ratelimiterservice_should_rate_limit_body_size_error counter
                ratelimiterservice_should_rate_limit_body_size_error 0
                # HELP ratelimiterservice_should_rate_limit_legacy_req_conversion_error Number of errors when converting legacy requests into actual requests
                # TYPE ratelimiterservice_should_rate_limit_legacy_req_conversion_error counter
                ratelimiterservice_should_rate_limit_legacy_req_conversion_error 0
                # HELP ratelimiterservice_should_rate_limit_legacy_resp_conversion_error Number of errors when converting actual responses to legacy responses
                # TYPE ratelimiterservice_should_rate_limit_legacy_resp_conversion_error counter
                ratelimiterservice_should_rate_limit_legacy_resp_conversion_error 0
                # HELP ratelimiterservice_should_rate_limit_legacy_should_rate_limit_error Number of limiter errors for legacy requests
                # TYPE ratelimiterservice_should_rate_limit_legacy_should_rate_limit_error counter
                ratelimiterservice_should_rate_limit_legacy_should_rate_limit_error 0
                # HELP ratelimiterservice_should_rate_limit_modify_header_error Number of ModifyHeader errors
                # TYPE ratelimiterservice_should_rate_limit_modify_header_error counter
                ratelimiterservice_should_rate_limit_modify_header_error 0
                # HELP ratelimiterservice_should_rate_limit_reconnect_error Counts failed processing of grpc connect to rlcontroller
                # TYPE ratelimiterservice_should_rate_limit_reconnect_error counter
                ratelimiterservice_should_rate_limit_reconnect_error 1
                # HELP ratelimiterservice_should_rate_limit_service_error Number of ServiceError errors
                # TYPE ratelimiterservice_should_rate_limit_service_error counter
                ratelimiterservice_should_rate_limit_service_error 111658
                # HELP ratelimiterservice_should_rate_limit_unknown_prefix_error Number of UnknownPrefix errors
                # TYPE ratelimiterservice_should_rate_limit_unknown_prefix_error counter
                ratelimiterservice_should_rate_limit_unknown_prefix_error 111658
                # HELP ratelimiterservice_should_rate_limit_url_mask_appled_error Number of UrlMaskAppledError errors
                # TYPE ratelimiterservice_should_rate_limit_url_mask_appled_error counter
                ratelimiterservice_should_rate_limit_url_mask_appled_error 0
                # HELP ratelimiterservice_should_rate_limit_url_mask_error Number of UrlMaskError errors
                # TYPE ratelimiterservice_should_rate_limit_url_mask_error counter
                ratelimiterservice_should_rate_limit_url_mask_error 0
                """);
    }
}
