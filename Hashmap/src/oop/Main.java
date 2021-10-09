package oop;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        //put, get
        HashMap<Integer, String>student= new HashMap<Integer,String>();

        student.put(2012020058,"CSE");
        student.put(1922020058,"ENG");
        student.put(1012020058,"EEE");

        System.out.println(student.get(1922020058));
	// write your code here
    }
}
