package basis.Construction_method;

//请给Person类增加(String, int)的构造方法：

public class Main {
    public static void main(String[] args) {
        // TODO: 给Person增加构造方法:
        Person ming = new Person("小明", 12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
}
class MPerson {
    private String name;
    private int age;
    
    public MPerson(String name, int age) {
    	this.name = name;
    	this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}