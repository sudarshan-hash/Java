
// In this section we learn about te array and arrayList

import java.io.PrintStream;
import java.util.*;

class array{
    public  static  void  main(String[] args){

        // Array is fixed size and same type value
        int[] array=new int[5]; // So length is 5
        // Another way to writ an array is we know the element and length
        int [] Array={2,56,78,32,56,645,21};
        // So for access by using the index value
        System.out.println(Array[2]);  // Output is 78
        // for updating value or add value
        array[0]=45; array[1]=34; array[2]=32; array[3]=67; array[4]=776;

        // Traversing using For-Each loop only for array in java
        for (int x:array){ System.out.println(x);}
        // Traversing using For loop
        for (int k : Array) {
            System.out.println(k);
        }
           /* So diff bet for-each and for is that in for loop we access by the
           index value and for-each loop we don't  required index value */

        // -- Practice Question Reverse an Array ---

        int[] reverse=new int[Array.length];
        for(int i=Array.length-1,j=0;i>=0;i--){
            reverse[j]=Array[i];
            System.out.println(Array[j]+" "+reverse[j]);
            j++;
        }

    }
}


// --------------------------- Array Finding Second Largest Number  ---------------------------------

class array{
    public  static void main(String[] args){
        int[] Array ={ 100,23,435,45,435};

        int FirstLargest , SecondLargest , ThiredLargest;

        FirstLargest=SecondLargest=Integer.MIN_VALUE; //Set some value to var

        for(int i=0;i<Array.length;i++){
            if (Array[i]>FirstLargest){
                // ThiredLargest=SecondLargest;
                SecondLargest=FirstLargest; // before updating FirstValue Stored it  into SecondValue
                FirstLargest=Array[i];
            } else if ( Array[i]>SecondLargest && Array[i]!=FirstLargest) {
                SecondLargest=Array[i];
            }
        }
        System.out.println("FirstValue: "+FirstLargest);
        System.out.println("SecondValue: "+SecondLargest);
        // System.out.println("ThiredValue: "+ThiredLargest);

    }
}