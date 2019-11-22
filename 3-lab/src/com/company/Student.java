package com.company;

public class Student extends User {

    int qcount = 0;
    int rightansw = 0;

    public Student(){

    }

    public Student(String name1, String login1, String password1, int qcount1, int rightansw1){
        super(name1, login1, password1);
        qcount = qcount1;
        rightansw = rightansw1;
    }

    public void getAnswer(Question q, String answer){
        if(q.isCorrect(answer)){
            rightansw++;
        }
        qcount++;
    }
}
