package com.company;

public class Main {

    public static void main(String[] args) {
        double numbers[] = {1.1, -1.1, 2.1, -2.1, 3.1, -3.1, 4.1, 5.1, 6.1, 7.1, 8.1, -9.1, 10.1, -11.1, 12.1};
        double results = 0;
        int wtf = 0;
        for (int i = 0; i < numbers.length; i++)
            if (wtf < numbers[i])
                results = results + numbers[i];
        System.out.println("Среднее значение равно " + results / 9);
    }
}
