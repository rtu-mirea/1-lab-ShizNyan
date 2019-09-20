package com.company;

import java.util.Scanner;

public class Array {

    private int n;
    private int x[];
    private int kolvo;
    private int perv, last, ser, k = 0;

    Array (int n) throws Exception{
        if (n<=0) throw new Exception(new String("Количество элементов <=0"));
        this.n = n;
        x = new int [this.n];
    }

    void randInput (int min, int max){//Метод получения псевдо случайного числа
        for (int i = 0; i < n; i++){
            x[i] = (int) (Math.random() * max) + min;
        }
    }

    void consolInput(){//Метод ввода в консоль
        System.out.println("Введите " + n + " Чисел");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            x[i] = in.nextInt();
        }
    }

    void consolOutput(){
        System.out.println("Массив чисел слева-направо");
        for (int i = 0; i < n; i++ ) {
            System.out.println(" " + x[i]);
        }
    }

    void consolOutputperev(){
        System.out.println("Массив чисел справа-налево");
        for (int i = n-1; i >= 0; i-- ) {
            System.out.println(" " + x[i]);
        }
    }

    int findKolvoNumber(int a){
        for (int i = 0; i < n; i++){
            if(x[i] > a) kolvo = kolvo+1;
        }
        return kolvo;
    }

    int newarr(int a, int z){
        for (int i = z; i < a; i++)
        {
            if ((x[i] > 9) & (x[i] < 100))
            {
                last = x[i] % 10;
                perv = (x[i] - last) / 10;
                if (last > perv)
                {
                    return x[i];
                }
            }
            if ((x[i] > 99) & (x[i] < 1000))
            {
                last = x[i] % 10;
                ser = x[i] %100;
                perv = (x[i] - ser) / 100;
                if (last > perv)
                {
                    return x[i];
                }
            }
        }
        return 0;
    }
}

