import java.util.Scanner;
public class Example29 {
    public static void main(String[] argv) {

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        int dividend, divisor;
        System.out.println("Enter Dividend");
        dividend = inputValue.nextInt();

        System.out.println("Enter divisor");
        divisor = inputValue.nextInt();

        while (dividend >= divisor) {
            dividend = dividend - divisor;
        }

        System.out.println("Remainder = " + dividend);
    }
}
