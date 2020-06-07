package basis.Interface.Demo;

public class Demo {
	public static void main(String[] args) {
		Person p = new Student("小明");
		p.run();
	}
}

interface Person{
	String getName();
	default void run() {
		System.out.println(getName() + " run");
	}
}

class Student implements Person{
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	
	@Override
	public String getName() {
		return this.name;
	}
}