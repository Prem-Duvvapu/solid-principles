package SolidPrinciples.DependencyInversionPrinciple;

/*
 ## 🔹 D - Dependency Inversion Principle (DIP)  
**High-level modules should not depend on low-level modules.**  
👉 Depend on abstractions (interfaces) rather than concrete implementations. 
 */

//violates DIP
class WiredKeyboard {
    public void connect() {
        System.out.println("Wired Keyboard connected...");
    }
}

public class Computer {
    private WiredKeyboard keyboard;

    Computer(WiredKeyboard keyboard) {
        this.keyboard=keyboard;
    }

    public void connectKeyboard() {
        keyboard.connect();
    }
}

//follows DIP
interface KeyboardDIP {
    public void connect();
}

class WiredKeyboardDIP implements KeyboardDIP {
    public void connect() {
        System.out.println("Wired keyboard connected...");
    }
}

class WirelessKeyboardDIP implements KeyboardDIP {
    public void connect() {
        System.out.println("Wireless keyboard connected...");
    }
}

class ComputerDIP {
    private KeyboardDIP keyboard;

    ComputerDIP(KeyboardDIP keyboard) {
        this.keyboard=keyboard;
    }

    public void connectKeyboard() {
        keyboard.connect();
    }
}