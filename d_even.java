import java.util.Scanner;

public class d_even
{
    public static void main(String[] args) 
    {
        // initializing array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,10, 11};
        System.out.print("Array before removing even numbers: ");
        printArray(arr);
        int[] result = removeEven(arr);
        // print the array
        System.out.print("\nArray after removing even numbers: ");
        printArray(result);
    }

    public static void printArray(int[] result) 
    {
        for (int i : result)
            System.out.print(i + " ");
    }

    public static int[] removeEven(int[] arr) 
    {
        // count number of odd numbers in the array
        int odd_count = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] % 2 != 0) 
            {
                odd_count++;
            }
        }
        // initialize new array with size of odd_count
        int[] result = new int[odd_count];
        int index = 0;
        // copy all odd numbers to the new array
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] % 2 != 0) 
            {
                result[index++] = arr[i];
            }
        }
        return result;
    }
}