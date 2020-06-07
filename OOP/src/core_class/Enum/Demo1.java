package core_class.Enum;

public class Demo1 {
	public static void main(String[] args) {
		Weekday day = Weekday.SUN;
		if (day == Weekday.SAT || day == Weekday.SUN) {
			System.out.println("Week at home!");
		}else {
			System.out.println("Week at office!");
		}
	}
}

enum Weekday{
	SUN, MON, TUE, WED, THU, FRI, SAT;
}
