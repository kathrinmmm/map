import java.util.Arrays;

class Zahlen {

    public static int[] suma(int[] num1, int[] num2) {
        int[] result = new int[num1.length + 1]; // + 1 pentru transport
        int carry = 0;

        for (int i = num1.length - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry; // Se plasează transportul în prima poziție

        if (result[0] == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        }
        return result;
    }

    public static int[] diferenta(int[] num1, int[] num2) {
        int[] result = new int[num1.length];
        int borrow = 0;

        for (int i = num1.length - 1; i >= 0; i--) {
            int sub = num1[i] - num2[i] - borrow;
            if (sub < 0) {
                sub += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = sub;
        }
        return result;
    }

    public static int[] inmultire(int[] num, int digit) {
        int[] result = new int[num.length];
        int carry = 0;

        for (int i = num.length - 1; i >= 0; i--) {
            int product = (num[i] * digit) + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        // Dacă există transport, creăm un nou tablou care să îl includă
        if (carry > 0) {
            int[] newResult = new int[num.length + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, result.length);
            return newResult;
        }
        return result;
    }

    public static int[] impartire(int[] num, int digit) {
        if (digit == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int[] result = new int[num.length];
        int remainder = 0;

        for (int i = 0; i < num.length; i++) {
            remainder = remainder * 10 + num[i];
            result[i] = remainder / digit;
            remainder %= digit;
        }

        int start = 0;
        while (start < result.length && result[start] == 0) {
            start++;
        }

        if (start == result.length) {
            return new int[]{0};
        }

        return Arrays.copyOfRange(result, start, result.length);
    }
}