public class banka{
    public static void main(String[] args) {
int n=3;
        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 2*n-1; j >= 1; j--) {
                if(j>i){
                    System.out.print(" ");
                }
                else{
                    if(j>n){
                        System.out.print(2*n-j);
                    }
                    else{
                        System.out.print(j);
                    }
                }
            }
            for(int j=2;j<=i;j++){
                if(j<n){
                    System.out.print(j);
                }
                else{
                    System.out.print(2*n-j);
                }
            }
            System.out.println();
        }
   }
}