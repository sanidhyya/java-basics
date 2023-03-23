import java.util.Arrays;
import java.util.Scanner;

class sort {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
		System.out.println("The original array is: ");
		for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
		Arrays.sort(arr);
		System.out.println("\nThe sorted array is: ");
		for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
