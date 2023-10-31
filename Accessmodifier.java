package javaoopconcept;

public class Accessmodifier {

	public int pulicVar = 10;
	private int privateVar = 20;
	protected int protectedVar = 30;

	int defaultVar = 40;

	public void publicMethod() {

		System.out.println("This is a public method");
	}

	private void privateMethod() {

		System.out.println("This is a private method");
	}

	protected void protectedMethod() {

		System.out.println("This is a protected method");
	}

	void defaultMethod() {

		System.out.println("This is my default method");
	}

	public static void main(String[] args) {

		Accessmodifier obj = new Accessmodifier();

		System.out.println("Public variable : " + obj.pulicVar);
		System.out.println("Private variable : " + obj.privateVar);
		System.out.println("Protected variable : " + obj.protectedVar);
		System.out.println("Default variable : " + obj.defaultVar);

		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();

	}

}
