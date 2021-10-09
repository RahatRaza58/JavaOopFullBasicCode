package rahatraza;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //StudentInfo studentInfo=new StudentInfo();
        StudentDate studentDate = new StudentDate();
        int a = studentDate.time(25);
        System.out.println("Please select a Status: ");
        System.out.println("1. Student");
        System.out.println("2. Teacher ");
        System.out.println("3. Employer");

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Choose (1-3): ");
        int n = in.nextInt();
      /*  boolean f = false;
        if (n=1) {
            f= true;
            }
       */


            String id, name, department;
            try {
                //Formatter formatter1 = new Formatter("C:/Users/Rahat Raza/IdeaProjects/covid19/teacherdemo.txt");
                Formatter formatter2 = new Formatter("C:/Users/Rahat Raza/IdeaProjects/covid19/studentdemo.txt");
                //Formatter formatter3 = new Formatter("C:/Users/Rahat Raza/IdeaProjects/covid19/employeedemo.txt");
                Scanner input = new Scanner(System.in);

                System.out.print("Enter Your Department: ");
                department = input.next();
                System.out.print("Enter Student ID: ");
                id = input.next();
                System.out.print("Enter name: ");
                name = input.next();
                /*if (id > 201202001 && id < 2012020051) {
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
                }*/



                formatter2.format("%s %s %s", department, id, name);
                formatter2.close();


            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
            try {
                File file = new File("C:/Users/Rahat Raza/IdeaProjects/covid19/studentdemo.txt");
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String fullid = scanner.next();
                    String fullname = scanner.next();
                    String fulldepartment = scanner.next();

                    System.out.println();
                    System.out.println(" *****************************");
                    System.out.println("Name: " + fullname);
                    System.out.print("Department: " + fulldepartment);
                    System.out.print("\nStudent ID: " + fullid);
                    System.out.println("\nDate:" +a+"September");

                }
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println(e);

            }
        }

    }
   /* String sNID, sname, sdepartment;
            try {
                    //Formatter formatter1 = new Formatter("C:/Users/Rahat Raza/IdeaProjects/covid19/teacherdemo.txt");
                    Formatter formatter2 = new Formatter("C:/Users/Rahat Raza/IdeaProjects/covid19/studentdemo.txt");
                    //Formatter formatter3 = new Formatter("C:/Users/Rahat Raza/IdeaProjects/covid19/employeedemo.txt");
                    Scanner input = new Scanner(System.in);

                    System.out.print("Enter NID: ");
                    sNID = input.next();
                    System.out.print("Enter name: ");
                    sname = input.next();
                    System.out.print("Enter Department: ");
                    sdepartment = input.next();


                    formatter2.format("%s %s %s", NID, name, department);
                    formatter2.close();


                    } catch (FileNotFoundException e) {
                    System.out.println(e);
                    }
                    try {
                    File file = new File("C:/Users/Rahat Raza/IdeaProjects/covid19/studentdemo.txt");
                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNext()) {
                    String fullnid = scanner.next();
                    String fullname = scanner.next();
                    String fulldepartment = scanner.next();

                    System.out.println();
                    System.out.println(" *****************************");
                    System.out.println("Name: " + fullname);
                    System.out.print("Department: " + fulldepartment);
                    System.out.println("\nDate:" + a);

                    }
                    scanner.close();
                    } catch (FileNotFoundException e) {
                    System.out.println(e);

                    }
                    }

                    }*/



