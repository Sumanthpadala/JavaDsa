import java.util.Scanner;
public class pat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>1;i--){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
