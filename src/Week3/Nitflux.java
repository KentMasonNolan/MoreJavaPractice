package Week3;

public class Nitflux {
    String email;
    int months;
    double money;

    public Nitflux(String email, int months, double price) {
        this.email = email;
        this.months = months;
        this.money = computeCustomerPay(this.months, price);
    }

    public double computeCustomerPay(int months, double price) {
        double customerPay;
        customerPay = price * months;
        return customerPay;
    }



    public static void main(String[] args) {
        Nitflux n1 = new Nitflux("Kent.Nolan@gmail.com",6, 12.99);
        Nitflux n2 = new Nitflux("Bob.Bolan@gmail.com",9,12.99);
        Nitflux n3 = new Nitflux("Jim.Jolan@gmail.com",2,12.99);
        System.out.println("Current customers:\n");
        System.out.println("First customer:");
        System.out.println("Customer email address: " + n1.email + " | " + "$"+ n1.money);
        System.out.println("Second customer:");
        System.out.println("Customer email address: " + n2.email + " | " + "$"+ n2.money);
        System.out.println("Third customer:");
        System.out.println("Customer email address: " + n3.email + " | " + "$"+ n3.money);

    }
}