package java_exception;
/**
 * throw 关键字
 * @author joker
 *作用：
 *	可以使用throw关键字在指定的方法中抛出指定的异常
 *使用格式：
 *	throw new xxxException("异常产生的原因");
 *注意：
 *	1.throw关键字必须写在方法的内部
 *	2.throw关键字后面new的对象必须是Exception或者Exception的子类对象
 *	3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
 *		throw关键字后面创建的是RuntimeException或者是RuntimeException的子类对象，我们可以不理，默认交给JVM处理（打印异常对象，中断程序）
 *		throw关键字后面创建的是编译异常，我们就必须处理这个异常，要么throws，要么try...catch
 */
public class Throw {
	public static void main(String[] args) {
		int[] arr = new int[3];
		int a = getEletem(arr, 3);
		System.out.println(a);
	}
	
	/*
	 * 以后工作中我们首先必须对方法传递过来的参数进行合法性校验
	 * 如果参数不合法，那么我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题
	 * 注意：
	 * 		NullPointerException是一个运行期异常，我们不用处理，默认交给JVM处理
	 * 		所有的RuntimeException的子类包括RuntimeExcption都是运行期异常
	 */
	public static int getEletem(int[] arr, int index) {
		/*
		 *	我们可以对传递过来的参数进行合法校验
		 * 	如果数组arr的值是null
		 *	那么我们就抛出空指针异常，告知方法的调用者”数组的值为空“
		 */
		if (arr == null) {
			throw new NullPointerException("传入的参数是空");
		}
		if (index > 0 || index >arr.length-1) {
			throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
		}
		int ele = arr[index];
		return ele;
	}
}
