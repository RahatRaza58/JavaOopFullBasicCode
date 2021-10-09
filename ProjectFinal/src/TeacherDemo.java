package file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class TeacherDemo {

    public static void Main(String[] args){
        Data data=new Data();
        int a=data.time(21);

        String NID,name,department;
        try{
            Formatter formatter =new Formatter("D:/javaprogaramming/Covid 19/teacherdemo.txt");
            Scanner input=new Scanner (System.in);

            System.out.print("Enter NID:");
            NID=input.next();
            System.out.print("Enter name :");
            name=input.next();
            System.out.print("Enter  Department:");
            department=input.next();




            formatter.format("%s %s %s",NID,name,department);
            formatter.close();



        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        try{
            File file =new File ("D:/javaprogaramming/Covid 19/teacherdemo.txt");
            Scanner scanner =new Scanner (file);
            while(scanner.hasNext()){
                String fullnid=scanner.next();
                String fullname =scanner.next();
                String fulldepartment=scanner.next();

                System.out.println( " Name: "+fullname + " Department: "+fulldepartment);
                System.out.println("Date:"+a);

            }
            scanner.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }

}