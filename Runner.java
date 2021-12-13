import java.util.HashSet;
import java.util.Scanner;

class Runner {

    public static void main(String[] args) {
        System.out.println("hello");

        Account a = new Account(null, 0);
       

        int choice;
        double amount;
        System.out.println("Welcome to bank");
        Scanner in = new Scanner(System.in);
        while(true){
        System.out.println("choose your account: \n 1.GoldAccount \n 2.PlatinumAccount \n 3.exit");
        choice = in.nextInt();
        if (choice == 1) {
            while(true){
                glodTransaction();
                break;
            }
           
        } else if (choice == 2) {
            while(true){
                platinumTransaction();
                break;
            }
            
        }else if(choice==3){
            System.exit(0);
        } else {
            System.out.println("enter the  proper choice");
        }
    }

    }

    private static void platinumTransaction() {
        int choice;
        Scanner in = new Scanner(System.in);
        double amount;
        PlatinumAccount p = new PlatinumAccount(null, 0);
        while(true){
        System.out.println("1.deposit \n 2.withdraw \n 3.printmybalance \n 4:exit ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter your amount to deposit:\n");
                    amount = in.nextDouble();
                    p.deposit(amount);
                    break;
                case 2:
                    System.out.println("enter the amount to withdraw:\n");
                    amount = in.nextDouble();
                    p.withdraw(amount);
                    break;
                case 3:
                    System.out.println("Printing your balance....");
                    p.print();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Enter proper choice!!");
                    break;

            }
        }
    }

    private static void glodTransaction() {
        int choice;
        Scanner in = new Scanner(System.in);
        double amount;
        GoldAccount g = new GoldAccount(null, 0, 0);
        while(true){
        System.out.println("1.deposit \n 2.withdraw \n 3.printmybalance \n 4.exit");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter your amount to deposit:\n");
                amount = in.nextDouble();
                g.deposit(amount);
                break;
            case 2:
                System.out.println("enter the amount to withdraw:\n");
                amount = in.nextDouble();
                g.withdraw(amount);
                break;
            case 3:
                System.out.println("Printing your balance....");
                g.print();
                break;
            case 4:
                return;
            default:
                System.out.println("Enter proper choice!!");
                break;
        }
    }
    }

}