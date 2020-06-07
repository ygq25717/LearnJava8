package java_exception;
/**
 * 异常的产生过程并解析
 * @author joker
 *
 */
public class Demo02Exception {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int a = getElement(arr, 3); // main方法接收到了这个异常对象，main方法也没有异常的处理逻辑，继续把异常对象抛出给main方法的调用者JVM处理(2)
		System.out.println(a);
		
	}
	public static int getElement(int[] arr, int index) {
		int ele = arr[index]; // 访问了数组中的3索引，而数组是没有3索引的，这时候JVM就检测出程序异常，这时候JVM会做两件事情(1)
		return ele;
	}
}

/*
 （1）
  	1、JVM会根据异常原因创建一个异常对象，这个异常对象包含了异常产生的(内容、原因、位置)
  		new ArrayIndexOutOfBoundsException("3");
  	2、在getElement方法中，没有异常的处理逻辑（try...catch），那么JVM就会把异常对象抛出给方法的调用者 main() 方法来处理这个异常
 */

/*
 （2）JVM接收到了这个异常对象，做了两件事
 	1、把异常对象(内容、原因、位置)以红色字体打印在控制台
 	2、JVM会终止当前正在执行的java程序-->中断处理
*/

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at java_exception.Demo2.getElement(Demo2.java:15)
	at java_exception.Demo2.main(Demo2.java:10)
*/