package basis.Interface;
// 用接口给一个有工资收入和稿费收入的小伙伴算税。
public class Main {
	public static void main(String[] args) {
		Income[] incomes = new Income[] {
				new Salary(6000),
				new Manuscripts(6000)
		};
		System.out.println(Totaltax(incomes));
	}
	public static double Totaltax(Income ...incomes) {
		double total = 0;
		for (Income income : incomes) {
			total = total + income.getTax();
		}
		return total;
	}
}

interface Income {
	double getTax();
}

class Salary implements Income{
	private double income;
	
	public Salary(double income) {
		this.income = income;
	}
	
	
	@Override
	public double getTax() {
		if (income <= 5000) {
			return 0;
		}
		return (income - 5000) * 0.2;
	}
	
}

class Manuscripts implements Income {
	private double income;
	
	public Manuscripts(double income) {
		this.income = income;
	}
	
	
	@Override
	public double getTax() {
		if (income <= 4000) {
			return (income - 800) * 0.2 * (1 - 0.3);
		}
		return income * (1 - 0.2) * 0.2 * (1 - 0.3);
	}
	
}
