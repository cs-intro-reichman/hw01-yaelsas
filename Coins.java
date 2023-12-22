/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int receivedCents = Integer.parseInt(args[0]);
		// calculates number of quarters
		int quarters = receivedCents / 25 ;
		// calculates the remaning number of cents
		int cents = receivedCents % 25 ;
		System.out.println("Use " + quarters + " quarters and " + cents + " cents");
	}	
}