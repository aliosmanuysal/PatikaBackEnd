import java.util.Calendar;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    // Kurucu Metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi Hesaplama Metodu
    public double tax() {
        if (salary > 1000) {
            return 0.03 * salary;
        } else {
            return 0;
        }
    }

    // Bonus Hesaplama Metodu
    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    // Zam Hesaplama Metodu
    public void raiseSalary() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            salary *= 1.05;
        } else if (yearsWorked < 20) {
            salary *= 1.10;
        } else {
            salary *= 1.15;
        }
    }

    // Bilgileri String olarak döndüren Metod
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}