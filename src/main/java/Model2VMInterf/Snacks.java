package Model2VMInterf;

public class Snacks implements Product{
    private int id;
    private double price;
    private String productName;

    public Snacks() {
        this.id = 3;
        this.price =33;
        this.productName = "Mars";
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
        return id;
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
        return price;
    }

    @Override
    public void setPrice() {

    }

    @Override
    public String toString() {
        return "Snacks{" +
                "id=" + id +
                ", price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}
