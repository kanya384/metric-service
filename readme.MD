Генерация прото:

protoc -I=src/main/resources/proto --java_out=src/main/java remote.proto
protoc -I=src/main/resources/proto --java_out=src/main/java types.proto
protoc -I=src/main/resources/proto/gogoproto --java_out=src/main/java gogo.proto