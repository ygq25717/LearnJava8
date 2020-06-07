package process_control.Do_While;
// 使用do while循环计算从m到n的和。

public class Main {
	public static void main(String[] args) {
		int sum = 0;
        int m = 20;
		int n = 100;
		// 使用do while计算M+...+N:
		do {
			sum = sum + m;
			m++;
		} while (m <= n);
		System.out.println(sum);
	}
}

