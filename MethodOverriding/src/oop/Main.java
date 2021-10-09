package oop;

public class Main {

    public static void main(String[] args) {

        Bank bank =new Bank();
        System.out.println("Bangladesh Bank Interest Rate: "+bank.rateOfInterest());

        PBL pbl=new PBL();
        System.out.println("Rate OF Interest In PBL: "+pbl.rateOfInterest());

        DBBL dbbl=new DBBL();
        System.out.println("Rate OF Interest In DBBL: "+dbbl.rateOfInterest());

        SBL sbl=new SBL();
        System.out.println("Rate OF Interest In SBL: "+sbl.rateOfInterest());

        JBL jbl=new JBL();
        System.out.println("Rate OF Interest In JBL: "+jbl.rateOfInterest());
    }
}
