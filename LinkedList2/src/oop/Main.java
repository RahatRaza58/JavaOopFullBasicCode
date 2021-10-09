package oop;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Student List
        LinkedList<StudentInfo>list=new LinkedList<StudentInfo>();
        //Student Create
        StudentInfo s1= new StudentInfo("CSE","Rahat",2012020058);
        StudentInfo s2= new StudentInfo("EEE","Mahmud",1922020045);
        StudentInfo s3= new StudentInfo("ENG","Hridoy",456020058);
        StudentInfo s4= new StudentInfo("BBA","Nayeem",365202054);
        StudentInfo s5= new StudentInfo("BAN","Emran",852020099);
        StudentInfo s6= new StudentInfo("PHY","Parvez",242020075);

        //Adding Student to the list
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        for (StudentInfo s: list)
        {
            System.out.println(s.department+"-  "+s.name+":"+s.id);

        }
    }
}
