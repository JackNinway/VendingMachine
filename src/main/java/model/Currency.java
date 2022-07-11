package model;

public enum Currency {
    ETT(1),
    FEM(5),
    TIO(10),
    FEMTIO(50),
    HUNDRA(100);

    private int value;

    private  Currency(int a){
        this.value = a;
    }

    public int getValue() {
        return value;
    }
}
