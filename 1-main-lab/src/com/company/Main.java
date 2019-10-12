package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        TestArray();
    }

    private static void TestArray(){
        //final int min = 10;
        //final int max = 75;

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
                case 2: array.randInput(10, 1000);
                    break;
            }

            System.out.println("Как вы хотите вывести массив на экран?");
            System.out.println("1 - слева-направо");
            System.out.println("2 - справа-налево");
            vbr = in.nextInt();
            switch (vbr)
            {
                case 1: array.consolOutput();
                    break;
                case 2: array.consolOutputperev();
                    break;
            }


            System.out.println("Введите число для поиска количества элементов массива больше заданного числа");
            int b = in.nextInt();
            int m = array.findKolvoNumber(b);
            System.out.println("Количество элементов массива больших " + b + " = " + m);

            System.out.println("Новый массив, составленный из чисел основного массива, первая цифра которых меньше последней");
            int[] newar = new int[n];

            newar = array.newarr(n,z);

            for(int i = 0; i < n; i++)
            {
                if (newar[i] != 0)
                {
                    System.out.println(newar[i]);
                }

            }



        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}