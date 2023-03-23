public class xylem {
    public static void main(String[] args) {
        int n=343263;
        int temp=n;
        int inner_sum=0;
        int outer_sum=0;

        while(temp!=0){
            if(temp==n||temp<10){
                outer_sum=outer_sum+temp%10;
            }
            else{
                inner_sum=inner_sum+temp%10;
            }
            temp=temp/10;
        }
        if(outer_sum==inner_sum){
            System.out.println("xylem");
        }
        else{
            System.out.println("phloem");
        }
    }
}
