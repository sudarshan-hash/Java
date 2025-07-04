package inheritance.Single;


public class CurrentAccount  extends Amount{

    double amount=10;

    CurrentAccount(double amount) {
        super(amount);
    }



    public static void  main(String []args){
        CurrentAccount cu=new CurrentAccount(10000);

        try {
            int c=10/0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }

        cu.withdraw(1032);
        cu.deposite(2000);
        System.out.println(cu.getAmount());



    }

}