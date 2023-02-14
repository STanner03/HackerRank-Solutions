import java.util.*;
// import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String answer = "";
            int equation = a;
            for(int l=0;l<n;l++){
                int iter = 2;
                for(int m=0;m<=l;m++){
                    if(m == 0){
                        iter = 1;
                    }
                    else if(m == 1){
                        iter = 2;
                    }
                    else{
                        iter = iter * 2;
                    }
                };
                equation = equation + (iter * b);
                answer = answer + equation +" ";
            }
            System.out.println(answer);
        }
        in.close();
    }
}