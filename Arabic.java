public class Arabic {
    public static void arabCalc(String expression) {
        try {
            String[] strArr = expression.split(" ");
            int[] numArr = new int[strArr.length];
            numArr[0] = Integer.parseInt(strArr[0]);
            numArr[1] = Integer.parseInt(strArr[2]);
            String operation = strArr[1];

            if (numArr[0] < 1 || numArr[0] > 10 || numArr[1] < 1 || numArr[1] > 10) {
                System.out.println("Калькулятор принимает операнды только от 1 до 10 включительно. Запустите программу снова.");
            } else {
                switch (operation) {
                    case "+":
                        System.out.println(numArr[0] + numArr[1]);
                        break;
                    case "-":
                        System.out.println(numArr[0] - numArr[1]);
                        break;
                    case "*":
                        System.out.println(numArr[0] * numArr[1]);
                        break;
                    case "/":
                        System.out.println(numArr[0] / numArr[1]);
                        break;
                    default:
                        System.out.println("Символ операции не найден или некорректен. Запустите программу снова.");
                }
            }
        } catch (Exception ex) {
            System.out.println("Выражение не состоит из арабских чисел.");
        } return;
    }
}
