package Dz_2.ex_1.ex_3;

import Dz_2.ex_1.InvalidNumberException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());
        int c = Integer.parseInt(scanner.next());
        if (a > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (b < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (a + b < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (c == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        System.out.println("Проверка пройдена успешно");
    }
}
