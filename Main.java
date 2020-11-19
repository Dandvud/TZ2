import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Калькулятор принимает выражения с операндами от 1 (I) до 10 (X) включительно. Числа и операции следует разделять пробелом.");
        System.out.print("Введите выражение: ");
        String expression = sc.nextLine();
        Arabic.arabCalc(expression);
        RomanCalc.romanCalc(expression);
    }
}