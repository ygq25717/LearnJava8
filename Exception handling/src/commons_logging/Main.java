package commons_logging;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//使用使用log.error(String, Throwable)打印异常。

public class Main {

	static final Log log = LogFactory.getLog(Main.class);

	public static void main(String[] args) {
		
		String test_string = "HelloWorld!";
		byte[] res = null;
		
		log.info("Start process...");
		try {
			res = test_string.getBytes("不合法的编码");//不能正常编译
//			res = test_string.getBytes("utf-8");//能正常编译
			System.out.println(Arrays.toString(res));
		} catch (UnsupportedEncodingException e) {
			log.error("捕获到异常：" + e);
		}
		log.info("Process end.");
	}
}