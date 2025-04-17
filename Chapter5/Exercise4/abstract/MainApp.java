abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayData() {
        System.out.println(
                "Staff id: " + id + ", Name: " + name + ", Monthly salary: " + calculateMonthlyIncome() + "vnd");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double calculateMonthlyIncome();
}

class SalesRep extends Employee {
    private double baseSalary;
    private double commission;

    public SalesRep(String name, int id, double baseSalary, double commission) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.commission = commission;
    }

    @Override
    public double calculateMonthlyIncome() {
        return baseSalary + commission;
    }
}

class Consultant extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Consultant(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateMonthlyIncome() {
        return hourlyRate * hoursWorked;
    }
}

public class MainApp {
    public static void main(String[] args) {
        Employee salesRep = new SalesRep("Thien Phuc", 168, 3200, 600);
        salesRep.displayData();

        Employee consultant = new Consultant("Thuy Ngan", 412, 60, 180);
        consultant.displayData();
    }
}
