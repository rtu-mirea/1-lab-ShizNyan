package com.company;

import java.util.Scanner;

public class Array {

    private int n;
    private int x[];
    private int kolvo;
    private int perv, last, iznx = 0, k = 0;


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

    void output(){
        System.out.println("Массив чисел слева-направо");
        for (int i = 0; i < n; i++ ) {
            System.out.println(" " + x[i]);
        }
    }

    void outputreverse(){
        System.out.println("Массив чисел справа-налево");
        for (int i = n-1; i >= 0; i-- ) {
            System.out.println(" " + x[i]);
        }
    }

    int FirstTask(int a){
        for (int i = 0; i < n; i++){
            if(x[i] > a) kolvo = kolvo+1;
        }
        return kolvo;
    }

    int[] SecondTask(){
        int [] temp = new int[n];
        int neededlength = 0;
        int z = 0;
        for (int i = 0; i < n; i++)
        {
            iznx = x[i];
            last = x[i]%10;
            while (x[i]!=0)
            {
                if (x[i]<10) perv = x[i]%10;
                x[i]/=10;
            }
            if (last>perv) {temp[i] = iznx; neededlength++;}
        }

        int [] res = new int[neededlength];

        for(int i = 0; i < n; i++)
        {
            if (temp[i] != 0)
            {
                res[z] = temp[i];
                z++;
            }
        }
        return res;
    }
}