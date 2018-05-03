import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(calculate("/", 10, 5));

    }

    public static Double calculate(String operation , double operandA, double operandB) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expression:");
        double answer = 0;
        operandA = scanner.nextDouble();
        operation = scanner.next();
        operandB = scanner.nextDouble();
        if (operation.equals("+")) {
            answer = operandA + operandB;
        }
        if (operation.equals("-")) {
            answer = operandA - operandB;
        }
        if (operation.equals("*")) {
            answer = operandA * operandB;
        }
        if (operation.equals("/")) {
            answer = operandA / operandB;
        }
        if (operation.equals("%")) {
            answer = operandA % operandB;
        }
        return answer;
    }
}
