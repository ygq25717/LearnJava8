package process_control.While;
// 使用while计算从m到n的和：
public class Main {
	public static void main(String[] args) {
		int sum = 0;
		int m = 20;
		int n = 100;
		// 使用while计算M+...+N:
		while (m <= n) {
			sum = sum + m;
			m++;
		}
		System.out.println(sum);
	}
}