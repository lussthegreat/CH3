import java.util.Scanner;
public class Temperature {
	
	public static void main (String[] args) {
		final double F_per_C = 9.0 / 5.0;
		int constant = 32;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius: ");
		double line = in.nextDouble();
		System.out.println(line + " C" + " = " + (line * F_per_C + constant) + " F");
		
	}
}
