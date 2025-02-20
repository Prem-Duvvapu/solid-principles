package SolidPrinciples.LiskovSubstitutionPrinciple;

/*
 ## 🔹 L - Liskov Substitution Principle (LSP)  
**Subtypes must be substitutable for their base types.**  
👉 Derived classes should not break the behavior of the parent class.  
 */

//violates LSP
class Vehicle {
    public String getEngineType() {
        return "Vehicle Engine";
    }

    public int getNumberofWheels() {
        return 4;
    }
}

class Motorcycle extends Vehicle {
    public String getEngineType() {
        return "Motor Engine";
    }

    public int getNumberofWheels() {
        return 2;
    }
}

class Bicycle extends Vehicle {
    //returns null because Bicycle doesn't have any engine. So, Bicycle can't replace Vehicle.
    public String getEngineType() {
        return null;
    }

    public int getNumberofWheels() {
        return 2;
    }
}

//follows LSP
interface VehicleLSP {
    public int getNumberOfWheels();
}

class EngineVehicleLSP implements VehicleLSP {
    public String getEngineType() {
        return "vehicle engine";
    }

    public int getNumberOfWheels() {
        return 4;
    }
}

class NonEngineVehicleLSP implements VehicleLSP {
    public int getNumberOfWheels() {
        return 3;
    }
}

//Here, MotorcycleLSP can replace EngineVehicle
class MotorcycleLSP extends EngineVehicleLSP {
    public String getEngineType() {
        return "Motor Engine";
    }

    public int getNumberOfVehicles() {
        return 2;
    }
}

//Here, BicycleLSP can replace NonEngineVehicle
class BicycleLSP extends NonEngineVehicleLSP {
    public int getNumberOfVehicles() {
        return 2;
    }
}
