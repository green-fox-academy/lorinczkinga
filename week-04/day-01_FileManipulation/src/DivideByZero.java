public class DivideByZero {
    public static void main(String[] args) {

        int number = 10;

        try {
            double result = 10 / number;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero.");
        }
        }
}
