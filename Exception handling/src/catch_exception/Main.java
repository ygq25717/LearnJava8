package catch_exception;

// 用try ... catch捕获异常并处理。
public class Main {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		try {
			System.out.println(arr[3]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally {
			System.out.println("hello");
		}
	}
}
