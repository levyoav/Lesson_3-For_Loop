package forLoopExamples;

public class ForLoopExample4 {
	
	public static void main(String[] args) {
		
		int r = (int)(Math.random()*100) + 1;
		
		System.out.println("the number is: " + r);
		
		for(int i = 1; i <= r; i++) {
			System.out.print(i + ", ");
		}
		
		
	}

}
