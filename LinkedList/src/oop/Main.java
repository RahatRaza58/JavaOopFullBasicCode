package oop;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String>iccT20Rank= new LinkedList<String>();

        iccT20Rank.add("South Africa");
        iccT20Rank.add("India");
        iccT20Rank.add("Pakistan");
        iccT20Rank.add("Newzealand");
        iccT20Rank.add("Austrilia");
        iccT20Rank.add("Bangladesh");
        iccT20Rank.add("Windies");
        iccT20Rank.add("Afganistan");
        iccT20Rank.add("Srilanka");
        iccT20Rank.add(9,"Zimbabwe");
        /*iccT20Rank.addFirst("Nepal");
        iccT20Rank.removeFirst();
        iccT20Rank.addLast("Ireland");
        iccT20Rank.removeLast();*/


       // System.out.println(iccT20Rank);
        for(String t20Rank: iccT20Rank)
        {
            System.out.println(t20Rank);
        }
        System.out.println("\nTotal Ranked Country: "+iccT20Rank.size());
        System.out.println("ICC T20 Ranked First Country: "+iccT20Rank.getFirst());
        System.out.println("ICC T20 Ranked Last Country: "+iccT20Rank.getLast());

        iccT20Rank.clear();
        System.out.println(iccT20Rank);

	// write your code here
    }
}
