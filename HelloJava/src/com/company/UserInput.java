package com.company;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String name;
        System.out.print("Enter Your Name: ");
        name= input.nextLine();

        int ID;
        System.out.print("Enter Your ID No: ");
        ID= input.nextInt();

        float house;
        System.out.print("Your House No: ");
        house= input.nextFloat();



        System.out.println("\nWelcome to "+name);
        System.out.println("Your House NUmber:  "+house);
        System.out.println("Your ID: "+ID);
        System.out.println("ASAP We Contact With You,"+name);



        // String name= "Md. Rahat Miah Raza";
        // System.out.println("My name is: "+name);

    }
}
