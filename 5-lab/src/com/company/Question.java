package com.company;

public class Question {

    String text;
    String answer;

    public Question(String text1, String answer1){
        text = text1;
        answer = answer1;
    }

    public String getText(){
        return text;
    }

    public boolean isCorrect(String answer1){
        if(answer.equals(answer1)){
            return true;
        }
        return false;
    }
}
