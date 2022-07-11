package model;

public class Main {
    public static void main(String[] args) {

        VendingMachineImpl vendingMachine= new VendingMachineImpl();
        vendingMachine.addCurrency(Currency.HUNDRA.getValue());
        vendingMachine.addProduct(new Fruit());
        vendingMachine.addProduct(new Drink());
        vendingMachine.addProduct(new Snacks());
        for(String s : vendingMachine.getProducts()){
            System.out.println(s);
        }
        System.out.println(vendingMachine.request(1));
        System.out.println(vendingMachine.getBalance());
    }
}
