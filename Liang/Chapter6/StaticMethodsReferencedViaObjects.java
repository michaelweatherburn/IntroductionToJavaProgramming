public class StaticMethodsReferencedViaObjects
{
	public static void staticMethod() {
		System.out.println("Hi, I'm a static method");
	}

	public void instanceMethod() {
		System.out.println("Hi, I'm a non-static method");
	}

	public static void main(String[] args)
	{
		// static method being called directly
		StaticMethodsReferencedViaObjects.staticMethod();

		// reference created and non-static method accessed via reference
		StaticMethodsReferencedViaObjects obj = new StaticMethodsReferencedViaObjects();
		obj.instanceMethod();

		// Trying to access instance method using ClassName and dot operator
		// StaticMethodReferencedViaObjects.instanceMethod();
		// Failed - throws an error - instance Methods are tied to their objects - they can only be called using an object reference

		// Trying to access static method using object
		obj.staticMethod();
		// Linter shows warning, saying that staticMethod must be qualified by Type name i.e. Class Name, but execution runs as expected
	}
}