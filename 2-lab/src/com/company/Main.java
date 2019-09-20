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

        int n;
        Scanner in = new Scanner (System.in);
        try
        {
            System.out.println("Введите количество элементов массива");
            n = in.nextInt();
            Array array = new Array(n);
            int arrnew, z = 0;

            array.consolInput();
            array.consolOutput();

            System.out.println("Введите число для поиска количества элементов массива больше заданного числа");
            int b = in.nextInt();
            int m = array.findKolvoNumber(b);
            System.out.println("Количество элементов массива больших " + b + " = " + m);

            System.out.println("Новый массив, составленный из чисел основного массива, первая цифра которых меньше последней");
            for(int i = 0; i < n; i++)
            {
                arrnew = array.newarr(n, z);
                if (arrnew != 0)
                {
                    System.out.println(arrnew);
                    z+=2;
                }
                else z+=1;

            }



        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
