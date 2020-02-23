package day48;

public class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Fulltime Employee yearly : " + monthlySalary * 12);
    }

    @Override
    public String toString() {
        return "Full timeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                " , Yearly : " + monthlySalary * 12 +
                '}';
    }
}
