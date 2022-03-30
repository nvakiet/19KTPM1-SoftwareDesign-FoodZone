set IN_DIR=./
set OUT_DIR=../app/src/main/java/
set BUILD_FILES=MessageWrapper.proto
protoc -IPATH=%IN_DIR% --java_out=lite:%OUT_DIR% %BUILD_FILES%