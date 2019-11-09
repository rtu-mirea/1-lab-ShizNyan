package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Num3 {
    String regex = "^(\\d)\\1{1}$";
    String regex2 = "(\\d)\\1{1}";
    Pattern p = Pattern.compile(regex);
    Pattern p2 = Pattern.compile(regex2);

    String s = "";

    public Num3(String s1){
        s = s1;
    }

    public boolean match(){
        Matcher m = p.matcher(s);
        return m.find();
    }

    public String change(){
        String news = "";
        Matcher m = p2.matcher(s);
        if(m.find()){
            news = m.replaceAll("*");
        }
        return news;
    }
}
