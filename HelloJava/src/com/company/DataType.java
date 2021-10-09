package com.company;

public class DataType {
public static void main(String[] args){
    boolean b= true;
    char m= 'R';
    short s= 32677;
    int i= 120;
    float f= 10.2f;
    double d= 36.5;

    System.out.println("Bollean : "+b);
    System.out.println("Charectar : "+m);
    System.out.println("Short : "+s);
    System.out.println("Integer : "+i);
    System.out.println("Float : "+f);
    System.out.println("Double : "+d);

    System.out.printf("\nBollean : %b\n",b);
    System.out.printf("Charectar : %c\n",m);
    System.out.printf("Short : %d\n",s);
    System.out.printf("Integer : %d\n",i);
    System.out.printf("Float : %.2f\n",f);
    System.out.printf("Double : %.1f\n",+d);




}
}
