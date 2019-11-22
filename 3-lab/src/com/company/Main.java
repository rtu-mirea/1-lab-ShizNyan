package com.company;

//import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        Student currU = new Student();
        Student[] Users = new Student[100];
        Question[] Questions = new Question[100];

        int num;
        int indexU = 0;
        int indexQ = 0;
        boolean run = true;

        while (run) {
            System.out.println("Выберите действие:");
            System.out.println("1 - Регистрация");
            System.out.println("2 - Вход");
            System.out.println("3 - Добавить вопрос");
            System.out.println("4 - Сдать экзамен");
            System.out.println("5 - Загрузить результаты");
            System.out.println("6 - Выйти");

            num = in.nextInt();

            switch (num) {
                case 1:
                    String vvod1 = "", vvod2 = "", vvod3 = "";
                    System.out.println("Введите своё имя:");
                    vvod1 = str.nextLine();
                    System.out.println("Введите свой логин:");
                    vvod2 = str.nextLine();
                    System.out.println("Введите свой пароль:");
                    vvod3 = str.nextLine();

                    Student u = new Student(vvod1, vvod2, vvod3, 0, 0);
                    Users[indexU] = u;
                    indexU++;
                    break;

                case 2:
                    int NO = 0;
                    String logg = "", pass = "";
                    System.out.println("Введите свой логин:");
                    logg = str.nextLine();
                    System.out.println("Введите свой пароль:");
                    pass = str.nextLine();
                    for(int i = 0; i<indexU;i++){
                        if(Users[i].Enter(logg, pass)){
                            System.out.println("Вход в аккаунт произведён.");
                            currU = Users[i];
                            break;
                        }
                        else{
                            NO++;
                        }
                    }
                    if(NO == indexU){
                        System.out.println("Такого аккаунта не существует.");
                    }
                    break;

                case 3:
                    String question = "", answer = "";
                    int kolvoq = 0;
                    System.out.println("Сколько вопросов Вы хотите добавить?");
                    kolvoq = in.nextInt();
                    for(int i = 0; i<kolvoq; i++){
                        System.out.println("Введите вопрос:");
                        question = str.nextLine();
                        System.out.println("Введите правильный ответ:");
                        answer = str.nextLine();
                        Question q = new Question(question, answer);
                        Questions[indexQ] = q;
                        indexQ++;
                    }
                    break;

                case 4:
                    String youransw = "";
                    for(int i = 0; i<indexQ;i++){
                        int numq = i+1;
                        System.out.println(numq+" вопрос:");
                        System.out.println(Questions[i].getText());
                        System.out.println("Выш ответ:");
                        youransw = str.nextLine();
                        if(Questions[i].isCorrect(youransw)){
                            currU.rightansw++;
                        }
                        currU.qcount++;
                    }
                    System.out.println("Результаты экзамена:");
                    System.out.println("Общее количество вопросов: "+currU.qcount);
                    System.out.println("Количество правильных ответов: "+currU.rightansw);
                    break;

                case 5:
                    System.out.println("Результаты экзамена:");
                    System.out.println("Общее количество вопросов: "+currU.qcount);
                    System.out.println("Количество правильных ответов: "+currU.rightansw);
                    break;

                case 6:
                    run = false;
                    break;
            }

        }
        in.close();
        str.close();
    }
}
