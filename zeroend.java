import java.util.*;
public class zeroend {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int n =  sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0, flag=0;

        int temp[] = new int[n];
        for (int i = 0; i <n; i++) {
            if(arr[i]==0){
                count++;
            }
            else{
                temp[flag] = arr[i];
                flag++;
            }
        }
        for (int k = 0; k < flag; k++) {
            arr[k] = temp[k];
        }
        for (int j = 0; j <flag; j++) {
            System.out.print(arr[j]+" ");
        }
        for (int j = 0; j < count; j++) {
            System.out.print("0 ");
        }
    }
}
