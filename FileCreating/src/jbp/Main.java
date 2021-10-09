package jbp;

//import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
      /*  Scanner i = new Scanner(System.in);
        int digit;

        System.out.print("Please enter a single digit : ");
        digit = i.nextInt();

        switch (digit) {
            case 0:
                System.out.println("Your Enter Value is: Zero");
                break;
            case 1:
                System.out.println("Your Enter Value is: One");
                break;*/
            String name, dept;
            int id, batch;


            System.out.println("Vaccine Registration For CSE Department(53Rd Batch)  Students");

            try {
                Formatter formatter = new Formatter("C:/IdeaProjects/FileCreating/DataEntryList/Students.txt");
                Scanner input = new Scanner(System.in);

           /* System.out.println("How many Student: ");
            int num= input.nextInt();*/

                // System.out.print("\nEnter Your Department: ");

           /* while (input.hasNext()){

                System.out.print("Enter Your ID: ");
            String dept= input.next();
            String id= input.next();
                System.out.println("\nYour Department: "+dept);
                System.out.println("ID: "+id);
                System.out.println("Your Vaccination Date: 15 October 2021 (10 to 11 Am) "+id);*/

                //for (int i=1; i<=1;i++){
                System.out.print("Enter Your Full Name: ");
                name = input.nextLine();
                System.out.print("Enter Your Full ID: ");
                id = input.nextInt();


                if (id > 201202001 && id < 2012020051) {
                    System.out.println("\nThank You," + name + " .\nYou Registration is now complete.");
                    System.out.println("Your Vaccination Date is 25 October");
                    System.out.println("You must be join this day 10.00am to 12.00am.");
                } else if (id > 201202050 && id < 2012020101) {
                    System.out.println("\nThank You," + name + ".\nYou Registration is complete");
                    System.out.println("Your Vaccination Date is 25 October");
                    System.out.println("You must be join this day 01.00pm to 03.00pm.");
                } else if (id > 2012020100 && id < 2012020151) {
                    System.out.println("\nThank You," + name + ".You Registration is complete");
                    System.out.println("Your Vaccination Date is 26 October");
                    System.out.println("You must be join this day 10.00am to 12.00am.");
                } else if (id > 2012020150 && id < 2012020201) {
                    System.out.println("\nThank You," + name + " .You Registration is complete");
                    System.out.println("Your Vaccination Date is 26 October");
                    System.out.println("You must be join this day 01.00pm to 03.00pm.");
                } else if (id > 2012020200 && id < 2012020251) {
                    System.out.println("\nThank You," + name + " .You Registration is complete");
                    System.out.println("Your Vaccination Date is 27 October");
                    System.out.println("You must be join this day 10.00am to 12.00am.");
                } else if (id > 2012020250 && id < 2012020301) {
                    System.out.println("\nThank You," + name + " .You Registration is complete");
                    System.out.println("Your Vaccination Date is 27 October");
                    System.out.println("You must be join this day 01.00pm to 03.00pm.");
                } else if (id > 2012020300 && id < 2012020351) {
                    System.out.println("\nThank You," + name + " .You Registration is complete");
                    System.out.println("Your Vaccination Date is 28 October");
                    System.out.println("You must be join this day 10.00am to 12.00am.");
                } else {
                    System.out.println("Sorry Your ID number didn't match");
                }

                formatter.format("Name: %s & Student ID: %s\r\n", name, id);


                //}
                formatter.close();
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }

        /*  formatter.format("%s %s\r\n", "205", "Rahat");
            formatter.format("%s %s\r\n", "204", "Ragib");
            formatter.format("%s %s\r\n", "203", "Sakib");
            formatter.format("%s %s\r\n", "202", "Rahim");*/
        /*  File dir= new File("C:/IdeaProjects/FileCreating/DataEntryList");
        dir.mkdir();
       String path= dir.getAbsolutePath();

       File file1= new File(path+"/Student.text");
       File file2= new File(path+"/Teacher.text");

       try {
           file1.createNewFile();
           file2.createNewFile();
           System.out.println("files are Created");

       }catch (Exception e){
           System.out.println(e);
       }*/
        /* file2.delete();

       if(file2.exists()){
           System.out.println("File 2 exists");
       }else {
           System.out.println("File 2 doesn't exists");

       }*/


            // write your code here
        }
    }

