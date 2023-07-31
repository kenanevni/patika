package Loops.Salary;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int currentYear = 2021;
    double netSalary;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) return this.salary * 0.03;
        else return 0;
    }

    public int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30 * 4;
        } else return 0;

    }

    public double raiseSalary() {
        if (currentYear - this.hireYear <= 9) {
            return salary * 0.05;
        }
        if (currentYear - this.hireYear <= 19) {
            return salary * 0.10;
        } else return salary * 0.15;
    }

    public double getNetSalary() {
        netSalary = this.salary + bonus() + raiseSalary() - tax();
        return netSalary;
    }

    @Override
    public String toString() {
        return "name = " + name + "\n" +
                "salary = " + salary + "\n" +
                "workHours = " + workHours + "\n" +
                "hireYear = " + hireYear + "\n" +
                "tax = " + tax() + "\n" +
                "bonus = " + bonus() + "\n" +
                "raise salary = " + raiseSalary() + "\n" +
                "netSalary = " + getNetSalary();
    }
}
