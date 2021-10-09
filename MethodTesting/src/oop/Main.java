package oop;
import java.util.Scanner;

public class Main {
   /* private int sum(int a, int b)// private class
    {
        int result= a+b;
        return result;
    }*/

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //Main main = new Main();//private Class objct
        Operation operation= new Operation(); //public class object
        int a,b,sum;

        System.out.print("Enter the first Integer number: ");
        a= s.nextInt();
        System.out.print("Enter the second Integer number: ");
        b= s.nextInt();

         //sum= main.sum(a,b);//Private Class
        sum= operation.sum(a,b); //Public Class


        System.out.println("The sum of "+a+" and "+b+"= "+sum);

	// write your code here
    }
}
