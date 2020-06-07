package basis.Abstrace;
// 用抽象类给一个有工资收入和稿费收入的小伙伴算税。
public class Main {
	public static void main(String[] args) {
		Income[] incomes = new Income[] {
//问题：含有抽象方法的类必须定义为抽象类，无法实例化。答：Income并没有被实例化，new Income[]只是个名称，实例化的只有那两个子类。
				new Wage(6000),
				new Manuscript(6000)
		};
		System.out.println(totalTax(incomes));
	}
	
	public static double totalTax(Income ...incomes) {
		double tal = 0;
		for (Income income : incomes) {
			tal = tal +income.getTax();
		}
		return tal;
	}
}

abstract class Income{ 
	double income;
	
	public Income(double income) {
		this.income = income;
	}
	
	abstract double getTax();
}

class Wage extends Income{
	public Wage(double income) {
		super(income);
	}

	@Override
	double getTax() {
		if (income<=5000) {
			return 0;
		}
		return (income - 5000) * 0.2;
	}
}

class Manuscript extends Income{ 
	public Manuscript(double income) {
		super(income);
	}

	@Override
	double getTax() {
		if (income <= 4000) {
			return (income - 800) * 0.2 * (1 - 0.3);
		}
		return income * (1 - 0.2) * 0.2 * (1 - 0.3);
	} 
}




