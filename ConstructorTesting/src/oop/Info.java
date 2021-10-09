package oop;

public class Info {
    int age;
    String name;
    static String countryName= "Bangladesh";

    Info(){
        System.out.println("Information List");;
    }
    Info(int age, String name){
        this.age=age;
        this.name=name;
        System.out.println("\nAge: "+age);
        System.out.println("Name: "+name);
    }

void display()
{
    System.out.println("Country: "+countryName);

}
}
