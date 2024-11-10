import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeStudent {
    private Map<String,Integer> map=new HashMap<String,Integer>();

    public void add(String name,Integer grade)
    {
        map.put(name,grade);
        System.out.println("Student's name "+name+" and grade "+grade+" added to the hashmap successfully");
    }

   public void remove(String name)
    {
        if(map.containsKey(name)) {
            map.remove(name);
            System.out.println("Given student " + name + " record is removed from the map");
        }
        else {
            System.out.println("Given student " + name + " record is not present in the map");
        }
    }
    public void display(String name){
        if(map.containsKey(name)){
            System.out.println("Student " +name+" grade is "+map.get(name));
        }
        else
        {
            System.out.println("Given student " + name + " record is not present in the map");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter student's name");
        name=sc.next();
        System.out.println("Enter student's grade");
        Integer grade;
        grade=sc.nextInt();
        GradeStudent gs=new GradeStudent();
        gs.add(name,grade);
        gs.display(name);
        gs.remove(name);
        gs.display(name);


    }
}
