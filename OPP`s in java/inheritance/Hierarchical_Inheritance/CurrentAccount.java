package inheritance.Hierarchical_Inheritance;

public class CurrentAccount  extends Amount {

    public static void main(String[] args){
        CurrentAccount cu=new CurrentAccount();
        cu.deposite(1000);
        System.out.print(cu.getAmount());
        cu.withdraw(3000);
        cu.withdraw(200);
    }

}
