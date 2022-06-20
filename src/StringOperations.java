
public class StringOperations {
	
	String courseName = "Selenium with Java ";

	public static void main(String[] args) {
		String newCoureName = "Manual testing along with Selenium with java ";
		String abc ="abc";
		StringOperations sop = new StringOperations();
		char firstChar = newCoureName.charAt(10);
		String finalStr = newCoureName.concat(abc);
		System.out.println("first char is: "+finalStr);
	
		
	}
	
	
	public void newMethod() {
		
		System.out.println("This is from newMethod");
	}
	
	
public void newTwoMethod() {
		
		System.out.println("This is from newTwoMethod");
	}

}
