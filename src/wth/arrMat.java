package wth;

public class arrMat {

    public static void main(String[] args) {

        int[][] a = {{1,2,0},{8,3,8},{5,9,4}};
        int[][] b = {{1,-2,0},{-8,3,3},{5,5,5}};

        int[][] c = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[j][i];
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
