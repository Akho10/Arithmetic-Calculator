package package1;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Addition sum = new Addition();
		Subtraction sub = new Subtraction();
		
		double number1 = 11;
		double number2 = 3;
		
		System.out.println("Choose maths operation: ");
		System.out.println("1. Addition");
		System.out.println("2.Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
        int choice = scanner.nextInt();
		double result = 0;
		
		switch(choice) {
		case 1:
			result = sum.add(number1, number2);
			System.out.println("Addition result: " + result);
			break;
			
		case 2:
			result = sub.subtract(number1, number2);
			System.out.println("Subtratcion result: " + result);
			break;
			
		case 3:
			break;
			
		case 4:
			break;
		}
		
		
		

	}

}
