public class test {
    public static void main(String[] args) {
        PermanentEmployee per = new PermanentEmployee("Youssef", 100000.00);
        ContractEmployee cont = new ContractEmployee("Reem", 50000);
        Intern inr = new Intern("Hassan", 30000);

        PayrollSystem payroll = new PayrollSystem();
        payroll.addEmployee(per);
        payroll.addEmployee(cont);
        payroll.addEmployee(inr);

        System.out.println("All the employees:");
        payroll.displayEmployees();

        System.out.println("Total payment: " + payroll.calculatePayment());

        payroll.removeEmployee(inr);
        System.out.println("Removed the intern employee successfully.");
        System.out.println("Updated employee list:");
        payroll.displayEmployees();
        System.out.println("Updated total payment: " + payroll.calculatePayment());
    }
}
