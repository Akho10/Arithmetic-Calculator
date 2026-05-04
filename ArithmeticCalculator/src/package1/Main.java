package package1;



public class Main {

	public static void main(String[] args) {
		
		Addition sum = new Addition();
		
		double number1 = 11;
		double number2 = 3;
		
		
		//menu
		int choice = 1;
		double result = 0;
		
		switch(choice) {
		case 1:
			result = sum.add(number1, number2);
			break;
			
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
		}
		
		System.out.println("Result: " + result);

	}

}
