package day8;

public class ReverseOfString {

	public static void main(String[] args) {
		String str1 = "Selenium with Java";
		System.out.println(str1.length());
		
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		//mutable
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" and python");
		System.out.println(sb);
		System.out.println(sb.reverse());
		

	}

}
