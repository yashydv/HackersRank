import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int count=0;
        while (n!=0)
        {
            // This operation reduces length
            // of every sequence of 1s by one.
            n = (n & (n << 1));
 
            count++;
        }
        System.out.println(count);

        scanner.close();
    }

}


