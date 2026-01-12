ATM Simulation System

This is a simple ATM simulation application written in Java.

Features:
- Account management with balance and PIN
- Deposit, withdraw, and check balance operations
- Input validation utilities

Building and Running:
1. Using build script (Windows): run build.bat
   Using build script (Linux/Mac): run chmod +x build.sh && ./build.sh
2. Manual compilation: javac -d bin src/com/atm/main/ATMApp.java src/com/atm/model/Account.java src/com/atm/service/ATMService.java src/com/atm/util/InputUtil.java
3. Run: java -cp bin com.atm.main.ATMApp

Sample Account:
- PIN: 1234
- Initial Balance: $1000

Project Structure:
- src/com/atm/main/ATMApp.java: Main application entry point
- src/com/atm/model/Account.java: Account data model
- src/com/atm/service/ATMService.java: Business logic
- src/com/atm/util/InputUtil.java: Input utilities