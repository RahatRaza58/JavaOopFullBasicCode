package oop;

public class Main {

    public static void main(String[] args) {
        int a[]={5,7,9,11,13,15,17,19,21,23};
        int b[]=new int[10];
        b[0]=5;
        b[1]=7;
        b[2]=9;
        b[3]=11;
        b[7]=19;
        b[8]=21;
        b[9]=23;


        System.arraycopy(a, 4, b,4,3);

        System.out.println("Value of a Array:");
        for(int i:a){
            System.out.println(i);
        }
        System.out.println("Value of b Array after applaying arraycopy:");
        for(int i:b){
            System.out.println(i);
        }
        //ArrayClone
        int c[]=b.clone();
        System.out.println("Value of c Array after applaying arrayClone:");
        for(int i:c){
            System.out.println(i);
        }


        // write your code here
    }
}
