import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
      
     Scanner scanner = new Scanner(System.in);

    
        double mc = scanner.nextDouble();
        
        int tip_p = scanner.nextInt();
        
        int tax_p = scanner.nextInt();

        
        double tip = mc * tip_p / 100;
        double tax = mc * tax_p / 100;
        
         double  tc = (mc + tip + tax);
        


     System.out.println(Math.round(tc));
      
       
    }
}
