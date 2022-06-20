package NewPackage;

public class NewClass {
	
	String courseName = "abc";
	int shirtPrice = 1000;
	int shortPrice = 800;
	int tShirtPrice = 500;
	
	public static void main(String[] args) {
		
		String newCourse = "Selenium-java and manual testing";
		int durationOfCourse = 100;
		NewClass nc = new NewClass();
		nc.sumOfGivenNumbers(10, 30, 40, "kalyan");
		nc.sumOfGivenNumbers(1000,10000, 20000, "Malyan");
		nc.shopCashier(111, 113, 19);

		

	}
	
	public int sumOfGivenNumbers(int x, int y, int z , String d){
		
		int f = x+y+z;
		System.out.println("The sum of given numbers "+f);
		System.out.println("The guy who called me and used my service is: "+d);
		return f;
	}

	
	public int shopCashier(int tQuan, int sQuan, int shortQuan){
		

		int totalPrice = shirtPrice *tQuan + shortPrice*sQuan + tShirtPrice*shortQuan;

		System.out.println("The total price of your shopping+  " +totalPrice );

		return totalPrice;


		}
	
}
