public class FibUtil {
    public long sumOfEvenFibonacciNumbers(long limit) {
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        int evenSum = 0;;

        while (sum < limit) {
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            if (sum % 2 == 0) {
                evenSum = evenSum + sum;
            }
        }
        return evenSum;
    }
}
