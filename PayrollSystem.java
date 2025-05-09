import java.util.ArrayList;
import java.util.List;

public class PayrollSystem implements Payable {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public double calculatePayment() {
        double total = 0;
        for (Employee e : employees) {
            total += e.getSalary() + e.calculateBonus();
        }
        return total;
    }

    public void displayEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
