import java.util.Scanner;

public class Positive_Or_Negative_Number {
    public static void main(String[] args)
    {
        System.out.println("Enter a number to find positive or negative");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=0) {
            System.out.println("The given number "+num+" is positive number");
        }
        else {
            System.out.println("The given number "+num+" is negative number");
        }
    }
}
