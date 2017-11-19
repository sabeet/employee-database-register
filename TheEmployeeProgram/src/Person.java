public class Person {

	public String name;

public Person() {
	name = "Unavailable";
}

public Person(String initialName) {
	name = initialName;
}

public void setName(String newName) {
	
	name = newName;
}

public String getName() {
	return name;
}

public void writeOutput() {
	System.out.println("Name: " + name);
}

}