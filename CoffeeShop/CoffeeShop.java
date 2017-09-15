// Caitlyn Bell September 13, 2017
import java.util.Scanner; //imports the scanner class
public class CoffeeShop{ // create the Coffee Shop class
public static void main(String[]args){ //creates the main method
System.out.println("Hello Welcome to Rocky's Coffee Shop! May I take your order?");// prints the line
Scanner scan = new Scanner (System.in); // creaters new scanner
String customersOrder = scan.nextLine(); // creates object that is scanned
System.out.println("What is your name?");
String customerName = scan.nextLine(); // creates the name string
System.out.println ("Ok, "+ customerName +", your "+ customersOrder + " will be ready in a bit."); // prints cutomers name and order
System.out.println(customerName +"! Your "+ customersOrder + " is ready!"); // prints name and order is ready
}
}
