class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary + (baseSalary * 0.05); // 5% allowance
    }
}

class Manager extends Employee {

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        return salary + 2000; // management bonus
    }
}

class Executive extends Manager {

    public Executive(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        double incentive = baseSalary * 0.10; // 10% of base
        return salary + incentive;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee("Alice", 10000);
        System.out.println(e.calculateSalary()); // 10500

        Manager m = new Manager("Bob", 10000);
        System.out.println(m.calculateSalary()); // 12500

        Executive ex = new Executive("Charlie", 10000);
        System.out.println(ex.calculateSalary()); // 13500
    }
}