public class CalculatorDriver {
	public static void main(String[] args) {
		double[] add = {2.0, 4.0, 7.0, 15.0};
		System.out.println("Using sum() method on two double type parameters:\n" + Calculator.sum(add[0], add[1]) + "\nUsing sum() method an array parameter:\n" + Calculator.sum(add)); 
		System.out.println();
		System.out.println("using product() method on array parameter:");
		System.out.println(Calculator.product(add));
		System.out.println("Using product() method on two double type parameters:\n" + Calculator.product(add[2], add[3]));
		System.out.println();
		System.out.println("Using the average() method on 2 parameters:\n" + Calculator.average(add[1], add[2]) + "\nUsing average() method on 3 parameters:\n" + Calculator.average(add[0], add[1], add[2]) + "\nUsing the average method passing an array:\n" + Calculator.average(add));
		System.out.println();
		System.out.println("Using factorial method on an integer parameter:\n" + Calculator.factorial((int)add[2]));
	}
}
