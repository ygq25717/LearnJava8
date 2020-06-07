package core_class.StringJoiner;
// 请使用StringJoiner构造一个SELECT语句：
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "测试成功" : "测试失败");
    }


    static String buildSelectSql(String table,String[] fields){ // 别人简化的写法
        StringJoiner sj = new StringJoiner(", ","SELECT "," FROM "+table); //new StringJoiner("定界符","前缀 "," 后缀 "+table);
        for(String f:fields){           
            sj.add(f);        
        }
        return sj.toString();    
    }
}
    
//    static String buildSelectSql(String table, String[] fields) { // 自己的想法
//        StringJoiner sj = new StringJoiner(", ");
//        
//        for (String string : fields) {
//        	sj.add(string);
//		}
//        
//        StringBuffer sb = new StringBuffer(1024);
//        sb.append("SELECT ")
//        .append(sj.toString())
//        .append(" FROM ")
//        .append(table);
//        
//        return sb.toString();
//    }
//}
    