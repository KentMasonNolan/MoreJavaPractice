package Week3;

import java.util.Scanner;

public class BankAccount {

   private String firstname;
   private String lastname;
   private Double balance;
   int numberOfTransactions = 0;
   private String pin;

    public BankAccount(String firstname, String lastname, String pin) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = 0.0;
        this.pin = pin;

    }

    public void Deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance = balance + depositAmount;
            this.numberOfTransactions++;
        } else {
            System.out.println("Please insert a non-negative amount");
        }
    }

    public void Borrow(double borrowAmount){

        balance=balance-(borrowAmount*1.1);
        this.numberOfTransactions++;

    }

    public void Withdraw(double withdrawAmount){
        if (balance > withdrawAmount){
            balance = balance-withdrawAmount;
            this.numberOfTransactions++;

        }
        else{
            System.out.println("You are trying to withdraw more than your balance. Please try again.");
        }

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Nolan Banking App \nPlease tell me your first name: ");
        String firstname = input.nextLine();
        System.out.println("Please tell me your second name: ");
        String lastname = input.nextLine();

        System.out.println("Please set your pin: ");
        String pin = String.valueOf(input.nextInt());

        BankAccount b1 = new BankAccount(firstname, lastname, pin);
        System.out.println(b1.pin);
        BankAccount b2 = new BankAccount("bob", "nolan", "0000");
        System.out.println(b2.pin);

        System.out.println("We have created your account Nolan Banking. Your current balance is: $" + b1.balance);


        int menu;

        do {
            System.out.println("\nPlease select from the following options: \n");
            System.out.println("1. Deposit \n2. Withdraw \n3. Borrow \n4. Exit");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Please input the amount you would like to deposit: ");
                    double deposit = input.nextDouble();
                    b1.Deposit(deposit);
                    System.out.println("$" + deposit + " has been deposited into your account.");
                    System.out.println("Your current balance is: $" + b1.balance);
                    break;


                case 2:
                    System.out.println("Please input the amount you would like to withdraw: ");
                    double withdraw = input.nextDouble();
                    b1.Withdraw(withdraw);
                    System.out.println("$" + withdraw + " has been withdrawn from your account.");
                    System.out.println("Your current balance is: $" + b1.balance);
                    break;


                case 3:
                    System.out.println("Please input the amount you would like to deposit: ");
                    double borrow = input.nextDouble();
                    b1.Borrow(borrow);
                    System.out.println("$" + borrow + " has been borrowed from the bank.");
                    System.out.println("Your current balance is: $" + b1.balance);
                    break;


                case 4:
                    System.out.println("\nHave a lovely day");

                default:
                    System.out.println("Please enter a valid Option!");
            }

        }while (true);

    }


}
