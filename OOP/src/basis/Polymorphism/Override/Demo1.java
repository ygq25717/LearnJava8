package basis.Polymorphism.Override;

public class Demo1 {
    public static void main(String[] args) {
        // 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
        Income[] incomes = new Income[] {
            new Income(3000), // 普通收入3000
            new Salary(7500), // 工资7500
            new StateCouncilSpecialAllowance(15000) // 特别津贴15000
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes) { // 可变参数totalTax(Income... incomes)，本质上就是一个数组
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax(); // income.getTax()
        }
        return total;
    }
}

class Income { // 收入
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10% 300
    }
}

class Salary extends Income { // 工资收入
    public Salary(double income) {
        super(income); // 调用父类的income字段
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2; // 工资超过5000收税20% 500
    }
}

class StateCouncilSpecialAllowance extends Income { // 国家理事会特别津贴
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}
