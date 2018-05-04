package com.epam.homework;

import java.util.Locale;
import java.util.Scanner;

public class Task9 {

    /**
     * С консоли вводятся три целых числа A, B, C.
     * Числа являются коэффициентами, задающими квадратное уравнение в общем виде: A*x^2 + B*x + C = 0
     * Необходимо найти корни этого уравнения.
     * <p>
     * Формат входных данных:
     * Строка, содержащая 3 целых числа, разделенных пробелами
     * <p>
     * Формат выходных данных:
     * В результате решения уравнения может быть получено три варианта ответа:
     * <p>
     * NO ROOTS
     * корень уравнения
     * первый корень уравнения, второй корень уравнения
     * <p>
     * В результате выполнения в выходной поток посылается строка, соответствующая найденному решению.
     * Значения корней округляются до 2 знаков после запятой.
     * В качестве десятичного разделителя используется точка.
     * <p>
     * ---------------------------------------------------------------------------------------------------
     * Примеры выполнения задания:
     * <p>
     * Входные данные:
     * 2 7 0
     * <p>
     * Выходные данные:
     * -3.50, 0.00
     * <p>
     * <p>
     * ---------------------------------------------------------------------------------------------------
     * Входные данные:
     * 4 4 1
     * <p>
     * Выходные данные:
     * -0.50
     * <p>
     * <p>
     * ---------------------------------------------------------------------------------------------------
     * Входные данные:
     * 7 0 35
     * <p>
     * Выходные данные:
     * NO ROOTS
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());
        c = Integer.parseInt(scanner.next());

        if (a == 0 && b == 0) {
            System.out.println("NO ROOTS");
            return;
        }

        if (a == 0 && c == 0) {
            System.out.println("0.00");
            return;
        }

        if (b == 0 && c == 0) {
            System.out.println("0.00");
            return;
        }

        if (a == 0) {
            double x = -c / b;
            System.out.printf(Locale.ENGLISH, "%.2f", x);
            return;
        }

        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("NO ROOTS");
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.printf(Locale.ENGLISH, "%.2f", x);
        } else {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.printf(Locale.ENGLISH, "%.2f", x1);
            System.out.print(", ");
            System.out.printf(Locale.ENGLISH, "%.2f", x2);
        }
    }
}
