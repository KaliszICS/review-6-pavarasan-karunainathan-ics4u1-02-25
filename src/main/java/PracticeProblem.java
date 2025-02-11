public class PracticeProblem {
	public static int sum(int num1, int num2){
		return num1 + num2;
	}

	public static int difference(int num1, int num2){
		return num1 - num2;
	}

	public static double product(double num1, double num2){
		return num1 * num2;
	}
	
	public static String removeFirst(String str){
		return str.substring(1);
	}

	public static int combinedLength(String str1, String str2){
		return str1.length() + str2.length();
	}

	public static boolean isEven(int num){
		return (num & 1) == 0;
	}

	public static boolean isOdd(int num){
		return (num & 1) == 1;
	}

	public static boolean isPositive(int num){
		return num > 0;
	}

	public static boolean isNegative(int num){
		return num < 0;
	}

	public static void main(String args[]){}
}
