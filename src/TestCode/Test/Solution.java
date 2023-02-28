package TestCode.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class Result {

    /*
     * Complete the 'calculateGrade' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY students_marks as parameter.
     */

    public static String[] calculateGrade(int[][] students_marks) {

        String[] result = new String[students_marks.length];
        int[] avgScore = new int[students_marks.length];
        int score=0;

        for(int x = 0; x < students_marks.length; x++ ){

            for(int y = 0; y < students_marks[0].length; y++ ){

                score = score + students_marks[x][y];

            }
            avgScore[x] = score/students_marks[0].length;
            score=0;

        }

        for(int i =0;i<avgScore.length;i++){

        if(avgScore[i]>=90){

            result[i]="A+";

        } else if(avgScore[i]>=80 && avgScore[i]<90){
            result[i]="A";

        }else if(avgScore[i]>=70 && avgScore[i]<80){
            result[i]="B";

        }else if(avgScore[i]>=60 && avgScore[i]<70){
            result[i]="C";

        }else if(avgScore[i]>=50 && avgScore[i]<60){
            result[i]="D";

        }else if(avgScore[i]<50){
            result[i]="F";
        }


        }




        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\StudyMaterial\\LiveClassCode\\LiveClass_Code\\src\\TestCode.Test\\abc.txt"));

        int students_marksRows = 2;
        int students_marksColumns = 3;


        int[][] students_marks = new int[students_marksRows][students_marksColumns];
        for(int i = 0; i < students_marksRows; i++)
        {
            for(int j = 0; j < students_marksColumns; j++)
            {
                students_marks[i][j] = Integer.parseInt(sc.next().trim());
            }
        }

        String[] result = Result.calculateGrade(students_marks);

        for(int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);
            bufferedWriter.write(result[i]+"\n");
        }
        bufferedWriter.close();
    }
}
