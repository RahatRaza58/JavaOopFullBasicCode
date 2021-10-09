package oop;

public class Main implements Printable, Showable {

    public static void main(String[] args) {

        Main main= new Main();

        System.out.println("cube Of 7: "+Printable.cude(7));
        main.print();;

        main.show();
        main.text();

        //CenteralBank bank= new PBL();
        //System.out.println("Total Income Of PBL Yearly: "+bank.income());

    }



    @Override
    public void print() {
        System.out.println("\nPrinting");

    }

    @Override
    public void show() {
        System.out.println("Showing");

    }
}
