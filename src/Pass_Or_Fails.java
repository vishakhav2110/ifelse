import java.util.Scanner;

public class Pass_Or_Fails
{
    public static void main(String[] args) // main method
    {
        Scanner scanner = new Scanner(System.in);// creact new object
        System.out.println("Please Enter meths mark"); // print meths mark
        int meths = scanner.nextInt(); // local variable

        System.out.println("Please Enter english"); // print english  mark
        int english  = scanner.nextInt(); // local variable

        System.out.println("Please Enter science"); // print science  mark
        int science = scanner.nextInt(); // local variable
         int total = meths +  english + science; // user put there marks
         double percentage = (total/3); //
        System.out.println("total marks = "+total); // print marks
        System.out.println("total percentage= "+ percentage+" % ");// use % method

        if (percentage <40 && percentage>0){ // use relational operators
            System.out.println("Fail");} // print fail

        else if (percentage >=40 && percentage <50){ // use logical operators
            System.out.println("C Grade");} // print c gared

        else if (percentage>=50 && percentage<60){ //  use less then and greterthen
            System.out.println("B Grade"); // print b grade
                }
        else if (percentage>=60 && percentage<70){ //  use less then and greterthen
            System.out.println("A Grade"); } // print a grade
        else if (percentage>=70 && percentage<=100) {//  use less then and greterthen
        System.out.println("A+ Grade"); // print a grade
    }
        else {
            System.out.println("Invalid Entry"); // print invalid entry
        }
}}
