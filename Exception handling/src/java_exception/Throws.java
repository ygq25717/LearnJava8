package java_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * throws关键字：处理异常的第一种方式，交给别人处理
 * @author joker
 *作用：
 *	当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象
 *	可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理，最终交给JVM处理-->中断处理
 *使用格式：在方法声明时使用
 *	修饰符 返回值 方法名(参数) throws AAAException,BBBException...{
 *		throw new AAAException("产生原因");
 *		throw new BBBException("产生原因");
 *		...
 *	}
 *注意：
 *	1、throws关键字必须写在方法声明处
 *	2、throws关键字后面声明的异常必须是Exception或者是Exception的子类
 *	3、方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常
 *		如果抛出了多个异常对象有子父类关系，那么直接声明父类异常即可
 *	4、调用了一个声明抛出异常的方法，我们就必须处理声明的异常
 *		要么继续使用throws声明抛出，交给方法的调用者处理，最终交给JVM
 *		要么try...catch自己处理异常
 */
public class Throws {
	public static void main(String[] args) throws IOException {
		readFile("c:\\a.tx");
		
		System.out.println("后续代码");
	}
	
	public static void readFile(String fileName) throws IOException {
		if (!fileName.equals("c:\\a.txt")) {
			throw new FileNotFoundException("传递文件的路径不对");
		}
		
		if (!fileName.endsWith(".txt")) {
			throw new IOException("文件的后缀名不对");
		}
		System.out.println("读取文件");
	}
}
