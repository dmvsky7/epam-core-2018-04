package com.epam.homework;

import java.util.Scanner;

public class Task3 {

    /**
     * Ввести N строк с консоли.
     * Вывести те строки, длина которых меньше средней.
     * Под 'средней' подразумевается среднеарифметическая величина длины всех строк, округленная до целого в меньшую сторону.
     *
     * Формат входных данных:
     * N (целое число) - количество доступных для чтения строк
     * N строк
     *
     * Формат выходных данных:
     * В результате выполнения в выходной поток должна быть выведена средняя длина (округленная до целого в меньшую сторону) и строки, удовлетворяющие условию.
     * Порядок появления строк в выходном потоке должен совпадать с порядком их появления во входном.
     *
     * AVERAGE (средняя длина)
     * (длина строки): строка с длиной меньше средней
     * ...
     * (длина строки): строка с длиной меньше средней
     *
     * ------------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     *
     * Входные данные:
     * 5
     * Послушайте!
     * Ведь, если звезды зажигают -
     * Значит - это кому-нибудь нужно?
     * Значит - кто-то хочет, чтобы они были?
     * Значит - кто-то называет эти плевочки жемчужиной?
     *
     * Выходные данные:
     * AVERAGE (31)
     * (11): Послушайте!
     * (28): Ведь, если звезды зажигают -
     */
    public static void main(String[] args) {
        int average = 0;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        String[] strArray = new String[N];

        for (int i = 0; i < N; i++) {
            strArray[i] = in.nextLine();
            average += strArray[i].length();

            if (i == N-1) {
                average /= N;
            }
        }

        System.out.println("AVERAGE (" + average + ")");
        for(String str : strArray) {
             if (str.length() < average) {
                 System.out.println("(" + str.length() + "): " + str);
             }
         }
    }
}
