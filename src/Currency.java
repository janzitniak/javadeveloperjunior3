public enum Currency {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    private final int value;

    Currency(int value) {
        this.value = value;
    }
}


class TestEnum {
    public static void main(String[] args) {
        Currency anyCurrency = Currency.PENNY;



    }
}