import java.util.Scanner;

public class ReverseString {

    private String input() {
        System.out.println("Enter string : ");
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String before reversing :");
        System.out.println(s);
        return s;
    }
    private String reverseString(String string) {
        String reverse ="";
        for(int i = string.length()-1;i>=0; i--)
        {
            reverse = reverse.concat(String.valueOf(string.charAt(i)));
        }
        return reverse;

    }

    public static void main(String [] args) {
        ReverseString rs = new ReverseString();
        String reverseString = rs.reverseString(rs.input());
        System.out.println("String after reversing :");
        System.out.println(reverseString);

    }
}
