package SolidPrinciples.SingleResponsibilityPrinciple;

/* 
## 🔹 S - Single Responsibility Principle (SRP)  
**A class should have only one reason to change.**  
👉 Each class should focus on a single responsibility to improve maintainability.
*/

//violates SRP
public class Report {
    public void generateReport() {
        System.out.println("Generating Report.....");
    }

    public void saveReport() {
        System.out.println("Saving Report......");
    }
}


//follows SRP
class ReportGeneratorSRP {
    public void generateReport() {
        System.out.println("Gnerating Report...");
    }
}

class ReportSaverSRP {
    public void reportSaver() {
        System.out.println("Saving Report...");
    }
}
