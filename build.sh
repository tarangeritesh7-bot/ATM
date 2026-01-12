#!/bin/bash
echo "Compiling ATM Simulation System..."
mkdir -p bin
javac -d bin src/com/atm/main/ATMApp.java src/com/atm/model/Account.java src/com/atm/service/ATMService.java src/com/atm/util/InputUtil.java
if [ $? -eq 0 ]; then
    echo "Compilation successful."
    echo ""
    echo "To run the application:"
    echo "java -cp bin com.atm.main.ATMApp"
else
    echo "Compilation failed."
fi