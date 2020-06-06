import java.util.Scanner;

public class Vote {

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); //  call object in variable
        System.out.println("Please Enter your age :"); // print there age
        int age = scanner.nextInt(); // call object in variable

        if (age >= 18) { //
            System.out.println("your age is 18+"); // print the age 18+
            System.out.println("you are eligible to vote");// print eligible to vote
        } else {
            System.out.println("you are not yet 18 "); // print not yet 18
                System.out.println(" you are not eligible to vote");} // print eligable to vote




            }}