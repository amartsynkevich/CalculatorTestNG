import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Throwable {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            Integer number1 = calculator.inputFromConsole(scanner, "первое");
            String sign = calculator.getSign(scanner);
            Integer number2 = calculator.inputFromConsole(scanner, "второе");
            System.out.println("Результат: " + String.valueOf(calculator.calculate(number1, number2, sign)));
            System.out.println("Хочешь продолжить? Введи любой символ. Либо введи \"quit\"");
            if (scanner.next().equals("quit")) {
                break;
            }
        }
        scanner.close();
    }
}