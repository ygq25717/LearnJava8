package basis.Static_method;

public class Demo1 {
	public static void main(String[] args) {
		Person ming = new Person("Xiao Ming", 22);
		Person hong = new Person("Xiao Hong", 21);
		ming.number = 99; // 警告：静态字段Person.number应该以静态方式访问
		System.out.println(ming.number); // 99
		hong.number = 100;
		System.out.println(ming.number); // 100
		System.out.println(hong.number); // 100
		Person.number = 60; // 推荐写法；可以理解为静态字段是描述类本身的字段（非实例字段）
		System.out.println(Person.number);
	}
}
