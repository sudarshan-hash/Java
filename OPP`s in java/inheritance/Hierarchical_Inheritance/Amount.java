package inheritance.Hierarchical_Inheritance;

public class Amount {

     private double amount;

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

}
