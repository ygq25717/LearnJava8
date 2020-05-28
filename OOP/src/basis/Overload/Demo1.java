package basis.Overload;

public class Demo1 {
	public static void main(String[] args) {
		String s = "Test string";
		int n1 = s.indexOf('t');
        int n2 = s.indexOf("st");
        int n3 = s.indexOf("st", 4);
        System.out.println(n1); // 3, 根据字符的Unicode码查找；
        System.out.println(n2); // 2, 根据字符串查找；
        System.out.println(n3); // 5, 根据字符串查找，但指定起始位置。
	}
}
