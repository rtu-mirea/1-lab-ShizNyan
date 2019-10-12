package com.company;

import java.util.Scanner;
import java.io.*;
import java.lang.String;

public class Num1 {

    public void razd(String[] ss){ //делим текст на абзацы
        for (int i = 0; i<ss.length; i++){
            if (ss[i]=="!"){
                System.out.print(ss[i]);
                i+=1;
                System.out.println("\n");
            }
            else if (ss[i]=="?"){
                System.out.print(ss[i]);
                i+=1;
                System.out.println("\n");
            }
            else if (ss[i]=="."){
                System.out.print(ss[i]);
                i+=1;
                System.out.println("\n");
            }
            else {System.out.print(ss[i]);}
        }

    }

}
