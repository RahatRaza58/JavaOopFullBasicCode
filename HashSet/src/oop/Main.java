package oop;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<String>fruitsName= new HashSet<String>();

        fruitsName.add("orange");
        fruitsName.add("Mango");
        fruitsName.add("Apple");
        fruitsName.add("JackFruit");

        System.out.println(fruitsName);
        System.out.println("Size: "+fruitsName.size());

        fruitsName.remove("orange");
        System.out.println(fruitsName);
        System.out.println("Size: "+fruitsName.size());

        /*fruitsName.clear();
        System.out.println(fruitsName);*/

        boolean value= fruitsName.isEmpty();
        System.out.println(value);

	// write your code here
    }
}
