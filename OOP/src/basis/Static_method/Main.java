package basis.Static_method;
// 给Person类增加一个静态字段count和静态方法getCount，统计实例创建的个数。
public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("小明");
		System.out.println(p1.name);
		Person p2 = new Person("小红");
		System.out.println(p2.getName());
		Person p3 = new Person("小黄");
		System.out.println(p3.getName());
		
		// 实例Person(String name)的创建次数。
		System.out.println(Person.getCount());
	}
}