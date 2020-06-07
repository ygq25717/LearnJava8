package logging;

import java.util.logging.Logger;

/**
 * 什么是日志？日志就是Logging，它的目的是为了取代System.out.println()。
 * @author joker
 * 输出日志，而不是System.out.println()，有以下几个好处：
 * 	1、可以设置输出样式，避免自己每次都写”ERROR：“ + var；
 * 	2、可以设置输出级别，禁止某些级别输出。例如，只输出错误日志；
 * 	3、可以被重定向到文件，这样可以在程序运行结束后查看日志；
 * 	4、可以按包名控制日志级别，只输出某些包打的日志；
 * 	5、可以......
 * 如何使用日志：
 * 	因为Java标准库内置了日志包java.util.logging，我们可以直接使用。
 */
public class Demo01Logging {
	public static void main(String[] args) {
		Logger logger = Logger.getGlobal();
		logger.info("start process..."); //信息: start process...
		logger.warning("memory is running out...");//警告: memory is running out...
		logger.fine("ignored.");//被忽略
		logger.severe("process will be terminated...");//严重: process will be terminated...
	}
}
/*
六月 06, 2020 9:52:40 下午 Logging.Demo01Logging main
信息: start process...
六月 06, 2020 9:52:40 下午 Logging.Demo01Logging main
警告: memory is running out...
六月 06, 2020 9:52:40 下午 Logging.Demo01Logging main
严重: process will be terminated...
*/

/* 对比可见，使用日志最大好处是，它自动打印了时间、调用类、调用方法等很多信息。
 * 仔细观察，4条日志只打印了3条，logging.fine()没有打印。这是因为，日志输出可以设定级别。JDK的Logging定义了7个日志级别。
 * 从严重到普通：
 * SEVERE ：严重
 * WARNING：警告
 * INFO：信息，默认是INFO，因此，INFO以下的日志不会被打印出来。
 * 使用日志级别的好处在于，调整级别，就可以屏蔽掉很多调试相关的日志输出。
 * CONFIG：配置
 * FINE：很好
 * FINER：更好的
 * FINEST：最好的
 */

/* 使用Java标准库内置的Logging有以下局限：
 * 	1、Logging系统在JVM启动时读取配置文件并完成初始化，一旦开始运行main()方法，就无法修改配置；
 * 	2、配置不太方便，需要在JVM启动时传递参数-Djava.util.logging.config.file=<config-file-name>
 * 因此，Java标准库内置的Logging使用并不是非常广泛。
 * 
 */



