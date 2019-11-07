package com.company;

import java.io.*;
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class Num2 {

    public StringBuilder separate(StringBuilder s){ //делим текст на абзацы
        char [] symb = new char[s.length()];
        StringBuilder sepss = new StringBuilder();
        s.getChars(0,s.length(), symb, 0);

        for (int i = 0; i<s.length(); i++){

            if(symb[i]=='!'){
                sepss.append(symb[i])
                    .append("\n");
                i++;
            }
            else if(symb[i]=='?'){
                sepss.append(symb[i])
                        .append("\n");
                i++;
            }
            else if(symb[i]=='.'){
                sepss.append(symb[i])
                        .append("\n");
                i++;
            }
            else if(symb[i] == ' '){
                sepss.append(" ");
            }
            else{
                sepss.append(symb[i]);
            }
        }

        return sepss;
    }

    public StringBuilder toUpperCase(String s){
        String[] substr;
        char [] symb;
        StringBuilder news = new StringBuilder();
        String del = " ";
        substr = s.split(del);

        for (int i = 0; i<substr.length; i++){
            symb = substr[i].toCharArray();
            if(Character.isUpperCase(symb[0])){
                for(int j = 0;j<symb.length;j++){
                    news.append(Character.toUpperCase(symb[j]));
                }
                news.append(" ");
            }
            else if(symb[symb.length-2]=='!' || symb[symb.length-1]=='!'){
                for(int j = 0;j<symb.length;j++){
                    news.append(Character.toUpperCase(symb[j]));
                }
                news.append(" ");
            }
            else if(symb[symb.length-2]=='?' || symb[symb.length-1]=='?'){
                for(int j = 0;j<symb.length;j++){
                    news.append(Character.toUpperCase(symb[j]));
                }
                news.append(" ");
            }
            else if(symb[symb.length-2]=='.' || symb[symb.length-1]=='.'){
                for(int j = 0;j<symb.length;j++){
                    news.append(Character.toUpperCase(symb[j]));
                }
                news.append(" ");
            }
            else{
                news.append(substr[i])
                    .append(" ");
            }
        }
        return news;
    }

    public StringBuilder addstr(StringBuilder s)
    {
        int kolvo = 0;
        char [] symb = new char[s.length()];
        StringBuilder sepss = new StringBuilder();
        s.getChars(0,s.length(), symb, 0);

        for (int i = 0; i<s.length(); i++){
            if(symb[i]=='!'){
                kolvo++;
                sepss.append(symb[i])
                        .append(" Количество слов = ")
                        .append(kolvo)
                        .append(".")
                        .append("\n");
                i++;
                kolvo = 0;
            }
            else if(symb[i]=='?'){
                kolvo++;
                sepss.append(symb[i])
                        .append(" Количество слов = ")
                        .append(kolvo)
                        .append(".")
                        .append("\n");
                i++;
                kolvo = 0;
            }
            else if(symb[i]=='.'){
                kolvo++;
                sepss.append(symb[i])
                        .append(" Количество слов = ")
                        .append(kolvo)
                        .append(".")
                        .append("\n");
                i++;
                kolvo = 0;
            }
            else if(symb[i] == ' '){
                sepss.append(" ");
                kolvo++;
            }
            else{
                sepss.append(symb[i]);
            }
        }

        return sepss;
    }
}
