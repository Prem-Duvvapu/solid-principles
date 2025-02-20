package SolidPrinciples.InterfaceSegregationPrinciple;

//violates ISP
interface RestaurantEmployee {
    public void takeOrder();
    public void cookFood();
    public void takeSalary();
}

class RestaurantServer implements RestaurantEmployee {
    public void takeOrder() {
        System.out.println("Taking order...");
    }

    //RestuarantServer is forced to implement cookFood which is not his work.
    public void cookFood() {

    }

    public void takeSalary() {
        System.out.println("taking Salary....");
    }
}

class RestaurantChef implements RestaurantEmployee {
    //RestuarantChef is forced to implement takeOrder which is not his work
    public void takeOrder() {

    }

    public void cookFood() {
        System.out.println("Cooking Food... ");
    }

    public void takeSalary() {
        System.out.println("taking Salary....");
    }
}

//Follows ISP
interface RestaurantEmployeeISP {
    public void takeSalary();
}

class RestaurantServerISP implements RestaurantEmployeeISP {
    public void takeSalary() {
        System.out.println("Taking salary...");
    }

    public void takeOrder() {
        System.out.println("Taking order...");
    }
}

class RestaurantChefISP implements RestaurantEmployeeISP {
    public void takeSalary() {
        System.out.println("Taking Salary...");
    }

    public void cookFood() {
        System.out.println("Cooking food...");
    }
}
