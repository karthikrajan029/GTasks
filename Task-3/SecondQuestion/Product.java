public class Product implements Taxable{

    private int pId;
    private double price;
    private long quantity;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }



    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Product(int pId, long price, long quantity) {
        this.pId = pId;
        this.price = price;
        this.quantity = quantity;
    }

    public Product()
    {

    }

    @Override
    public void calcTax() {
        double salesTax;
        salesTax=(price)*((double) 7 /100);
        System.out.println("Sales tax for the unit price of product is "+salesTax);
    }
}
