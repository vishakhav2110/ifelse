import java.util.Scanner;


public class PositiveNegative {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);// create an object "scanner"
        System.out.println("Please Enter number");//print statement
        int number = scanner.nextInt(); // local variable
        if (number >0)
        {
            System.out.println("You Have Enter Positive Number");}// print statement

        else if (number == 0)
        {
            System.out.println("You Have Enter Zero Number");} // print statement

            else if (number<0)
        {
            System.out.println("You Have Enter Negative Number");// print statement
        }

    }}
