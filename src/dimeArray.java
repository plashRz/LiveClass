import java.util.Scanner;

public class dimeArray {

    public static void main(String[] args) {

        //declare arrays
        int[] numB = new int[2];
        float[][] flo = new float[2][3];

        //Scanner for input
        Scanner scan = new Scanner(System.in);

        //fill array
        for (int x=0;x<numB.length;x++){
            System.out.println("Enter "+x+"th index data=======>");
            numB[x] = scan.nextInt();
        }
        //fill 2d array
        for (int x=0;x<flo.length;x++){
            for (int y=0;y<flo[0].length;y++){
                System.out.println("Enter "+x+"th, "+ y +"th index data======>");
                flo[x][y] = scan.nextFloat();
            }

        }
        //show Array
        for (int x=0;x<numB.length;x++){
            System.out.print(numB[x]+ "  ");
        }

        System.out.println();

        //show 2d Array
        for (int x=0;x<flo.length;x++){
            for (int y=0;y<flo[0].length;y++){
                System.out.print(flo[x][y]+ "  ");
            }
            System.out.println();

        }


    }

}
