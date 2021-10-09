package oop;

public class Student {
    String name;
    int id;

    Student(String name, int id)
    {
        this.name=name;
        this.id=id;

    }
    void  display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);

    }
}
