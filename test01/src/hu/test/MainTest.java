package hu.test;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing push function.");
		intWriter(5);
		stringWriter("valami");
		charWriter('k');
	}
	
	private static void stringWriter(String str)
	{
		System.out.println(str);
	}

	private static void intWriter(Integer number) {
		System.out.println(number.toString());
	}
	
	private static void charWriter(char character)
	{
		System.out.println(character);
	}
	
}
