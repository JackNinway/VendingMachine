package model;

public class Snacks extends Product {
    public Snacks() {
        this.setId(9);
        this.setPrice(Currency.HUNDRA.getValue());
        this.setProductName("Snickers");
    }

    @Override
    public String examine() {

        return "Tasty";
    }

    @Override
    public String use() {

        return "You feel invigorated";
    }
}
