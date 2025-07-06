package Abstraction;

import java.util.Scanner;

public class main {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
       // Account Sam=new user("Sam");
        user Sudarshan=new user("Sudarshan");
        int choice;
        System.out.println("Welcome in our Bank Statement App "+Sudarshan.Uname);
        System.out.println("======================================================================================");
        System.out.println( " Welcome In You're Account " +Sudarshan.Uname+" \n" +
                " Use Appropriate Choice \n ");
        do {
            System.out.println(
                    "1:Check Balanced \n 2:AddMoney \n 3:withdraw \n 4:SendMoney \n 5:History \n 6: Exit "
            );
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    Sudarshan.CheckBalnced();
                    System.out.println("======================================================================================");
                    break;
                case 2:
                    System.out.println("Enter the Amount for Add ");
                    float am=sc.nextFloat();
                    Sudarshan.AddMoney(am);
                    System.out.println("======================================================================================");
                    break;
                case 3:
                     System.out.println("Enter The Withdraw Amount: ");
                    float Amount =sc.nextFloat();
                    Sudarshan.withdraw(Amount);
                    System.out.println("======================================================================================");
                    break;
                case 4:
                    System.out.println("Enter The Send Amount: ");
                    float amount=sc.nextFloat();
                    System.out.println("Enter The Bank Number of Receiver : ");
                    long AccounrN=sc.nextLong();
                    Sudarshan.SendMoney(amount,AccounrN);
                    System.out.println("======================================================================================");
                    break;
                case 5:
                    Sudarshan.History();
                    System.out.println("======================================================================================");
                    break;
                case 6:
                    System.out.println("Thank You "+Sudarshan.Uname+"Come again...");
                    break;
            }

        }while (choice<6);
    }
}
