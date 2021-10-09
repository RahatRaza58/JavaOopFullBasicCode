package oop;

public class Main {
    // Change in NumberOfArguments
     int addition( int a, int b){
        int result=a+b;
        return result;
    }
     int addition( int a, int b, int c){
        int result=a+b+c;
        return result;
    }

    public static void main(String[] args) {

         Main main =new Main();
        System.out.println("Sum: "+main.addition(5,7,8));

        CIDataType c = new CIDataType();
        System.out.println("Multiplication: "+c.multiplication(2,3));

	// write your code here
    }
}
