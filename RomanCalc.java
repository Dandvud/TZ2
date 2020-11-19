public class RomanCalc {
    public static void romanCalc(String expression) {
        try {
            String[] strArr = expression.split(" ");
            String[] numArr = new String[strArr.length];
            numArr[0] = strArr[0];
            numArr[1] = strArr[2];
            String operation = strArr[1];
            int num1 = RomanToArabic.romanToArabic(numArr[0]);
            int num2 = RomanToArabic.romanToArabic(numArr[1]);
            int result;

            switch (operation) {
                case "+":
                    result = num1+num2;
                    System.out.println(ArabicToRoman.arabicToRoman(result));
                    break;
                case "-":
                    result = num1-num2;
                    System.out.println(ArabicToRoman.arabicToRoman(result));
                    break;
                case "*":
                    result = num1*num2;
                    System.out.println(ArabicToRoman.arabicToRoman(result));
                    break;
                case "/":
                    result = num1/num2;
                    System.out.println(ArabicToRoman.arabicToRoman(result));
                    break;
                default:
                    System.out.println("Символ операции не найден или некорректен. Запустите программу снова.");
            }
        } catch (Exception ex) {
            System.out.println("Калькулятор принимает выражения с операндами от 1 (I) до 10 (X) включительно. Числа и операции следует разделять пробелом.");
        } return;
    }
}
