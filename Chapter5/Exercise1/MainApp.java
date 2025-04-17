interface SalaryCalculator {
    double getSalary();
}

class Employee implements SalaryCalculator {
    protected String name;
    protected double baseSalary;
    protected int overtimeHours;
    protected double overtimeRate;

    public Employee(String name, double baseSalary, int overtimeHours, double overtimeRate) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double getSalary() {
        return baseSalary + (overtimeHours * overtimeRate);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + getSalary());
    }
}

class CategoryA extends Employee {
    public CategoryA(String name, int overtimeHours) {
        super(name, 1500, overtimeHours, 10);
    }
}

class CategoryB extends Employee {
    public CategoryB(String name, int overtimeHours) {
        super(name, 1700, overtimeHours, 12);
    }
}

class CategoryC extends Employee {
    public CategoryC(String name, int overtimeHours) {
        super(name, 600, overtimeHours, 5);
    }
}

public class MainApp {
    public static void main(String[] args) {
        Employee employee1 = new CategoryA("Phuc", 10);
        Employee employee2 = new CategoryB("Ngan", 20);
        Employee employee3 = new CategoryC("Ruffa", 15);

        System.out.println("Giam doc: ");
        employee1.display();

        System.out.println("\nQuan ly ban hang: ");
        employee2.display();

        System.out.println("\nNhan vien ban hang: ");
        employee3.display();
    }
}
