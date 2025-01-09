

// ------ Code for  cheking the Vowels and Consonants of given char by using the string Regular Expression ------- \\

 import java.util.*;
 class vowelsCheck{
     public static void main(String[] args){
         Scanner input=new Scanner(System.in); // Input object
         System.out.println("Hello");
         System.out.println("Enter the Char");
         String str=input.nextLine();

         // Checking the input char is in between [aeiouAEIOU] by using "matches()" method ----
         // The  expression "[]" use the check the presence the single char in give char

         boolean str1=str.matches("[aeiouAEIOU]");

         // IF-ELSE Stat

         if (str1==true){
             System.out.format("The given letter  %s is Vowel",str);
         }
         else
         {
             System.out.format("The given letter %s is Consonants",str);
         }

     }
 }