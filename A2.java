//Write a program that initializes a string with "Mississippi". Then replace all "i" with "ii" and print the length
//of the resulting string. In that string, replace all "ss" with "s" and print the length of the resulting string.
public class A2 {
    public static void main(String[] args) {
    String str=new String("Mississippi");
    str = str.replaceAll("i","ii");
    System.out.println(str);
    System.out.println("len = "+str.length());
    str = str.replaceAll("ss","s");
    System.out.println(str);
    System.out.println("len = "+str.length());

    }
}
