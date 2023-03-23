public class q3{
    public static void main(String[] args) {
        int n =153;
        int temp = n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum= sum + rem*rem*rem;
            
        }
        if(temp == sum){
            System.out.println( "Armstrong number");
        }else{
            System.out.println("not armstrong");
        }
    }
}