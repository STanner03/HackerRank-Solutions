import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x1=sc.nextInt();
                //Complete this line
                String sp = " ";
                int o = 0;
                while(s1.length() < 15){
                    s1 = s1 + sp;
                }
                if(x1 < 100 && x1 > 9){
                    s1 = s1 + o;
                }
                else if(x1 < 10){
                    s1 = s1 + o + o;
                }
                s1 = s1 + x1;
                System.out.println(s1);
            }
            System.out.println("================================");

    }
}



