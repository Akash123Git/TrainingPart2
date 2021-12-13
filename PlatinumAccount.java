public class PlatinumAccount extends Account{

    public PlatinumAccount(String owner, double balance) {
        super(owner, balance);
    }


    double creditLimit=45000;


    public void deposit(double amount) {
        super.balance += amount;
        System.out.println(amount + " amount has been added to your account, balance is: " + super.balance);
    }

    public void withdraw(double amount) {
        double check=super.balance;
        double declare=check-amount;
        double creditcheck=creditLimit;
        System.out.println("\n credit limt in beginning "+creditLimit);
        if(declare<=0){

            if(0>=(creditcheck-declare)){
                System.out.println("cannot withdraw !!");
            }
            else{
                super.balance -= amount;
                creditLimit+=declare;
                System.out.println("credit limt in end "+creditLimit);
                System.out.println("processing amount "+amount+ " balance is : "+super.balance);
            }
            
        }else{
            super.balance -= amount;
            System.out.println("an amount of " + amount + " has been deducted from your account, your balance is: "
                    + super.balance);
    }

    
    }
    public void print() {
        System.out.println("your balance is: "+super.balance);
    }
}
