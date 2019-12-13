package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Exception;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        System.out.println("Задание 1.1 и 1.2");

        System.out.println("Создать файл MyFile1.txt в папке приложения");
        File F1 = new File("C:\\Users\\Sergey\\1-lab-ShizNyan\\4-lab", "MyFile1.txt");
        try {
            boolean created = F1.createNewFile();
            if(created){
                System.out.println("Файл " +  F1.getName() + " создан.");
                System.out.println("Полный путь к файлу: "+F1.getAbsolutePath());
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();

        System.out.println("Создать файл MyFile2.txt в корне определённого диска(??)");
        File F2 = new File("C:\\Users\\Sergey\\ForLaba4", "MyFile2.txt");
        try {
            boolean created = F2.createNewFile();
            if(created){
                System.out.println("Файл " +  F2.getName() + " создан.");
                System.out.println("Полный путь к файлу: "+F2.getAbsolutePath());
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();

        System.out.println("Создать файл MyFile3.txt в папке ИмяДиска\\\\ИмяПапки\\\\ИмяФайла");
        File F3 = new File("C:\\Users\\Sergey\\ForLaba4\\MyFile3.txt");
        try {
            boolean created = F3.createNewFile();
            if(created){
                System.out.println("Файл " +  F3.getName() + " создан.");
                System.out.println("Полный путь к файлу: "+F3.getAbsolutePath());
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();

        System.out.println("Создать папку третьего уровня, например, Первая\\\\Вторая\\\\Третья");
        File Dir1 = new File("C:\\Users\\Sergey\\ForLaba4\\1");
        Dir1.mkdir();
        File Dir2 = new File("C:\\Users\\Sergey\\ForLaba4\\1\\2");
        Dir2.mkdir();
        File Dir3 = new File("C:\\Users\\Sergey\\ForLaba4\\1\\2\\3");
        try {
            boolean created = Dir3.mkdir();
            if(created){
                System.out.println("Директория третьего уровня " +  Dir3.getName() + " создана.");
                System.out.println("Полный путь к директории: "+Dir3.getAbsolutePath());
            }
        }
        catch(SecurityException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();

        System.out.println("Задание 1.3");
        File Dir4 = new File("C:\\Users\\Sergey\\1-lab-ShizNyan\\4-lab\\ForLaba4");
        Dir4.mkdir();
        File[] fileslist = Dir4.listFiles();
        for (int i = 0; i < fileslist.length; i++)
        {
            if (fileslist[i].isFile()) {
                System.out.println("File : " + fileslist[i].getName());
            } else if (fileslist[i].isDirectory()) {
                System.out.println("Directory : " + fileslist[i].getName());
            }
        }

        F1.delete();
        F2.delete();
        F3.delete();
        Dir3.delete();
        Dir2.delete();
        Dir1.delete();
        Dir4.delete();

        System.out.println("Задание 2");

        System.out.println("");

        try {

            System.out.println("Запись объектов в файл");
            Num2 T2 = new Num2("TASK2.txt");

            Scanner info = new Scanner(System.in);
            System.out.println("Введите название компании 1");
             String creator = info.nextLine();
            System.out.println("Введите цену игрушки 1");
            int cost = info.nextInt();
            System.out.println("Введите мимнимальное возрастное ограничение игрушки 1");
            int agemax = info.nextInt();
            System.out.println("Введите максимальное возрастное ограничение игрушки 1");
            int agemin = info.nextInt();

            Toy T = new Toy(creator, cost, agemin, agemax);
            T2.write(creator, cost, agemin, agemax);
            System.out.println();

            System.out.println("Введите название компании 2");
            String creator2 = info.nextLine();
            System.out.println("Введите цену игрушки 2");
            int cost2 = info.nextInt();
            System.out.println("Введите мимнимальное возрастное ограничение игрушки 2");
            int agemax2 = info.nextInt();
            System.out.println("Введите максимальное возрастное ограничение игрушки 2");
            int agemin2 = info.nextInt();

            Toy T1 = new Toy(creator2, cost2, agemin2, agemax2);
            T2.write(creator2, cost2, agemin2, agemax2);


            ArrayList<Toy> toys = T2.CreatorsList();
            System.out.println("Список производителей");
            System.out.println(toys.toString());

            T2.writeRAF(toys);

            System.out.println("Получение производителя и цены игрушки по возрастным ограничениям: ");
            System.out.println("Минимальный возраст");
            int age1 = info.nextInt();
            System.out.println("Максимальный возраст");
            int age2 = info.nextInt();
            System.out.println(T.getCreatorCost(age1, age2));

            System.out.println("Одинаковые ли у игрушек возрастные ограничения?");
            boolean same = T.compare(T1);
            if (same){System.out.println("У игрушек одинаковые возрастные ограничения");}
            else{System.out.println("У игрушек разные возрастные ограничения");}

            info.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Задание 3");

        try {
            FileReader R = new FileReader("T1.txt");
            FileWriter W = new FileWriter("T2.txt");

            int x;
            while ((x = R.read()) != -1) {
                W.write((char) x);
            }
            R.close();
            W.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        try {
            File f = new File("A.txt");
            f.createNewFile();
            FileReader FR = new FileReader(f);
            BufferedReader BR = new BufferedReader(FR, 128);

            File f2 = new File("B.txt");
            f2.createNewFile();
            FileWriter FW = new FileWriter(f2);
            BufferedWriter BW = new BufferedWriter(FW, 128);

            char[] buf = new char[128];
            for(int i = 0, j = 0; i < f.length(); i++, j++) {
                if(j == buf.length) {
                    j = 0;
                    BW.write("\n");
                }
                buf[j] = (char)BR.read();
                BW.write(buf[j]);
            }

            BR.close();
            BW.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        try {
            BufferedReader BR = new BufferedReader(new InputStreamReader(new FileInputStream("C.txt"), "UTF-8"));
            System.out.println("Действующая кодировка: " + Charset.defaultCharset().name());

            String buf = "";
            int y;
            while ((y = BR.read()) != -1) {
                buf += (char) y;
            }
            System.out.println(buf);

            BR.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Задание 4");

        try {
            ClassTextFile txtF = new ClassTextFile("TASK4.txt");
            System.out.println("Получение объекта из файла");
            PC PC1 = txtF.get();
            System.out.println(PC1);

            ClassSerialization CS = new ClassSerialization("TASK4_SER.txt");
            CS.writeObj(PC1);

            System.out.println();
            System.out.println("Десериализация объекта");
            System.out.println(CS.readObj());

            System.out.println();
            System.out.println("Сериализация листа объектов");

            Scanner scan = new Scanner(System.in);
            System.out.println("Введите название компании");
            String comp = scan.nextLine();
            System.out.println("Введите название компьютера");
            String name = scan.nextLine();
            System.out.println("Введите цену компьютера");
            int costt = scan.nextInt();
            ArrayList<PC> PCs = new ArrayList<>();
            PCs.add(PC1);
            PCs.add(new PC(comp, name, costt));
            CS.setPCs(PCs);
            CS.writeArr();

            System.out.println("Десериализация листа объектов");
            CS.readArr();
            System.out.println(CS.getPCs());

            scan.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}