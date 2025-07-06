package Abstraction;

public class user extends Account  {
    final  String Uname;
    user(String Name){
        this.Uname=Name;
        System.out.println("Welcome in our Bank Family "+this.Uname);
    }
    @Override
    public void withdraw(float amount) {
        float Amount=super.getAmount();
        if (amount<=Amount){
            Amount-=amount;
            super.setAmount(Amount);
            super.History.add("WithDraw Amount:"+amount);
            System.out.println("withdraw Successful  Amount is "+amount);
        }
        else {
            System.out.println("You Not The Sufficient Balanced");
            System.out.println("withdraw Failed");

        }
    }

    @Override
    public void AddMoney(float amount) {
        if (amount>=0){

            super.setAmount(amount+super.getAmount());
            super.History.add("Add Amount:"+amount);
        }
        else {
            System.out.println("Please Enter The Valid amount");
        }
    }

    @Override
    public void SendMoney(float amount, long BankNumber) {
        float Amount=super.getAmount();
        if (amount<=Amount){
            Amount-=amount;
            super.setAmount(Amount);
            super.History.add("Send Amount:"+amount+" To Account "+BankNumber);
            System.out.println("Transaction Successful to "+BankNumber+" Sendable Amoount is "+amount);
        }
        else {
            System.out.println("You Not The Sufficient Balanced");
            System.out.println("Transaction Failed");

        }
    }

    @Override
    public void CheckBalnced() {
        System.out.println("Your Amount: "+super.getAmount());
    }

    @Override
    public void History() {
        System.out.println(" Hi "+ Uname +" History off Your Account");
        for( Object val : super.History){
            System.out.println(val);
        }

    }
}
