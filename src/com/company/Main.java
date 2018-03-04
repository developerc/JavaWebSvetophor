package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int greenSec;
        int yellowSec;
        int redSec;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начало");
        try {
            System.out.println("Введите количество секунд для красного:");
            redSec = scanner.nextInt();
            Thread.sleep(1000*redSec);
            System.out.println("Красный горел " + redSec + " сек");

            System.out.println("Введите количество секунд для желтого:");
            yellowSec = scanner.nextInt();
            Thread.sleep(1000*yellowSec);
            System.out.println("Желтый горел " + yellowSec + " сек");

            System.out.println("Введите количество секунд для зеленого:");
            greenSec = scanner.nextInt();
            System.out.println("Для перехода улицы у Вас есть " + greenSec + " секунд!");
            Thread.sleep(1000*greenSec);
            System.out.println("Зеленый горел " + greenSec + " сек");

            System.out.println("Удачи на дорогах!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
