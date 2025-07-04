package Practice;


import java.util.Scanner;
import  java.util.Vector;


public class main {

    public static void  main(String[] args){
        System.out.println("Practice");
        int speedLimit=Car.speedLimit;
        Car.SpeedUP(100);
        Scanner sc=new Scanner(System.in);
        Nexon nexon=new Nexon();
        int mode;
        do {
            System.out.println("1:Petrol Mode 2: Battery Mode 3:Exit");
             mode=sc.nextInt();
            switch (mode){
                case 1 :
                  System.out.println(nexon.petrol());
                  break;
                case 2 :
                    System.out.println(nexon.Battery());
                    break;
                case 3:
                    break;
            }
        }while (mode!=3);
    }

}
