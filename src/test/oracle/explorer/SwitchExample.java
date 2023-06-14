package test.oracle.explorer;

public class SwitchExample {
    public static void main(String[] args) {
        int measurement = 2;
        String size = "";
        switch(measurement) {
            case 1: case 2: case 3:
                size = "XL";
                break;
        }
        System.out.println(size);
    }
}
