package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student();
        student.age = 18;
        student.course = 2;
        student.name = "Anna Viugina";
        student.isAlive = false;

        System.out.println(student);
    }
}

class Student
{
    public String name;
    public int age;
    public int course;
    public boolean isAlive;

    public String toString()
    {
        return this.name + ", " + this.age + " y.o.";
    }
}
