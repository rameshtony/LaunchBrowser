// inheritance in Java 
// What is the definition
// where to implement 
// how.to implement 
public class CalSumAndMul extends FirstClassSumAndMulti {

	public static void main(String[] args) {

		int marks = 30;
		int mathMarks = 56;
		int teluMarks = 49;
		int hindiMarks = 56;
		int[] ar1;
		int[] ar2 = {30,56,49,56,100,30};
		int res = ar2[0];
		System.out.println("The first item of my array: "+res);
		
		int res4 = ar2[4];
		System.out.println("The first item of my array: "+res);
		
		System.out.println("The 5th item item of my array: "+res4);
		
		
		CalSumAndMul cam = new CalSumAndMul();
		int result = cam.sumOfGivenNumbers(10, 20);
		System.out.println("The sume of given numbers: "+ result);
		String courseNa = cam.courseName;
		
		courseNa.split(" ");
		System.out.println("courseNa "+courseNa);
		
	}

	public void getText() {

		System.out.println("This is from getText Method");
	}

	public void dragAndDrop() {

		System.out.println("This is from dragAndDrop Method");
	}
}
