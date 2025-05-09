public class PermanentEmployee extends Employee {
    public PermanentEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public String toString() {
        return "Permanent " + super.toString();
    }
}
