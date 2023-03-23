import java.util.*;
public class insertatindex{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int len = sc.nextInt();
        System.out.println("enter the elements of an array");
        int arr[] = new int[60];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to be inserted in array");
        int num = sc.nextInt();
        System.out.println("enter the index where you want to store");
        int index = sc.nextInt();
        for (int i = len; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = num;
        for(int i = 0 ; i<len+1;i++){
        System.out.println(arr[i]);
        }
    }
 
}