
public class BankDepositForm {
	
	String bankName ="ICICI";
	String customerName;
	int accountNo =773437438;
	double amount;
	int mobileNo;
	
	public double calTotalAmount(double previousBalance,double currentAmount){

		double currentBal = previousBalance+currentAmount;

		return currentBal;

		}
	
	public static void main(String[] args) {
		
		BankDepositForm bdf = new BankDepositForm();
		String resultBankName = bdf.bankName; // ICICI
		System.out.println("The Bank Name: "+resultBankName);
		
		double result = bdf.calTotalAmount(5000, 200);
		
		System.out.println("The total Amount: "+result);
		
		
		
	}
	
	

}
