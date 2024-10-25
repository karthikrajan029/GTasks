import java.util.Scanner;

public class XYZ {

    public int findPId_of_highestPrice(Product[] p) {

        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j].price > p[j + 1].price) {
                    Product temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
        return p[p.length - 1].pId;
    }

    public long findTotalAmtSpent(Product[] p) {

        long totalAmt = 0;
        for (int i = 0; i < p.length; i++) {
            totalAmt = totalAmt + (p[i].price * p[i].quantity);
        }
        return totalAmt;
    }

    public static void main(String[] args) {
        System.out.println("Enter Product Information, Maximum Five Inputs Allowed");
        int i = 0;
        Scanner sc = new Scanner(System.in);
        Product[] p = new Product[5];
        while (i < 5) {
            int pId;
            long price = 0;
            long quantity = 0;
            System.out.println("Enter " + "Product " + (i + 1) + " Information");
            System.out.println("Enter Product Id");
            pId = sc.nextInt();
            System.out.println("Enter Product Price");
            price = sc.nextLong();
            System.out.println("Enter Product Quantity");
            quantity = sc.nextLong();
            p[i] = new Product(pId, price, quantity);
            i++;
        }
        System.out.println("Five products information successfully entered");
        System.out.println("ProductId with maximum price is ");
        XYZ calc = new XYZ();
        System.out.println(calc.findPId_of_highestPrice(p));
        System.out.println("The total amount spent on all products is");
        System.out.println(calc.findTotalAmtSpent(p));
    }
}
