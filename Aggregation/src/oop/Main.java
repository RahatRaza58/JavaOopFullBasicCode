package oop;

public class Main {

    public static void main(String[] args) {
        Address address=new Address("Sylhet","Bangladesh",115);
        StudentInfo studentInfo =new StudentInfo(2012020058,"Md.Rahat Miah Raza",address);
        studentInfo.display();
	// write your code here
    }
}
