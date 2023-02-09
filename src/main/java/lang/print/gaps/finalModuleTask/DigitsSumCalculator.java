package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int firstNumber = number % 10;
        int secondNumber = number % 100 / 10;
        int thirdNumber = number % 1000 / 100;
        int fourthNumber = number / 1000;

        int sum  = firstNumber + secondNumber + thirdNumber + fourthNumber;

        System.out.println(sum);
    }
}
