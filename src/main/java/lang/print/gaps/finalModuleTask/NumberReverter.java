package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds = number % 10 * 100;
        int digits = (number % 100 - number % 10) ;
        int decimal = number / 100;

        System.out.println(hundreds + digits + decimal);
    }
}
