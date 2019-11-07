package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Num3 {

    public boolean match(String s, String regex){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.find()){
            return true;
        }
        else {
            return false;
        }
    }

    public String change(String s, String regex){
        String news = "";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        if(m.find()){
            news = m.replaceAll("*");
        }
        return news;
    }
}
