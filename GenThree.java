/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// gets range of numbers from user
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// generates 3 random numbers [0 , 1) and fits them to be in range.
		int num1 = (int)((Math.random() * (b - a)) + a);
        int num2 = (int)((Math.random() * (b - a)) + a);
        int num3 = (int)((Math.random() * (b - a)) + a);
		// checks what is the minimal number
		int minNum = Math.min(num1 , num2);
        minNum = Math.min(minNum , num3);
        // prints the generated numbers and then the minimal number
        System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("The minimal generated number was " + minNum);
        		
	}
}
