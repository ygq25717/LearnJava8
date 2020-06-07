package commons_logging;


public class Student extends Person{
	void bar() {
		log.info("bar");
	}
}
/*
	使用LogFactory.getLog(getClass())有个非常大的好处，就是子类可以直接使用该log实例。
	由于Java类的动态特性，子类获取log字段相当于LogFactory.getLog(Student.class)，但却是从父类继承而来，并且无需改动代码。

*/