package pl.migibud;

public class App {
    public static void main(String[] args) {

        IsOddValidator isOddValidator = new IsOddValidator();
        boolean result = isOddValidator.isOdd(5);
        System.out.println(result);
        boolean result2 = isOddValidator.isOdd(4);
        System.out.println(result2);
        boolean result3 = isOddValidator.isOdd(6);
        System.out.println(result3);


    }
}
