public class Employee {
    String name;
    double grossSalary;
    double tax;
    double netSalary;

    public double NetSalary() {
        netSalary=grossSalary-tax;
        return netSalary;

    }

    public double IncreaseSalary(double percent) {
        percent=percent/100;
        return grossSalary=grossSalary+(grossSalary*percent);
    }

    public String toString(){
        return name +", $" + netSalary;
    }

}
