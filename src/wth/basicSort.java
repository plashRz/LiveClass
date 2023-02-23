package wth;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class basicSort {

    public static void main(String[] args) {

        //cant use primitive with generics...hence using ObjectClass types
        Character[] c = {'c','!','k','Z',',','E','q','a'};
        Integer[] i = {7,3,11,5,6,0,-1,2,0};

        basicSort bs = new basicSort();
        bs.display(c);
        bs.sort(c,"asc");
        bs.display(c);
        bs.sort(c,"dec");
        bs.display(c);
        bs.sort(c,"hahaha");
        bs.display(i);
        bs.sort(i,"asc");
        bs.display(i);
        bs.sort(i,"dec");
        bs.display(i);

    }

    private <T> void display(T c[]) {

        for(T ch : c){
            System.out.print(ch+"\t");
        }
        System.out.println();
    }

    private <T> void sort(T[] c, String asc) {

        T tm;
        int b;

        switch(asc){
            case "asc":
                Arrays.sort(c);
//                for(int j=0;j<c.length-1;j++){
//                    for(int i=0;i<c.length-1;i++){
//                        b = c[i].toString().compareTo(c[i+1].toString());
//                        System.out.println("c[i]: "+c[i]+" c[i+1]: "+c[i+1]+" : "+b);
//                        if(b>=0){
//                        tm=c[i];
//                        c[i]=c[i+1];
//                        c[i+1]=tm;
//                    }
//                }
//            }
                break;

            case "dec":
                Arrays.sort(c, Collections.reverseOrder());
//                for(int j=0;j<c.length-1;j++){
//                    for(int i=0;i<c.length-1;i++){
//                        if(c[i]<c[i+1]){
//                            tm=c[i];
//                            c[i]=c[i+1];
//                            c[i+1]=tm;
//                        }
//                    }
//                }
                break;

            default: System.out.println("The dragon, the witch - and the audacity of this bitch!");
        }



    }

}

//Arrays.sort(array)
//Arrays.sort(array, Collections.reverseOrder);