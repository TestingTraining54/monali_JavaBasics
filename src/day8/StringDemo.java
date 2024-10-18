package day8;

public class StringDemo {
/*
 * String - Non primitive data type
 * class
 * String - immutible
 * 
 * 2 ways of creating a string
 * 1. Using literal
 * 2. Using a new Keyword
 */
	public static void main(String[] args) {
		String s1="Selenium with Java";
		System.out.println(s1);//Selenium with Java
		s1=s1.concat(" and python");
		System.out.println(s1);//Selenium with Java and python
	
	String s2 = new String("coffee");
	System.out.println(s2);
	System.out.println("Using String Literal");
	String sl1 = "Java";
	String sl2 = "python";
	String sl3 = "Java";
	System.out.println("Comparing both reference pointing to same object or not > ==");
	System.out.println(sl1==sl2);//false//Is both sl1 and sl2 pointing to same object or not
	System.out.println(sl1==sl3);//true//Is both sl1 and sl3 pointing to same object or not
	
	System.out.println("Comparing both String values > equals() or equalsIgnoreCase()");
	System.out.println(sl1.equals(sl2));//false//Is value of sl1 and sl2 are same or not
	System.out.println(sl1.equals(sl3));//true//Is value of sl1 and sl3 are same or not
	
	System.out.println("Using new Keyword");
	String sn1=new String("COFFEE and Tea");
	String sn2=new String("Tea");
	String sn3=new String("Coffee");
	System.out.println("Comparing both reference pointing to same object or not > ==");
	System.out.println(sn1==sn2);//false//Is both sl1 and sl2 pointing to same object or not
	System.out.println(sn1==sn3);//false//Is both sl1 and sl3 pointing to same object or not
	
	System.out.println("Comparing both String values > equals() or equalsIgnoreCase()");
	System.out.println(sn1.equals(sn2));//false//Is value of sl1 and sl2 are same or not
	System.out.println(sn1.equals(sn3));//true//Is value of sl1 and sl3 are same or not
	
	
	System.out.println(sn1.charAt(4));//e
	//System.out.println(sn1.compareTo(sn2));
	System.out.println(sn1.contains("ffe"));//true
	System.out.println(sn1.endsWith("es"));//true
	System.out.println(sn1.startsWith("Co"));//true
	System.out.println(sn1.indexOf('f'));//2
	System.out.println(sn1.lastIndexOf('f'));//6
	System.out.println(sn1.replace('f','s'));
	System.out.println(sn1.substring(2, 5));//ffe
	System.out.println(sn1.substring(2));//ffesf
	System.out.println(sn1.toLowerCase());
	System.out.println(sn1.toUpperCase());
	System.out.println(sn1.trim());
	String[] splitArray=sn1.split("and");
	//System.out.println(splitArray[0]);
	for(int i=0;i<splitArray.length;i++) {
		System.out.println(splitArray[i]);
	}
	
	
	
	
	}

}
