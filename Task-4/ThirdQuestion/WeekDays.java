import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args)
    {
        String[] name={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner sc=new Scanner(System.in);
        int index;
        System.out.println("Enter the Day Position");
        index=sc.nextInt();
        if(index<-1 || index>=7)
        {
            throw new ArrayIndexOutOfBoundsException("Entered index is out of the week values. Please enter between 0 to 6 values");
        }
        else {
            System.out.println("The day corresponding to that position is " + name[index]);
        }
    }

}
