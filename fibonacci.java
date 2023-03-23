import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1;
        int arr[] = new int[n];
        arr[0]=a;
        arr[1]=b;
        System.out.print(arr[0]);
        System.out.print(arr[1]);
        for (int i = 2; i <n; i++) {
           int c = a +b;
           arr[i] = c;
           System.out.print(arr[i]+" ");
           a = b;
           b = c ;
        
        }
    }
}
