package core_class.StringBuilder.Delete_demo;

public class Demo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hellollo, World!");
		sb.delete(5, 8);
		System.out.println(sb);
	}

}
