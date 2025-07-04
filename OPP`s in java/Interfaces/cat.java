package Interfaces;

public class cat implements Animal {
        String Name="";
    @Override
    public void sleep() {
        System.out.println("cat is Sleeping.....");
    }
    @Override
    public void run(String Name) {
        this.Name=Name;
        System.out.println(Name+" is Running.....");
    }

    @Override
    public void eat() {
        Animal.super.eat();
    }

   public static void main(String[] args){
        cat obj=new cat();

        obj.run("Cat");
        obj.sleep();
        obj.eat();
        obj.run("Cat");
        Animal.sum();
        obj.eat();
        dog objdog=new dog();
        obj.colour("Black");
   }

}
