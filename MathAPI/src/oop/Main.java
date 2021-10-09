package oop;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public  static  void calculateFactorial(int n)
    {
        BigInteger result =BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            result=result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n+"!= "+result);
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter a Integer number: ");
        int a=input.nextInt();
        for(int i=1;i<=a;i++)
        {
            calculateFactorial(i);
        }





        /*BigInteger a =new BigInteger("11111111111111111111111125884");
        System.out.println(a);
        BigInteger b =BigInteger.TWO;
        System.out.println(b);
        BigInteger c= BigInteger.valueOf(5);
        System.out.println(c);*/
	// write your code here
    }
}
