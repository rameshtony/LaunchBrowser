
public class ShopCashier {
	String shopName = "TeaTime";

	public static void main(String[] args) {
	int samosaPrice = 10;
	int teaPric = 5;
	int numOfTeas = 10;
	int numOfSamosa = 3;
	int totalAmount = (samosaPrice*numOfSamosa) + (teaPric*numOfTeas);
	
	System.out.println("The total Price is: "+totalAmount);
	
	ShopCashier sc = new ShopCashier();
	int finalResult = sc.cashierTotalCal(5, 3);
	System.out.println("The total price: "+finalResult);
	
	int finalResult2 = sc.cashierTotalCal(10, 5);
	
	System.out.println("The total price: "+finalResult2);
	
	int finalResult3 = sc.cashierTotalCal(1, 1);
	
	System.out.println("The total price: "+finalResult3);
	

	}
	
	public int cashierTotalCal(int numTea, int numSam){
		
		int teaP = 5;
		int samP = 10;
		
		int totalPrice = (teaP*numTea) + (samP*numSam);
		
		return totalPrice;
		
	}
	
	
	
	

}
