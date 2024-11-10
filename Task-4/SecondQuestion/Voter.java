import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId,String name,int age) throws AgeNotWithinException {
        this.voterId=voterId;
        this.name=name;
        this.age=age;
        if(this.age<18)
        {
            throw new AgeNotWithinException("Invalid age for voter");
        }
        else
        {
            System.out.println("Voter's age is valid");
        }
    }

    public static void main(String[] args) throws AgeNotWithinException {
        Scanner sc=new Scanner(System.in);
        int voterId;
        String name;
        int age;
        System.out.println("Enter the voter's Id");
        voterId=sc.nextInt();
        System.out.println("Enter the voter's name");
        name=sc.next();
        System.out.println("Enter voter's age");
        age=sc.nextInt();
        Voter voter1=new Voter(voterId,name,age);
    }


}
