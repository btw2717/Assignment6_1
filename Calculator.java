public class Calculator {

	public static double sum(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	public static double sum(double [] args) {
		double result = 0;
		for(int i = 0; i < args.length; i++) {
			result += args[i];
		}
		return result;
	}

	public static double product(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	public static double product(double [] args) {
		double result = 1;
		for(int i = 0; i < args.length; i++) {
			result *= args[i];
		}
		return result;
	}

	public static double average(double firstNumber, double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}

	public static double average(double firstNumber, double secondNumber, double thirdNumber) {
		return (firstNumber + secondNumber + thirdNumber) / 3;
	}

	public static double average(double [] args) {
		double result = 0;
		for(int i=0;i<args.length;i++) {
			result += args[i];
		}
		return result / args.length;
	}

	public static int factorial(int number) {
		int result = 1;
		if(number <= 1) {
			if(number < 0) {
				System.out.println("Don't enter a negative");
				return -1;
			} else {
				return 1;
			}	
		} else {
			result = number * factorial(number - 1);
		}
		return result;
	}

	public static int[] factorial(int [] series) {
		int[] seriesDriver = new int[series.length];
		for(int i=0; i < series.length; i++) {
			seriesDriver[i] = factorial(series[i]);
		}
		return seriesDriver;
	}
}
