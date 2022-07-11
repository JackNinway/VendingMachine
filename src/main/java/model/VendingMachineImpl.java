package model;

import java.util.ArrayList;

public class VendingMachineImpl implements VendingMachine{

    private ArrayList<Product>   products = new ArrayList<>();
    private int depositPool;


    public void addProduct(Product p){
        products.add(p);
    }
    @Override
    public void addCurrency(int amount) {
        this.depositPool += amount;
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product p : products){
            if(p.getId() == id) {
                if(depositPool > p.getPrice()) {
                    depositPool -= p.getPrice();
                    return p;
                }
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int id) {
        return null;
    }

    @Override
    public String[] getProducts() {
        String[] retStr = new String[products.size()];
        for (int i=0; i<retStr.length; i++){
            retStr[i] = products.get(i).getProductName();
        }
        return retStr;
    }
}
