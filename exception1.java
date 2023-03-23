public class exception1{
    static void validate(int age){
    if(age<18)
    throw new ArithmeticException("notvalid");
    else
    System.out.println("welcometovote");
    }
    public static void main(String args[]){
    validate(13);
    System.out.println("restofthecode...");
    }
    }