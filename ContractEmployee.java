public class ContractEmployee extends Employee {
    public ContractEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.05;
    }

    @Override
    public String toString() {
        return "Contract " + super.toString();
    }
}
