import java.util.Scanner;

public class SmallestAmongThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter Three Numbers to Find Smallest Among Three Numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Enter Third Number");
        int c = sc.nextInt();
        if (a < b) {
            if (a < c) {
                System.out.println("First Number "+a+" is smallest");
            } else {
                System.out.println("Third Number "+c+" is smallest");
            }
        } else if (b < a) {
            if (b < c) {
                System.out.println("Second Number "+b+" is smallest");
            } else {
                System.out.println("Third Number " +c+ " is smallest");

            }
        }

    }
}
