import java.util.*;
public class stacks {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j=j-2){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
