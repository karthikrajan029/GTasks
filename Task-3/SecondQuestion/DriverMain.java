import java.util.Scanner;

public class DriverMain {

        public static void main(String[] args)
        {
            //Setting the employee values using scanner
            Scanner sc=new Scanner(System.in);
            int empId;
            System.out.println("Enter the employee Id");
            empId=sc.nextInt();
            String name;
            System.out.println("Enter the employee name");
            name=sc.next();
            long salary;
            System.out.println("Enter the employee salary");
            salary=sc.nextLong();
            Employee emp=new Employee();
            emp.setEmpId(empId);
            emp.setName(name);
            emp.setSalary(salary);
            emp.calcTax();
            //Setting the person values using scanner
            int pId;
            System.out.println("Enter the product Id");
            pId=sc.nextInt();
            double price;
            System.out.println("Enter the product price");
            price=sc.nextDouble();
            long quantity;
            System.out.println("Enter the product quantity");
            quantity=sc.nextLong();
            Product p=new Product();
            p.setpId(pId);
            p.setPrice(price);
            p.setQuantity(quantity);
            p.calcTax();
    }
}
