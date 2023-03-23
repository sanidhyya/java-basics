public class q20 {
    public static void main(String args[]){
        String str= "chef";
        char arr[]=str.toCharArray();
        if(arr.length%2==0){
        for(int i=0;i<arr.length-1;i=i+2){
        char temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
        }
        }
        else {
        for(int i=0;i<arr.length-2;i=i+2){
        char temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
        }
        }
        System.out.println(arr);
        for(int i=0;i<str.length();i++){
        for(int j=0;j<=26;j++){
        if(arr[i]== (char)(97+j)){
            arr[i]=(char)(122-j);
            break;
        }
        }
        }
        System.out.println(arr);
        }
    }
