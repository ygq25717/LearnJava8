package basis.Construction_method;

public class Demo {
	public static void main(String[] args) {
		Person ps = new Person("Xiaoming"); // 根据条件选择符合的构造方法来执行
		System.out.println(ps.getName());
		System.out.println(ps.getAge());
		
	}
}
