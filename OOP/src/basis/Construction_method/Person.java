package basis.Construction_method;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		this("Xiaohong"); // 调用其他的构造方法 name
		
	}
	
	public Person(String name) {
		this(name, 21); // 调用其他的构造方法 age
		
//		this.name = name;
//		this.age = 12;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age; 
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
