
public class ConditionChecking {
	
	public static void main(String[] args) {
		int num = 10;
		
		int marks =30;
	
		if(marks>=70) {
			
			System.out.println("Kumar secured distinction");
			} else if(marks>=60){
				
				System.out.println("Kumar secured first class");
			} else if( (marks>=35) && (marks<45)){
				System.out.println("Kumar secured 3rd  class");
				
			} else if(marks>=45 && marks<60) {
				
				System.out.println("Kumar secured 2nd  class");
			} else {
				
				System.out.println("Kumar secured failed");
			}
		
		
		
	}

}
