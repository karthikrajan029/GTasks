public class Employee extends Person{
    int empId;
    int salary;

    public Employee()
    {
        super(25,"Rajan");
    }
    public static void main(String[] args)
    {
        Employee emp=new Employee();
        emp.display();
    }
}
