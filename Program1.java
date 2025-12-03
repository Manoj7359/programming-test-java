// Program-1.java
// Language: Java
// Problem-1: Simple Calculator using class

import java.util.Scanner;

public class Program1 {
    private double a;
    private double b;
    private String operation;

    public Program1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation.toLowerCase()) {
            case "add": case "+": return a + b;
            case "sub": case "-": return a - b;
            case "mul": case "*": case "x": return a * b;
            case "div": case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid Operation");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter Operation (add/sub/mul/div): ");
        String op = sc.next();

        Program1 calc = new Program1(a, b, op);
        System.out.println("Result = " + calc.calculate());
        sc.close();
    }
}
