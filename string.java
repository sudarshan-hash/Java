import java.util.*;
class string{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="Sudarshan";   //this store in string pool which is inside the heap
        String name= new String("Sudarshan");  //it store in heap
        System.out.println(str == name);  // Why they  are not true??  beacuse == check references(address)  present in stack
        System.out.println(str.equals(name));   // Why They are true beacuse equals() check actual content presrnt in heap
        //  int l=str.length();
        System.out.println("Enter String");
        String space=sc.nextLine();  //Take Input Sudarshan
        System.out.println(space.toLowerCase());
        System.out.println(space.toUpperCase());
        System.out.println(space.length()+" Is Length of your Input");  //For Length
        System.out.println(space.trim());  // For removing Space
        //System.out.println(space.trim()+" After Trime "+space.trim().length()+" Is Length and Final String  "+ space.trim().toLowerCase());
        String sub=space.substring( 2);
        System.out.println(sub);
        System.out.println(space.substring(0,3));  // ending_index=ending_index-1
        String eq="darshan";
        System.out.println(space.substring(2).equals(eq));
        System.out.println(sub.trim().equals("darshan")); // we can write this way also
        System.out.println(space.replace('a','b')); // For replace a old at new char..
        System.out.println(space.endsWith("shan"));  //chaking end string
        System.out.println(space.toLowerCase().startsWith("suda")); //chaking start string

        //System.out.format("My Self %3$s.\n I am %1$d year old and learn in %2$d year Engg at PREC Loni",age,y,str);
    }
}