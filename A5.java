//The StringBuilder class has a method for reversing a string. In a ReverseTester class, construct a StringBuilder
//from a given string (such as "desserts"), call the reverse method followed by the toString method, and print the
// result. Also print the expected value.
public class A5 {
    public static void main(String[] args) {
        String s ="desserts";
        StringBuilder str=new StringBuilder(s);
        str=str.reverse();
        System.out.println("result = "+str);
        System.out.println("expected result = stressed");

    }

}
