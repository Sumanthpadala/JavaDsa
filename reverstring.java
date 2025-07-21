import java.util.Scanner;
public class reverstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res="";
        char[] array=str.toCharArray();
        for(int i=array.length-1;i>=0;i--){
            res+=array[i];
        }
        System.out.println(res);
    }
}
