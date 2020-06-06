import java.util.Scanner;

public class AvgNumbers{

    public static void main(String[] args) { // main method


        Scanner scanner = new Scanner(System.in); //  Create new object

        System.out.println("Enter 1st Value : "); // print 1st value
        int A = scanner.nextInt();// local variable
        System.out.println("Enter 2nd Value : "); // print 2nd  value
        int B = scanner.nextInt(); // local variable
        System.out.println("Enter 3rd Value : "); // print 3rd value
        int C = scanner.nextInt(); // local variable
        System.out.println("Enter 4th Value : "); // print 4th value
        int D = scanner.nextInt(); // local variable
        System.out.println("Enter 5th Value : "); // print 5th value
        int E = scanner.nextInt(); // local variable

        int division = 5; // divi method

        System.out.println((A+B+C+D+E)/division+" % "); // use divi method

    }
}
