package com.company;

import java.util.Scanner;
import java.lang.StringBuilder;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int num = 0;
        while (num!=4){
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
        in.close();
    }

    public static void Num1(){
        System.out.println("Введите текст, состоящий из предложений, оканчивающихся на .!?");
        Scanner instr = new Scanner(System.in);

        String s = instr.nextLine();
        Num1 n1 = new Num1(s);

        System.out.println("Текст, разделённый на абзацы:");
        String z1 = "";
        z1 = n1.separate();
        System.out.println(z1);

        System.out.println("Текст, разделённый на абзацы, с каждым первым и последним словом прописными буквами:");
        String z2 = "";
        z2 = n1.toUpperCase();
        System.out.println(z2);

        System.out.println("Выберите абзац, количество слов с сочетанием букв 'ам' в котором хотите посчитать:");
        System.out.println(z1);
        int num = 0;
        num = instr.nextInt();
        int res = 0;
        res = n1.Kolvo_sl(num);
        if (res == -1){
            System.out.println("В тексте нет такого абзаца!");
        }
        else{
            System.out.println("Количество слов с подстрокой 'ам' = "+ res);
        }

        System.out.println("Текст вида 'Текст. Количество слов в предложении = кол-во слов.':");
        String z4 = "";
        z4 = n1.addstr();
        System.out.println(z4);

        instr.close();
    }

    public static void Num2(){
        System.out.println("Введите текст, состоящий из предложений, оканчивающихся на .!?");
        Scanner instr = new Scanner(System.in);

        Num2 n2 = new Num2();
        StringBuilder s = new StringBuilder(instr.nextLine());
        System.out.println("Текст, разделённый на абзацы:");
        StringBuilder z1 = new StringBuilder();
        z1 = n2.separate(s);
        System.out.println(z1);

        System.out.println("Текст, разделённый на абзацы, с каждым первым и последним словом прописными буквами:");
        StringBuilder z2 = new StringBuilder();
        StringBuilder z21 = new StringBuilder();
        String ss = s.toString();
        z2 = n2.toUpperCase(ss);
        z21 = n2.separate(z2);
        System.out.println(z21);

        System.out.println("Текст вида 'Текст. Количество слов в предложении = кол-во слов.':");
        StringBuilder z4 = new StringBuilder();
        z4 = n2.addstr(s);
        System.out.println(z4);

        instr.close();
    }

    public static void Num3(){
        Scanner instr = new Scanner(System.in);

        Num3 n3 = new Num3();
        System.out.println("Введите строку, состоящую из цифр (???)");
        String s = instr.nextLine();


        boolean match = false;
        match = n3.match(s);
        if(match){
            System.out.println("Строка состоит из 2 одинаковых цифр.");
        }
        else{System.out.println("Строка не состоит из 2 одинаковых цифр.");}

        String txt = "12 text hello 123 55 66 kek no 90";
        String res = "";
        res = n3.change(txt);
        System.out.println("Текст с одинаковыми двузначными числами, заменёнными на '*'");
        System.out.println(res);

        instr.close();
    }
}
