package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        TestArray();
    }

    private static void TestArray(){

        int n, vbr;
        Scanner in = new Scanner (System.in);
        try
        {
            System.out.println("Введите количество элементов массива");
            n = in.nextInt();
            Array array = new Array(n);
            int z = 0;

            System.out.println("Как вы хотите ввести массив?");
            System.out.println("1 - вручную");
            System.out.println("2 - рандомно");
            vbr = in.nextInt();
            switch (vbr)
            {
                case 1: array.consolInput();
                    break;
                case 2: array.randInput(1, 1000);
                    break;
            }

            System.out.println("Как вы хотите вывести массив на экран?");
            System.out.println("1 - слева-направо");
            System.out.println("2 - справа-налево");
            vbr = in.nextInt();
            switch (vbr)
            {
                case 1: array.output();
                    break;
                case 2: array.outputreverse();
                    break;
            }


            System.out.println("Введите число для поиска количества элементов массива больше заданного числа");
            int b = in.nextInt();
            int Kolvo = array.FirstTask(b);
            System.out.println("Количество элементов массива больших " + b + " = " + Kolvo);

            System.out.println("Новый массив, составленный из чисел основного массива, первая цифра которых меньше последней");

            int[] Task2 = array.SecondTask();

            for(int i = 0; i < Task2.length; i++)
            {
                System.out.println(Task2[i]);
            }

            in.close();

        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}