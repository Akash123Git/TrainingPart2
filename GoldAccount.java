public class GoldAccount extends Account {

    public GoldAccount(String owner, double balance, double creditLimit) {
        super(owner, balance);
        this.creditLimit = creditLimit;
    }

    public void print() {
        System.out.println("your balance is: "+super.balance);
    }

    double creditLimit;

    public void deposit(double amount) {
        super.balance += amount;
        System.out.println(amount + " amount has been added to your account, balance is: " + super.balance);
    }

    public void withdraw(double amount) {
        double check=super.balance;
        double declare=check-amount;
        if(declare<=0){
            System.out.println("cannot withdraw !!");
        }else{
            super.balance -= amount;
            System.out.println("an amount of " + amount + " has been deducted from your account, your balance is: "
                    + super.balance);
    }

    }

}
