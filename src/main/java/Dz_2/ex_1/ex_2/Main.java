package Dz_2.ex_1.ex_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers: ");
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        System.out.println(a / b);
    }
}
