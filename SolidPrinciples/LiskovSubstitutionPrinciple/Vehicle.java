package SolidPrinciples.LiskovSubstitutionPrinciple;

//violates LSP
interface Vehicle {
    public String getEngineType();
    public int getNumberofWheels();
}

class Motorcycle implements Vehicle {
    public String getEngineType() {
        return "Motor Engine";
    }

    public int getNumberofWheels() {
        return 2;
    }
}

class Bicycle implements Vehicle {
    public String getEngineType() {
        return null;
    }

    public int getNumberofWheels() {
        return 2;
    }
}


//follows LSP
interface VehicleLSP {
    public int getNumberOfVehicles();
}

interface EngineVehicle extends VehicleLSP {
    public String getEngineType();
}

interface NonEngineVehicle extends VehicleLSP {
}

class MotorcycleLSP implements EngineVehicle {
    public String getEngineType() {
        return "Motor Engine";
    }

    public int getNumberOfVehicles() {
        return 2;
    }
}

class BicycleLSP implements NonEngineVehicle {
    public int getNumberOfVehicles() {
        return 2;
    }
}
