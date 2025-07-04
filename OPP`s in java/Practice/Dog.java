package Practice;

import java.io.PrintStream;

public class Dog extends Animal{
    @Override
    String eat() {
        return "Dog id Eating";
    }

    String str= super.eat();
    public static void main(String[] args){
        Dog dog=new Dog();
        System.out.println(dog.str);
        System.out.println(dog.eat());
    }
}
