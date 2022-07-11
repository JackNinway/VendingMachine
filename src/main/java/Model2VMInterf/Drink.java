package Model2VMInterf;

public class Drink implements Product{
    private int id;
    private double price;
    private String productName;

    public Drink() {
        this.id = 2;
        this.price = 22;
        this.productName = "Cola";
    }

    @Override
    public String examine() {
        return null;
    }

    @Override
    public String use() {
        return null;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String pName) {

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice() {

    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}
