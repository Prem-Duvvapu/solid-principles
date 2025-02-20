package SolidPrinciples.OpenClosedPrinciple;

/*
## 🔹 O - Open/Closed Principle (OCP)  
**Software entities should be open for extension but closed for modification.**  
👉 Extend functionality via inheritance or interfaces without modifying existing code. 
*/

//violates OCP
public class PaymentProcessor {
    public void processPayment(String PaymentType) {
        if (PaymentType.equals("CreditCard")) {
            System.out.println("Processing credit card....");
        } else if (PaymentType.equals("DebitCard")) {
            System.out.println("Processing debit card...");
        }
    }
}

//follows OCP
interface Payment {
    public void process();
}

class CreditCardPayment implements Payment {
    public void process() {
        System.out.println("Processing credit card...");
    }
}

class DebitCardPayment implements Payment {
    public void process() {
        System.out.println("Processing debit card...");
    }
}

class OCPPaymentProcessor {
    public void processPayment(Payment p) {
        p.process();
    }
}
