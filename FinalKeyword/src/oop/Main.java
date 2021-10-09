package oop;

public class Main {

    final int x=15;// Final Keyword Use in Variable

    //Blank Final Variable
    /* final int x;
      Main()
      {
          x=20;
      }*/

    //Static Blank Final Variable
    /*static final int x;
    static
    {
        x=20;
    }*/


    public static void main(String[] args) {
        Main main=new Main();
       // main.x=230;
        System.out.println(main.x);

        Tringle tringle= new Tringle();
        System.out.println("Answer: "+tringle.value(2,6));
	// write your code here
    }
}
