import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String A=scan.next();
        String B=scan.next();
        
        System.out.println(A.length() + B.length());

     if(A.compareTo(B) > 0){
        System.out.println("Yes");
     } else {
        System.out.println("No");
     }

      A = (A.substring(0,1)).toUpperCase() + A.substring(1);       
     B = (B.substring(0,1)).toUpperCase() + B.substring(1);
     System.out.println(A + " " + B);


       
    }
}

   




