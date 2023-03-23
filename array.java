import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

class array {
	public static void main(String[] args)
	{       
        // LINEAR SEARCH O(n)
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int number = sc.nextInt();
        // int arr[] = new int[size]; 
        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // for (int i = 0; i <size; i++) {
        //     if(arr[i] == number){
        //     System.out.print(i);
        // }
        // }

            //INSERTION 
       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int sizeOfArray = sc.nextInt();
        System.out.println("enter the number to be inserted: ");
        int number = sc.nextInt();
        System.out.println("enter the index at which number need to be inserted: ");
        int indexAt = sc.nextInt();
        int arr[] = new int[50];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(arr[i]);
        }
        for (int i = sizeOfArray; i> indexAt; i--) {
            arr[i] = arr[i-1];
        }
        arr[indexAt] = number;
        System.out.println("After insertion");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(arr[i]);
        }*/

        // DELETION 
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int sizeOfArray = sc.nextInt();
        System.out.println("enter the index at which number need to be deleted: ");
        int indexAt = sc.nextInt();
        
        int arr[] = new int[sizeOfArray];
        System.out.println("enter the array: ");
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr == null || indexAt < 0 || indexAt >= sizeOfArray) 
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(arr[i]);
        }
        for (int i = indexAt; i < sizeOfArray; i++) {
            arr[i] = arr[i+1];
        }
        --sizeOfArray;
        System.out.println("After deletion");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(arr[i]);
        }
    }

    }}
	// //  FINDING MINIMUM AND MAXIMUM IN AN ARRAY
    //   int arr[] = {20,100,50,5,90,55,10,15,60,80,1000};
    //   int min = arr[0];
    //   for (int i = 0; i < arr.length; i++) {
    //     if(arr[i]<min){
    //         min = arr[i];
    //     } 
    //   }
    //   System.out.println(min);


        // REMOVE DUPLICACY FROM AN ARRAY
    /*int arr1[] = {2,2,2,3,3,4,7,8};
        int temp[] = new int[arr1.length];
        int j = 0;
        for (int i = 0; i < temp.length-1; i++) {
            if(arr1[i]!=arr1[i+1]){
                temp[j++]= arr1[i];
                
            }
        }    
       temp[j++] = arr1[arr1.length-1]; 
        for(int k = 0 ; k<j ; k++ ){
            System.out.println(temp[k]);
        }*/
        //reverse the array
        
              /* 
                int[] arr = {1789, 2035, 1899, 1456, 2013,1458, 2458, 1254, 1472, 2365,1456, 2165, 1457, 2456};
              System.out.println("Original array : "+Arrays.toString(arr));  
               for(int i = 0; i < arr.length/2 ; i++)
              {
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
              }
                System.out.println("Reverse array : "+Arrays.toString(arr));
            }*/