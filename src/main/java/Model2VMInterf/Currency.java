package Model2VMInterf;

public enum Currency {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWNETY(20),
    FIFTY(50),
    HUNDRED(100);

    private int value;

    private  Currency(int a){
        this.value = a;
    }

    public int getValue() {
        return value;
    }
}
