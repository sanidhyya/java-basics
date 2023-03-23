public class equillibrium {
    public static void main(String[] args) {
        
    
    int arr[]= {1,6,7,0,7};
    int sum1 = 0;
    int sum2 = 0;
    
    for (int i = 0; i < arr.length; i++) {
        sum1 = sum1 + arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
        sum1 = sum1-arr[i]; 
        if(sum1==sum2){
            System.out.println(i);
        }
        sum2 = sum2 + arr[i];
    }
   
}
}

