package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Num3 {
    String regex = "^(\\d)\\1{1}$";
    String regex2 = "(\\d)\\1{1}";
    Pattern p = Pattern.compile(regex);
    Pattern p2 = Pattern.compile(regex2);

    public boolean match(String s){
        Matcher m = p.matcher(s);
        return m.find();
    }

    public String change(String s){
        String news = "";
        Matcher m = p2.matcher(s);
        if(m.find()){
            news = m.replaceAll("*");
        }
        return news;
    }
}
