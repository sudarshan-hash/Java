package Abstraction;

import java.util.Vector;

abstract class Account {
    private float Amount=0;
    Vector<Object> History=new Vector<>();
    public abstract void withdraw(float amount);
    public abstract void AddMoney(float amount);
    public abstract void SendMoney(float amount, long BankNumber);
    public abstract void CheckBalnced();
    public abstract void History();

    public final float getAmount() {
        return Amount;
    }
    public final void setAmount(float amount) {
        Amount = amount;
    }
}
