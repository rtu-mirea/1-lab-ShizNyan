package com.company;

import java.io.*;
import java.lang.String;

public class Num1 {

    public String separate(String s){ //делим текст на абзацы
        String[] substr;
        char[] symb;
        String sepss = "";
        String del = " ";
        substr = s.split(del);

        for (int i = 0; i<substr.length; i++){
            symb = substr[i].toCharArray();
            if(symb[symb.length-1]=='!'){
                sepss += substr[i];
                sepss += "\n";
            }
            else if(symb[symb.length-1]=='?'){
                sepss += substr[i];
                sepss += "\n";
            }
            else if(symb[symb.length-1]=='.'){
                sepss += substr[i];
                sepss += "\n";
            }
            else{
                sepss += substr[i] + " ";
            }
        }


        return sepss;
    }

    public String toUpperCase(String s){
        String[] substr;
        char[] symb;
        String news = "";
        String del = " ";
        substr = s.split(del);

        for (int i = 0; i<substr.length; i++){
            symb = substr[i].toCharArray();
            if(Character.isUpperCase(symb[0])){
                for(int j = 0;j<symb.length;j++){
                    news += Character.toUpperCase(symb[j]);
                }
                news +=" ";
            }
            else if(symb[symb.length-2]=='!' || symb[symb.length-1]=='!'){
                for(int j = 0;j<symb.length;j++){
                    news += Character.toUpperCase(symb[j]);
                }
                news +=" ";
            }
            else if(symb[symb.length-2]=='?' || symb[symb.length-1]=='?'){
                for(int j = 0;j<symb.length;j++){
                    news += Character.toUpperCase(symb[j]);
                }
                news +=" ";
            }
            else if(symb[symb.length-2]=='.' || symb[symb.length-1]=='.'){
                for(int j = 0;j<symb.length;j++){
                    news += Character.toUpperCase(symb[j]);
                }
                news +=" ";
            }
            else{
                news += substr[i]+" ";
            }
        }
        return news;
    }

    public int Kolvo_sl(int abz, String s)
    {
        int res = 0;
        String[] substr;
        char[] symb;
        String del = "\n";
        substr = s.split(del);

        if (abz <= substr.length)
        {
            symb = substr[abz-1].toCharArray();
            for(int i = 0; i<symb.length; i++)
            {
                if((symb[i] == 'а' || symb[i] == 'А') && (symb[i+1]== 'м' || symb[i+1]== 'М')){ res++;}
            }
        }
        else
        {
            return -1;
        }

        return res;
    }

    public String addstr(String s)
    {
        int kolvo = 0;
        String[] substr;
        char[] symb;
        String sepss = "";
        String del = " ";
        substr = s.split(del);

        for (int i = 0; i<substr.length; i++){
            kolvo++;
            symb = substr[i].toCharArray();
            if(symb[symb.length-1]=='!'){
                sepss += substr[i];
                sepss += " Количество слов = "+kolvo+".\n";
                kolvo = 0;
            }
            else if(symb[symb.length-1]=='?'){
                sepss += substr[i];
                sepss += " Количество слов = "+kolvo+".\n";
                kolvo = 0;
            }
            else if(symb[symb.length-1]=='.'){
                sepss += substr[i];
                sepss += " Количество слов = "+kolvo+".\n";
                kolvo = 0;
            }
            else{
                sepss += substr[i] + " ";
            }
        }

        return sepss;
    }

}
