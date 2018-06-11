class Name {
	public String value;
	Name(String name)
	{
		this.value = name;
	}
}

public class TestPassByValueReferenceVariables
{
	public static void main(String[] args)
	{
		Name name1 = new Name("Subham");
		Name name2 = new Name("KD");
		System.out.println("Name1: " + name1.value + ", Name2: " + name2.value);
		swap(name1, name2);
		System.out.println("Name1: " + name1.value + ", Name2: " + name2.value);
	}

	public static void swap(Name firstName, Name secondName)
	{
		System.out.println("Name1: " + firstName.value + ", Name2: " + secondName.value);
		Name temp = firstName;
		firstName = secondName;
		secondName = temp;
		System.out.println("Name1: " + firstName.value + ", Name2: " + secondName.value);
	}
}