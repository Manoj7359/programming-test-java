// Program-3.java
// Conditional odd number series based on 'a'
// If a is odd → print a odd numbers
// If a is even → print (a-1) odd numbers

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int limit = (a % 2 == 0) ? (a - 1) : a;
        int count = (limit + 1) / 2;

        for (int i = 1; i <= count; i++) {
            System.out.print((2 * i - 1));
            if (i != count) System.out.print(", ");
        }
        sc.close();
    }
}
