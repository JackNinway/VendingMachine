package model;

public class Drink extends Product{
    public Drink() {
        this.setId(11);
        this.setPrice(Currency.TIO.getValue());
        this.setProductName("Redbull");
    }

    @Override
    public String examine() {

        return "Looks delicious";
    }

    @Override
    public String use() {
        return "I now have wings";
    }


}
