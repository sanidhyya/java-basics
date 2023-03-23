import java.util.Scanner;
public class Spiral1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt();
        int k=1;
        int arr[][] = new int[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                arr[i][j] =0;
            }
        }
        int top = 0;
        int right=n-1;
        int down=0;
        int left=n-1;
        int dir=0;
        while(top<=down && left<=right){
            if(dir==0){
                for (int i = left; i<=right; i++) {
                     arr [top][i]=k;
                    k++;
                }
                top++;
            }
           else if(dir==1){
                for (int i = top; i<=down; i++) {
                     arr [i][right]=k;
                    k++;
                }
                right--;
            }
            else if(dir==2){
                for (int i= right; i>=left; i--) {
                     arr [down][i]=k;
                    k++;
                }
                down--;
            }
            if(dir==3){
                for (int i =down; i>=top; i--) {
                     arr [i][left]=k;
                    k++;
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}