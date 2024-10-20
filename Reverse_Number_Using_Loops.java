import java.util.Scanner;

public class Reverse_Number_Using_Loops {
    public static void main(String[] args)
    {
        int rem=0;
        int rev=0;
        System.out.println("Enter a number you would like to reverse");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println("Reversed Number is "+rev);

    }
}
