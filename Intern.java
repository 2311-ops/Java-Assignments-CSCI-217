public class Intern extends Employee {
    public Intern(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.02;
    }

    @Override
    public String toString() {
        return "Intern " + super.toString();
    }
}
