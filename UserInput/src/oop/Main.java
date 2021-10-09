package oop;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        int id;

        System.out.print("Enter Your Name: ");
        name= s.nextLine();
        System.out.print("Enter Your ID: ");
        id= s.nextInt();

        System.out.println("Name:"+name+ ", ID:"+id);
	// write your code here
    }
}
