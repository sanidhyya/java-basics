public class removeOccurence {
    public static void main(String[] args) {
        String x = "Spiderslies";
        String str = x.toUpperCase();
        char y[] = str.toCharArray();
        int size = str.length();
        char key = 'S';

        int i = 0;
        String res = "";
        while(i !=size){
            if(y[i] != key){
                res = res + y[i];
            }
            ++i;
        }
        System.out.println(res);
        
    }
}
