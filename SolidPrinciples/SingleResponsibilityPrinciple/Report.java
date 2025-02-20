package SolidPrinciples.SingleResponsibilityPrinciple;

/* 
Violates SRP. If you want to make changes in saveReport you need to modify Report class. A class should have single responsibility.
Here the class has to two responsibilities. Generating Report and Saving Report.
*/

public class Report {
    public void generateReport() {
        System.out.println("Generating Report.....");
    }

    public void saveReport() {
        System.out.println("Saving Report......");
    }
}


//follows SRP
class ReportGenerator {
    public void generateReport() {
        System.out.println("Gnerating Report...");
    }
}

class ReportSaver {
    public void reportSaver() {
        System.out.println("Saving Report...");
    }
}
