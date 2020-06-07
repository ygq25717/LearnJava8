package commons_logging;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import logging.Main;


/**
 * Commons Logging是一个第三方日志库，它是由Apache创建的日志模块。
 * @author joker
 * Commons Logging的特色是，它可以挂不同的日志系统，并通过配置文件指定挂接的日志系统。默认情况下，CommonsLogging自动搜索并使用Log4j，如果没有找到，再使用JDKLogging。
 * 使用CommonsLogging只需要和两个类打交道，并且只有两部：
 * 	1、通过LogFactory获取Log类的实例；
 * 	2、使用Log实例的方法打日志。
 */
public class Demo01CommonsLogging {
	public static void main(String[] args) {
		Log log = LogFactory.getLog(Main.class);
		log.info("start...");
		log.warn("end.");
	}
}
/*
	CommonsLogging定义了6个日志级别：
		FATAL：致命
		ERROR：错误
		WARNING：警告
		INFO：信息；默认级别
		DEBUG：调试
		TRACE：跟踪
*/