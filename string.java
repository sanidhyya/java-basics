import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String str = "Sanidhya";
        String str1= str.toLowerCase(); 
        System.out.println(str1);
            String s1 = "Sanidhya ";
            String s2 = "Rastogi";
            System.out.println(s1.concat(s2));
        String str3 = s1+s2;
        System.out.println(str3);



        // create string using the new keyword
    String example = new String("Hello! World");

    // returns the substring World
    System.out.println("Using the subString(): " + example.substring(7));

    // converts the string to lowercase
    System.out.println("Using the toLowerCase(): " + example.toLowerCase());

    // converts the string to uppercase
    System.out.println("Using the toUpperCase(): " + example.toUpperCase());

    // replaces the character '!' with 'o'
    System.out.println("Using the replace(): " + example.replace('!', 'o'));
    String example1 = "This is the String class";
    System.out.println(example1);
    System.out.println(example.length());
    boolean result = s1.equals(s2);
    System.out.println(result);
    int a= 10;
    int b= 7;
    System.out.println(a>>b);
    int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(array_variable[i][j]);
        }
        System.out.println("");
    }

    }
}
