import javax.naming.Name;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private Integer rollNo;
    private String name;
    private Integer age;
    private String course;

    public Student(Integer rollNo,String name,Integer age,String course)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.course=course;
    }

    public void check() throws AgeNotWithinException, NameNotValidException {
        if(!(age>=15 && age <=21))
        {
               throw new AgeNotWithinException("Age of the given student is not between 15 and 21");
        }
        else {
            System.out.println("Student age is valid");
        }
        String regex=".*[^a-zA-Z ].*";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher=pattern.matcher(name);
        if(matcher.matches())
        {
            throw new NameNotValidException("Student name contains special characters or numbers");
        }
        else
        {
            System.out.println("Student name is valid");
        }
    }

    public static void main(String[] args) throws AgeNotWithinException, NameNotValidException {
        Integer rollNo;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student rollNo");
        rollNo=sc.nextInt();
        System.out.println("Enter the student name");
        String name;
        name=sc.next();
        System.out.println("Enter the student age");
        Integer age;
        age=sc.nextInt();
        String course;
        System.out.println("Enter the student course");
        course=sc.next();
        Student student=new Student(rollNo,name,age,course);
        student.check();
    }

}
