package Test;

public class TestClass {
	public static void main(String args[]){
		System.out.println("First".compareToIgnoreCase("first"));
		System.out.println("Fourth".compareToIgnoreCase("Fifth"));
		System.out.println("First".compareToIgnoreCase("Fourth"));
		System.out.println("First".compareToIgnoreCase("Fifth"));
	}
}
