//Write a program ReplaceTester that encodes a string by replacing all letters "i" with "!" and all letters "s"
// with "$". Use the replace method. Demonstrate that you can correctly encode the string "Mississippi".
// Print both the actual and expected result.
public class A3 {
    public static void main(String[] args) {
        String str=new String("Mississippi");
        str = str.replace('i','!');
        str = str.replace('s','$');
        System.out.println("result = "+str);
        System.out.println("expected result = M!$$!$$!pp!");

    }
}
