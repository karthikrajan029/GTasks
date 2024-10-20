import java.util.Scanner;

public class CalculateFinalPayableAmount_After_Discount {
    public static void main(String[] args)
    {
        System.out.println("Enter the purchase amount");
        Scanner sc=new Scanner(System.in);
        int pAmt=sc.nextInt();
        int amtPayable=0;
        int discount=0;
       if(pAmt>0 && pAmt<500)
       {
           amtPayable=pAmt-discount;
       }
       else if(pAmt>=500 && pAmt<=1000)
       {
           discount=(pAmt*10)/100;
           amtPayable=pAmt-discount;
       }
       else if(pAmt>1000)
       {
           discount=(pAmt*20)/100;
           amtPayable=pAmt-discount;
       }
       else
       {
           System.out.println("Please enter valid purchase amount");
           System.exit(0);
       }
       System.out.println("Amount payable after discount "+amtPayable);
    }
}
