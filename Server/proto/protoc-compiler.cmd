set IN_DIR=./
set OUT_DIR=../src/
set BUILD_FILES=(MessageWrapper)

for %%i in %BUILD_FILES% do (
    echo generate cli protocol java code: %%i.proto
    protoc -IPATH=%IN_DIR% --java_out=%OUT_DIR% %%i.proto
)

pause