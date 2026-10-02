import java.util.Scanner;
public class Day_Hour_Sec {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an amount in seconds: ");
		int line = in.nextInt();
		System.out.println(line + " second(s) = " + line / 3600 + " hour(s), " + (line % 3600 / 60) + " minute(s), and " + (line % 3600 % 60) + " second(s)" );
		
	}
}
