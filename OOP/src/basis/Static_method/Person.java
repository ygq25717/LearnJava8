package basis.Static_method;
// 给Person类增加一个静态字段count和静态方法getCount，统计实例创建的个数。
public class Person {
	
	public String name;
	public int age;
	
	// 静态字段
	public static int number;
	public static int count;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name) {
		count++; // 统计实例创建的个数。
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// 静态方法
	public static int getCount() {
		return count;
	}
	
}
