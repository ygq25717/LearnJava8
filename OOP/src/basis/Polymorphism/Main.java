package basis.Polymorphism;
// 给一个有工资收入和稿费收入的小伙伴算税。
public class Main {
	public static void main(String[] args) {
		Income[] incomes = new Income[] {
				new Salary(3500), 
				new Manuscript(6300)
		};
		System.out.println(totalTax(incomes)); // 答：因为静态方法里不能引用非静态方法，
	}
	
	// / 可变参数totalTax(Income... incomes)，本质上就是一个数组
	public static String totalTax(Income ...incomes) { // 疑问：为什么要用静态方法？
		double total = 0;
		for (Income income : incomes) {
			total = total + income.getTax();
		}
		return String.format("%.2f", total);
	}

}

/*
 * 收入
 */
class Income{
	double income;
	
	public Income(double income) {
		this.income = income;
	}
	
	public double getTax() {
		return getTax();
	} 
}

/*
 * 工资
 */
class Salary extends Income{
	public Salary(double income) {
		super(income);
	}
	
	@Override
	public double getTax() {
	if (income <= 5000) {
		return 0;
	}
	return (income - 5000) * 0.2;
	}
}

/*
 * 稿费
 */
class Manuscript extends Salary{
	public Manuscript(double income) {
		super(income);
	}
	
	@Override
	public double getTax() {
		if (income <= 4000) {
			return (income - 800) * 0.2 * (1 - 0.3);
		}
		return income * (1 - 0.2) * 0.2 * (1 - 0.3);
	}
}





