/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// a,b,c gets 3 lengths of triangle from the user
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		// checks if sum of 2 other lengths is greater than the remaning length for each side	
		boolean isTriangle = ((a + b) > c) && ((b + c) > a) && ((a + c) > b);
		// prints if a,b,c form a triangle or not
		System.out.println(a + ", " + b + ", " + c + ": " + isTriangle);

	}
}
