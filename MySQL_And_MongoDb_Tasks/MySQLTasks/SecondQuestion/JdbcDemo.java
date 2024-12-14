import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

    String url="jdbc:mysql://localhost:3306/employee";

    String createQuery="""
                                create table employees(empcode int,
                                empname varchar(30),
                                empage int,
                                esalary int,primary key(empcode))
                                """;
    System.out.println("Create table query is "+createQuery);
    Connection conn= DriverManager.getConnection(url,"root","karthik");
    PreparedStatement ps=conn.prepareStatement(createQuery);
    ps.executeUpdate();

        Employees[] emps=new Employees[5];
       emps[0]=new Employees(101,"Jenny",25,10000);
       emps[1]=new Employees(102,"Jacky",30,20000);
       emps[2]=new Employees(103,"Joe",20,40000);
       emps[3]=new Employees(104,"John",40,80000);
       emps[4]=new Employees(105,"Shameer",25,90000);


       for(int i=0;i< emps.length;i++)
       {
           String insertQuery= "insert into employees(empcode,empname,empage,esalary) values";
           insertQuery=insertQuery+"("+emps[i].getEmpcode()+","+"'"+
                                     emps[i].getEmpname()+"'"+","+
                                     emps[i].getEmpage()+","+
                                     emps[i].getEsalary()+")";
           System.out.println("Insert Query Constructed is "+insertQuery);
           ps=conn.prepareStatement(insertQuery);
           ps.executeUpdate();
       }

}
}
