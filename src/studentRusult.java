

import java.util.Scanner;

public class studentRusult
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// scannner object
        System.out.println("enter the student name:");// print statement
        String name = scanner.nextLine();//statement
        System.out.println("enter roll number:");// print statement
        int number = scanner.nextInt();// print statement
        System.out.println("Enter Percentage ");// print statement
        int percentage = scanner.nextInt();// print statement
                if (percentage >= 80 && percentage <=100) {
            System.out.println("A+ Grade");// print statement
        } else if (percentage >= 60 && percentage < 80)// use logical operators
        {
            System.out.println("A Grade");// print statement
        }
          else if (percentage >= 50 && percentage <60) {// use logical operators
            System.out.println("B Grade");// print statement
        }
        else if (percentage >=35 && percentage <=50)// use logical operators
        {
            System.out.println("C Grade");       }// print statement


        else {
            System.out.println("Fail");// print statement
        }
            }}
