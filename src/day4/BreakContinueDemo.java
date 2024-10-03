package day4;

public class BreakContinueDemo {

	public static void main(String[] args) {
		
		System.out.println("Break Keyword");
		for(int i=1;i<=10;i++) {
			//System.out.print(i + " ");//1 2 3 4 5
			if(i==5) {
				break;//terminates the loop
			}
			System.out.print(i + " ");//1 2 3 4
		}
		System.out.println();
		System.out.println("Continue Keyword");
		for(int i=1;i<=10;i++) {
			
			if(i==5) {
				continue;//skip
			}
			System.out.print(i + " ");//1 2 3 4 6 7 8 9 10
		}
		
		System.out.println();
		System.out.println("Out of loop");

	}

}
