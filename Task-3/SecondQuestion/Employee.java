import java.util.Scanner;

public class Employee implements Taxable{

    private int empId;
    private String name;
    private long salary;


    public Employee(int empId,String name,long salary)
    {
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double incomeTax;
        long yearlySalary=(salary)*12;
        System.out.println("Yearly total salary is "+ yearlySalary);
        incomeTax=(yearlySalary)*(10.5/100);
        System.out.println("Income tax for the employee is "+incomeTax);
    }

}
