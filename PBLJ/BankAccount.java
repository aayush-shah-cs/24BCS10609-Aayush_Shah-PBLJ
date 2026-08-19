

class BankDetails{
    private String username;
    private double balance;

    public BankDetails(String name,double balance_amount){
        username = name;
        balance  = balance_amount;
    }

    public double getBalance(){
        return balance;
    }

    public double Deposit(double amount ){
        if(amount > 0){
            balance += amount;
        }
        else{
            System.out.println("Invalid amount");
        }
        return balance;
    }

    public double withdraw(double amount){
        if(balance >= 0 && amount > 0){
            balance -= amount;
        }
        else{
            System.out.println("Invalid amount");
        }
        return balance;
    }

    public String getname(){
        return username;
    }

    public double getbalance(){
        return balance;
    }

}

public class BankAccount {
    public static void main(String[] args){
        BankDetails bd = new BankDetails("Aayush shah",1000.00);
        System.out.println("Account holder name : " + bd.getname());
        System.out.println("Account balance : " + bd.getbalance());
        bd.withdraw(200);
        System.out.println("Amount after withdrawal : " + bd.getbalance());
    }
}
