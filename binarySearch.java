import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    int binary(int arr[] , int key){
        int low =0;
        int high= arr.length-1;
        
        while(low<high){
            int mid = (high+low)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]<key){
                mid = low+1;
                return mid;
            }
            else{
                mid=high-1;
                return mid;
            }
        }
        return -1;
    }
    //{11,22,33,44,56,333,567,899,999,1000}
    public static void main(String[] args) {
            binarySearch obj = new binarySearch();
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < size; i++) {
                 arr[i] = sc.nextInt();
            }
            
            System.out.println(obj.binary(arr, 56));  

    }
}
