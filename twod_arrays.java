import java.util.Scanner;

public class twod_arrays {
    // This part is of reversing the element.
    /*public int revD(int x){
        int rev= 0;
        int rem;
        while(x!=0){
        rem = x %10;
        rev = rev*10+rem;
        x = x/10;
    }
        return rev;
    }*/
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                  arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }*/

        // Searching in Matrix
       /*  Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                  arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j]== x){
                    System.out.println(+i+","+j);
                }
            }
          
        }*/
        /*
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                  arr[i][j] = sc.nextInt();
            }
        }
        // normal matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // transpose matrix
       //To print transpose
      for(int j=0; j<cols ;j++) {
        for(int i=0; i<rows; i++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
*/

/*Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int sum = 0;
        int sum1 = 0;
        int [][] arr = new int [rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                  arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        // finding the sum of left diagonal of an matrix
        if(i==j){
            sum = sum +arr[i][j];
        }
    }
}
System.out.println(sum);    
System.out.println("enter the order of the matrix");
    int order = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // sum Of  right diagonal 
                if(i+j==order-1){
                    sum1 = sum1 + arr[i][j];
                }
            }
        }
        System.out.println(sum1);*/


        // SWAPPING THE DIAGONAL ELEMENTS
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the order of matrix");
        int n = sc.nextInt();
        int [][] arr = new int [n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                  arr[i][j] = sc.nextInt();
            }
        }
        // normal matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // Interchanged Matrix
        for (int i = 0; i < n; i++) {
        int temp = arr[i][i];
        arr[i][i] = arr[i][n-1-i];
        arr[i][n-1-i] = temp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/

        // REVERSING THE ELEMENTS OF THE 2-D ARRAY.

        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the order of matrix");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                  arr[i][j] = sc.nextInt();
            }
        }
       
        twod_arrays obj = new twod_arrays();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(obj.revD(arr[i][j])+" ");
            }
            System.out.println();
        }*/
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int [rows][cols];
        for(int i = 0 ; i< rows ; i++){
            for(int j = 0 ; j<cols ; j++){
             arr[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       
        for (int i = 0; i < rows; i++) {
            int sum =0;
            for (int j = 0; j <cols; j++) {
                sum = sum+arr[j][i];
            }
            System.out.println(sum);
        }
      
    }
}
