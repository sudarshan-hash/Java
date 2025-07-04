package inheritance.Hierarchical_Inheritance;

public class SavingsAccount extends Amount {

    double amount=super.getAmount();
    SavingsAccount(){
        super.withdraw(1000);
    }

    public static void main(String[] args){
        SavingsAccount sc=new SavingsAccount();
         sc.deposite(10000);
        sc.withdraw(7000);
       // sc.withdraw(567);
        System.out.print(sc.getAmount());

    }
}
