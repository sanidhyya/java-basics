import java.util.*;
public class neerja {
    public static void main(String[] args){
        int r,c,avgLow,avgHigh, count=0;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        int passenger[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                passenger[i][j] = sc.nextInt();
            }
        }
        avgHigh = sc.nextInt();
        avgLow = sc.nextInt();
        for (int i = 0; i < r; i++) {
            int total= 0;
            for (int j = 0; j < c; j++) {
                total += passenger[i][j];
            }
            float avgRowAge = (float) total/c;
            if(avgRowAge>avgLow && avgRowAge<avgHigh){
                count++;
            }
        }
        System.out.println(count);
    }    
}
