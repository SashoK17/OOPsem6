
import java.util.Date;

// Класс Employee отвечает только за информацию о сотруднике
class Employee {
    private String name;
    private Date dob;
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}

// Класс SalaryCalculator отвечает только за расчет чистой зарплаты
class SalaryCalculator {
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25); // рассчет налога
        return baseSalary - tax;
    }
}
// Теперь класс Employee содержит только информацию о сотруднике, а класс SalaryCalculator отвечает за расчет чистой зарплаты. Это улучшает структуру кода и делает его более подходящим для принципа единственной ответственности.