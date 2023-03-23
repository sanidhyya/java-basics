import java.util.*;
class GoldenNumber {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int a,b;
        int i=0;
        int sum=0;
        a=ob.nextInt();
        b=ob.nextInt();
        for(i=a;i<=b;i++)
        {
        int max=-1,s=0;
        int t=i;
        while(t>0)
        {
            int r=t%10;
            if(max<r)
            {
                max=r;
            }
            s=s+r;
            t=t/10;
        }
        s=s-max;
        if(s==max)
            {
                sum= sum;
            }
            else
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
    
}