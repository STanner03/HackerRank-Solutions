// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        boolean a = sc.hasNext();
        int i = 0;
        while(a == true){
            i++;
            System.out.println(i +" "+ sc.nextLine());
            a = sc.hasNext();
            
        };

        sc.close();
    }
}