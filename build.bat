@echo off
echo Compiling ATM Simulation System...
if not exist bin mkdir bin
javac -d bin src/com/atm/main/ATMApp.java src/com/atm/model/Account.java src/com/atm/service/ATMService.java src/com/atm/util/InputUtil.java
if %errorlevel% equ 0 (
    echo Compilation successful.
    echo.
    echo To run the application:
    echo java -cp bin com.atm.main.ATMApp
) else (
    echo Compilation failed.
)