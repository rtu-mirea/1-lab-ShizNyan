package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Num2 {



    DataOutputStream out;
    DataInputStream in;
    RandomAccessFile raf;
    File f;
    int stringSize = 64;


    public Num2(String fileName) throws IOException {
        f = new File(fileName);
        if (f.exists())
            System.out.println("Файл " + f.getName() + " существует");
        else {
            f.createNewFile();
            System.out.println("Файл " + f.getName() + " создан");
        }
        out = new DataOutputStream(new FileOutputStream(f));
        in = new DataInputStream(new FileInputStream(f));
        raf = new RandomAccessFile("RAF_" + f, "rw");
    }

    public void write(String creator, int cost, int agest, int agend) throws IOException {
        writeStr(creator);
        out.writeInt(cost);
        out.writeInt(agest);
        out.writeInt(agend);
    }

    private void writeStr(String str) throws IOException {
        out.writeInt(str.getBytes().length);
        out.writeBytes(str);
    }

    private String readStr() throws IOException {
        int size = in.readInt();
        byte[] str = new byte[size];
        in.read(str);
        return new String(str);
    }

    public ArrayList<Toy> CreatorsList() throws IOException{
        ArrayList Toys4_3 = new ArrayList();

        /*if (in.available() > 0) {
            String company = readStr();
            int cost = in.readInt();
            int agest = in.readInt();
            int agend = in.readInt();
            Toys4_3.add(new Toy(company, cost, agest, agend));
        }*/

        while (in.available() > 0) {
            String company = readStr();
            int cost = in.readInt();
            int agest = in.readInt();
            int agend = in.readInt();
            Toys4_3.add(new Toy(company, cost, agest, agend));
        }

        return Toys4_3;
    }

    public byte[] fillStr(String str) {
        int strSize = str.getBytes().length;
        byte[] res = Arrays.copyOf(str.getBytes(), stringSize);
        for (int i = strSize; i < stringSize; i++) {
            res[i] = 32;
        }
        return res;
    }

    public void writeRAF(ArrayList<Toy> toys) throws IOException {
        raf.setLength(0);
        for (Toy toy : toys) {
            raf.write(fillStr(toy.creator));
            raf.writeInt(toy.cost);
            raf.writeInt(toy.agestart);
            raf.writeInt(toy.ageend);
        }
    }

}
