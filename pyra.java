import java.util.*;
public class pyra {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((i==n || j==i || j==1)?"*"+" ":"  ");
            }
            System.out.println();
            }
        }
    }
    

