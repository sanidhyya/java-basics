public class sortings {
    // public static void printArray(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i] +" ");
    //     }    
    //     System.out.println();   
    // }

    /*public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        // bubble sort
         for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
         }
            for (int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }*/


// selection sort
    /*public static void main(String [] args){
        int arr[] = {7,8,3,1,2};
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i ;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        // Insertion sort

        // public static void main(String[] args) {
        //     int arr[] = {7,8,3,2,1};
        //     for (int i = 1; i < arr.length; i++) {
        //         int current = arr[i];
        //         int j = i-1;
        //         while(j>=0 && arr[j]>current){
        //             arr[j+1] = arr[j];
        //             j--;
        //         }
        //         arr[j+1] = current;
        //     }
        //     for (int i = 0; i < arr.length; i++) {
        //         System.out.println(arr[i]);
        //     }
        // }

        // Sorting arrays of 0s 1s and 2s.
        public static void main(String[] args) {
            int count0=0;
            int count1=0;
            int count2=0;
            int arr[] = {0,1,1,0,2,2,1,0,2,2};
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==0){
                    count0++;
                    
                }
                if(arr[i]==1){
                    count1++;
                }
                if(arr[i]==2){
                    count2++;
                }


            }
            int c=0;
            int arr1[] = new int[arr.length];
            for (int i = 0; i < count0; i++) {
                arr1[c] = 0; 
                c++;
            }
            for (int i = 0; i <count1; i++) {
                arr1[c] = 1; 
                c++;
            }
            for (int i = 0; i < count2; i++) {
                arr1[c] = 2; 
                c++;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr1[i]);
            }
            
        }
    }
