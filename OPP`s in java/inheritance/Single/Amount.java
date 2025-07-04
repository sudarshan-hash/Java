package inheritance.Single;


public class Amount   {

    private double amount;

    Amount(double amount){
        this.amount=amount;
    }

    void deposite(double amount){
        this.amount+=amount;
    }

    void withdraw(double amount){
        if (amount>this.amount){
            System.out.println("Not Sufficient Amount please checked Amount...");
        }
        else {
            this.amount-=amount;
            System.out.println("Reaming Amount in your account: "+this.amount);
        }
    }

    double getAmount(){
        return amount;
    }
    public static void main(String[]args){
        Amount am=new Amount(10000);
        System.out.println(am.getAmount());
    }

}
