package Model2VMInterf;

public class Main {
    public static void main(String[] args) {

        VendingMachineImpl vendingMachine= new VendingMachineImpl();
        vendingMachine.addCurrency(Currency.HUNDRED.getValue());
        vendingMachine.addProduct(new Fruit());
        vendingMachine.addProduct(new Drink());
        vendingMachine.addProduct(new Snacks());
        for(String s : vendingMachine.getProducts()){
            System.out.println(s);
        }
        System.out.println("requested product: " + vendingMachine.request(1));
        System.out.println(vendingMachine.getBalance());
        System.out.println(vendingMachine.endSession());

    }
}
