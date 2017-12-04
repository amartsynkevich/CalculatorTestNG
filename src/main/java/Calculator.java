import java.util.Scanner;

public class Calculator {

    public Calculator() {
        super();
    }

    public Integer calculate(Integer numOne, Integer numTwo, String sign) {
        Integer result = null;
        switch (sign) {
            case "+":
                result = compose(numOne, numTwo);
                break;
            case "-":
                result = substract(numOne, numTwo);
                break;
        }
        return result;
    }

    public Integer inputFromConsole(Scanner scanner, String valueNumber) {
        Integer value = 0;
        while (true) {
            System.out.println("Введите " + valueNumber + " число: ");
            String str = scanner.next();
            try {
                value = Integer.parseInt(str);
                break;
            } catch (Throwable t) {
                System.out.println("Введено некорректное значение. Попробуйте еще раз");
            }
        }
        return value;
    }
    public String getSign (Scanner scanner) {
        String sign;
        while (true) {
            System.out.println("Введите знак арифметического действия: ");
            try {
                sign = String.valueOf(scanner.next());
                if (!sign.equals("+") && !sign.equals("-")) {
                    throw new Error();
                }
                break;
            } catch (Throwable t) {
                System.out.println("Введено некорректное значение. Попробуйте еще раз");
            }
        }
        return sign;
    }

    private Integer compose(Integer numOne, Integer numTwo) {
        return numOne + numTwo;
    }

    private Integer substract(Integer numOne, Integer numTwo) {
        return numOne - numTwo;
    }
}
