import java.util.Scanner;
public class fat
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
int[][] arr = new int[n][m];
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
arr[i][j] = sc.nextInt();
}
}
int child = 0;
int senior = 0;
int mid = 0;
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
if((i==j || i==0 || j==0 || i==n-1 || j==m-1) && arr[i][j]>18
&& arr[i][j]<60){
mid += 1;
}
else if(arr[i][j]<18){
child += 1;
}
else if(arr[i][j]>60){
senior += 1;
}
}
}
System.out.println("The number of children is: "+child);
System.out.println("The number of senior citizens is: "+senior);
System.out.println("The number of mid aged sitting in the boundaries and diagonals is: "+mid);
}
}
