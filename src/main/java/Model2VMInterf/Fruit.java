package Model2VMInterf;

public class Fruit implements Product{
    private int id;
    private double price;
    private String productName;

    public Fruit() {
        this.id = 1;
        this.price = 11;
        this.productName = "Apple";
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
        return "Fruit{" +
                "id=" + id +
                ", price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}
