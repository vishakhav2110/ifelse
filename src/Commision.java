import java.util.Scanner;

public class Commision {

        public static void main(String[] args) { // main method

            Scanner scanner = new Scanner(System.in); // Create an object "scanner"
            {
                System.out.println("Enter Sales Id: ");
            } // asking user to put salary id
            int id = scanner.nextInt(); // cha user input into variable
            {
                System.out.println("Enter Seller name : "); //asking user to put seller id
            }

            {
                String Seller = scanner.next(); // cha user input into variable
            }
            {
                System.out.println("Enter Sales Amount: $ "); // asking user to put salary id

            }
            int sale_amount = scanner.nextInt(); // user input into variable

            double sale_com;

            if (sale_amount >= 50000) { // local variable

                sale_com = sale_amount * 0.35; // calculation on sale amount
                System.out.println("seller commission" + sale_com);// print seller commission
            } else if (sale_amount >= 30000) {
                sale_com = sale_amount * 0.30; // calculation on sale amount
                System.out.println("seller commission" + sale_com); // print seller commission
            } else if (sale_amount >= 20000) {
                sale_com = sale_amount * 0.20; // calculation on sale amount
                System.out.println("seller commission" + sale_com); // print seller commission
            } else if (sale_amount >= 10000) {
                sale_com = sale_amount * 0.05; // calculation on sale amount
                System.out.println("seller commission" + sale_com); // print seller commission
            } else if (sale_amount < 10000) {
                sale_com = sale_amount * 0.02; // calculation on sale amount
                System.out.println("seller commission" + sale_com); // print seller commission
            }
        }}

