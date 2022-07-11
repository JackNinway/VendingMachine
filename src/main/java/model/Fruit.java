package model;

public class Fruit extends Product {
    public Fruit() {
        this.setId(1);
        this.setPrice(Currency.FEMTIO.getValue());
        this.setProductName("Apple");

    }

    @Override
    public String examine() {
        return "Macintosh";
    }

    @Override
    public String use() {
        return "Double use";
    }

}
