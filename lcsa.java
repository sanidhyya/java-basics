public class lcsa {
    public int findTheNumber(int arr[] , int n){
                int sum = (n*(n+1))/2;
                for (int i = 0; i < arr.length; i++) {
                    sum = sum - arr[i];
                }            
                return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,9};
        lcsa obj = new lcsa();
        System.out.println(obj.findTheNumber(arr, arr.length+1));
    }
}
