import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculate {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String inputDate;
        System.out.println("Enter the birth date in this format yyyy-mm-dd");
        inputDate=sc.next();
        String[] splits=inputDate.split("-");
        Integer year=Integer.valueOf(splits[0]);
        Integer month=Integer.valueOf(splits[1]);
        Integer date=Integer.valueOf(splits[2]);
        LocalDate birthDate=LocalDate.of(year,month,date);
        LocalDate currentDate=LocalDate.now();
        Period period=Period.between(birthDate,currentDate);
        System.out.println(period);
    }
}
