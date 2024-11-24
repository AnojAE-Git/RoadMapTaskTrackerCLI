cd ..\
rmdir /S /Q bin
REM By default new json file will be created for each compilation. Comment out the below line if u need to use the same json file with previous data
del res\TaskTracker.json
javac -d bin src\*.java
cd bin