
abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double basicSalary;
    private double bonus;

    public FullTimeEmployee(String name, int id, double basicSalary, double bonus) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return basicSalary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, double hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

 class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("vignesh", 1001, 50500, 15000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("saran", 1002, 130, 24);

        System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + partTimeEmployee.calculateSalary());
    }
}
