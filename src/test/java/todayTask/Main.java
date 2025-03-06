package todayTask;

class Static {
	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	String add(String a , String b){
		return a + b;
	}	
}
public class Main {
	public static void main(String[] args) {
		Static A = new Static();

		int result1 = A.add(5,3);
		double result2 = A.add(2.3,  5.6);
		String result3 = A.add("Hello", "World");

		System.out.println("Result1:" +result1);
		System.out.println("Result2:" +result2);
		System.out.println("Result3:" +result3);

	}

}

