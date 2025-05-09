public abstract class Employee {
    private static int nextId = 1;
    private int id;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.id = nextId++;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateBonus();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
