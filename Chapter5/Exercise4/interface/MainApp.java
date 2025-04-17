interface IEmployee {
    void displayData();

    double calculateMonthlyIncome();
}

class SalesRep implements IEmployee {
    private String name;
    private int id;
    private double baseSalary;
    private double commission;

    public SalesRep(String name, int id, double baseSalary, double commission) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.commission = commission;
    }

    @Override
    public void displayData() {
        System.out.println(
                "Staff id: " + id + ", Name: " + name + ", Monthly salary: " + calculateMonthlyIncome() + "đ");
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public double calculateMonthlyIncome() {
        return baseSalary + commission;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Consultant implements IEmployee {
    private String name;
    private int id;
    private double hourlyRate;
    private int hoursWorked;

    public Consultant(String name, int id, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void displayData() {
        System.out.println(
                "Staff id: " + id + ", Name: " + name + ", Monthly salary: " + calculateMonthlyIncome() + "đ");
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

    @Override
    public double calculateMonthlyIncome() {
        return hourlyRate * hoursWorked;
    }
}

public class MainApp {
    public static void main(String[] args) {
        IEmployee salesRep = new SalesRep("Phuc", 168, 3000, 300);
        salesRep.displayData();

        IEmployee consultant = new Consultant("Ngan", 412, 50, 100);
        consultant.displayData();
    }
}