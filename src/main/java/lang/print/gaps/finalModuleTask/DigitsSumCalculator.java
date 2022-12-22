package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int firstDigit = number % 10;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number / 100 % 10;
        int fourthDigit = number / 1000;
        int result = firstDigit + secondDigit + thirdDigit + fourthDigit;
        System.out.println(result);
    }
}
