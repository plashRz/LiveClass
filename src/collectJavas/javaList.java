package collectJavas;

import java.util.ArrayList;
import java.util.List;

public class javaList {

    public static void main(String[] args) {

        // List:: arraylist, linkedList, vector, stack
        // all of these implements list interface
        // it is an ordered collection and non synchronized

        ArrayList<String> arlist = new ArrayList<>();
        List<String> arlist2 = new ArrayList<>();


        //added to list arraylist
        arlist2.add("abc");
        arlist2.add("abc1");
        arlist2.add("abc2");
        arlist2.add("abc3");
        arlist2.add("abc4");

        //added to arraylist
        arlist.add("abc");
        arlist.add("abc1");
        arlist.add("abc2");
        arlist.add("abc3");
        arlist.add("abc4");

        System.out.println(arlist);

        for (String n: arlist2
             ) {
            System.out.println(n);
        }

    }

}
