import java.util.Scanner;

public class Upper_Lowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // object scanner
        System.out.println("Please enter any  character in uppercase: ");// statement
        char ch = scanner.next().charAt(0);
        int a = (int) ch;
        a = (ch + 32);
        char ch1 = (char) a;
        System.out.println(ch1); // statement

        System.out.println("Please enter any  character in Lower Case: ");// statement
        char ch3 = scanner.next().charAt(0);
        int B = (int) ch;
        B = (ch3 - 32);
        char ch2 = (char) B;
        System.out.println(ch2); // statement

    }
}