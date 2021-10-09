package oop;

public class StudentInfo {
    int id;
    String name;
    Address address;

    StudentInfo(int id, String name, Address address){

        this.id=id;
        this.name=name;
        this.address= address;
    }
    void display(){
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("City: "+address.city);
        System.out.println("Country: "+address.country);
        System.out.println("House No: "+address.houseNo);

    }
}
