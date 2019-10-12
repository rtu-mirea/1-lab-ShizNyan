package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 0;
        while (num!=4){
            Scanner in = new Scanner(System.in);
            System.out.println("Выберите задание:");
            System.out.println("1. Задание 1");
            System.out.println("2. Задание 2");
            System.out.println("3. Задание 3");
            System.out.println("4. Выход");
            num = in.nextInt();
            switch (num) {
                case 1:
                    Num1();
                    break;
                case 2:
                    Num2();
                    break;
                case 3:
                    Num3();
                    break;
                case 4:
                    break;
            }
        }

    }

    public static void Num1(){
        System.out.println("Введите текст, состоящий из предложений, оканчивающихся на .!?");
        Scanner instr = new Scanner(System.in);
        Num1 n1 = new Num1();
        String s = instr.nextLine();
        String[] substr;
        String del = " ";
        substr = s.split(del);
        n1.razd(substr);

    }

    public static void Num2(){
        System.out.println("Введите текст, состоящий из предложений, оканчивающихся на .!?");

    }

    public static void Num3(){
        System.out.println("Введите текст, состощий из цифр (???)");

    }
}
