package week2;

public class Equality {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 5;
		
		System.out.println(a == b); //t
		
		int c = 3;
		int d = c;
		
		System.out.println(c == d); //t
		
		String aStr = new String("Hello");
		String bStr = new String("Hello");
		
		System.out.println(aStr == bStr); //f
		System.out.println(aStr.equals(bStr)); //t
		
		String cStr = aStr;
		System.out.println(cStr == bStr); //f
		System.out.println(aStr == cStr); //t
		
	}

}
