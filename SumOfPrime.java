public class SumOfPrime {
    boolean isPrime(int n){
        int c=0;
        for (int i = 1; i <= n; i++) {
            
            if(n%i==0)
            c++;
        }
        if(c==2)
            return true;
        else
            return false;    
    }
    public static void main(String[] args) {
        int sum=0;
        SumOfPrime obj = new SumOfPrime();
        for (int i = 1; i <= 100; i++) {
            if (obj.isPrime(i) ==true) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
