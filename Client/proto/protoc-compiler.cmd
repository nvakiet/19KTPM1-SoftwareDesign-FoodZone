set IN_DIR=./
set OUT_DIR=../app/src/main/java/
set BUILD_FILES=(MessageWrapper)

for %%i in %BUILD_FILES% do (
    echo generate cli protocol java code: %%i.proto
    protoc -IPATH=%IN_DIR% --java_out=lite:%OUT_DIR% %%i.proto
)

pause