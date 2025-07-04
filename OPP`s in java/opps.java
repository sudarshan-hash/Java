
// So this  java folder and file content not opp concept

import java.lang.*;

abstract  class  sum{
    String Name;
    abstract  int Sum(int num1,int num2);
    static void  mul(){
        System.out.println("Regular methis ");
    }

}

class  work extends sum{

    @Override
    int Sum(int num1, int num2) {
        return 0;
    }

}


public class opps   {

    private static int nums=10;
    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        nums = nums;
    }




    public static void  main(String []args){
    sum ab =new work();
    work w=new work();
    System.out.println(ab.Sum(10,20));
    Integer num=10;
    num.floatValue();

    }
}
