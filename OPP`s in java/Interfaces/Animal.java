package Interfaces;

public interface Animal {

     String Name = null;
     abstract void sleep();
     public  void run(String Name);
    default void colour( String Col){
        System.out.println(Col+" This is colour");
    };


     // Static Method
     public  static void sum(){
               System.out.println("This is an sum method");
     }

     //default method: Can be overridden by the implementing class.
    //static method: Belongs to the interface and can’t be overridden

     //Default
     public default void eat(){
          System.out.println("This "+ Name+" is eating.....");
     }

}

