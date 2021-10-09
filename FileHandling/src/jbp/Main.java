package jbp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File dir = new File("C:/Users/Rahat Raza/IdeaProjects/EmployeeEntryList");
        dir.mkdir();
        String path = dir.getAbsolutePath();
        File file1 = new File(path + "/DayShift.text");
        File file2 = new File(path + "/NightShift.text");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("files are Created");
        } catch (Exception e) {
            System.out.println(e);
        }


        String name, id;
        try {
            Formatter formatter = new Formatter("C:/Users/Rahat Raza/IdeaProjects/EmployeeEntryList/DayShift.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("How many Student: ");
            int num = input.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.print("Enter Your Full Name & ID: ");
                name = input.next();
                id = input.next();


                formatter.format("Name: %s & ID: %s\r\n", name, id);
                formatter.close();
            }catch(FileNotFoundException e){
                System.out.println(e);
            }
            // write your code here

        }
    }
}

