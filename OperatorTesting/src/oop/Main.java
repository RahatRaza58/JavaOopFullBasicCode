package oop;

public class Main {

    public static void main(String[] args) {

    //Unary Operator
        int a=50;
        ++a;
        System.out.println("\nPrefix Increment Of A: "+a);//A=51
        a++;
        System.out.println("Postfix Increment Of A: "+a);//A=52
        --a;
        System.out.println("Prefix Decrement Of A: "+a);//A=51
        a--;
        System.out.println("Postfix Decrement Of A: "+a);//A=50
        boolean i= false;
        System.out.println("!i: "+!i);

    //Arithmetic Operator
        int s=29%3;
        System.out.println("\nThe Modulas Of 29%3 is: "+s);

    //Relational Operator
        int p=2546;
        int q=2546;
        if(p>q)
        {
            System.out.println("\nLarge Number is: "+p);
        }
        else if(p<q)
        {
            System.out.println("\nLarge Number is: "+q);
        }
        else System.out.println("\nThe Numbers Are Equal.");

    //Logical Operator
        char ch= 'm' ;
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+" is a Vowel");
        }
        else System.out.println(ch+" is a consonant");

    //Ternary Operator
        double marks=40;
        String result=(marks>=40)?"Passed":"Failed";
        System.out.println("\nYou are " +result+" in the exam.");

    //Assignment Operator
        int u=4;
        int v=2;

        u+=v;// u= u+v = 6
        System.out.println("\nX: "+u);
        u-=v;// u= u-v = 4
        System.out.println("X: "+u);
        u*=v;// u= u*v = 8
        System.out.println("X: "+u);
        u/=v;// u= u/v = 4
        System.out.println("X: "+u);
        u%=v;// u= u%v = 0
        System.out.println("X: "+u);



    //Shift Operator
        int m=(13<<3);
        System.out.println("\nLeft Shift Key Of 13: "+m); //13*2^3=104
        int n=(217>>3);
        System.out.println("Left Shift Key Of 217: "+n); //217/2^3=27

    //Bitwise Operator-
        int x=5 & 7;
        System.out.println("\nBitwase 5 & 7 is: "+x);
        int y=5 ^ 7;
        System.out.println("Bitwase  5 ^ 7 is: "+y);
        int z=5 | 7;
        System.out.println("Bitwase  5 | 7 is: "+z);


    //Conditional Operator
       int mark=22;

        if (40<=mark)
        {
            System.out.println("\nResult:Passed \nAnd Your Mark is: "+mark);
        }
        else
        {
            System.out.println("Result: Failed \nAnd Your Mark is: "+mark);
        }






 /*Student student=new Student("Rahat",58);
 student.display();*/




	// write your code here
    }
}
