package wth;

public class liss {

    public static void main(String[] args) {
        int arr[] = {10, -2, -9, 0, 13, -50, 81, 90};
        int seq = 1;

        seq = tryIt(arr, seq);

        System.out.println();
        System.out.println("LIS: " + seq);


    }

    private static int tryIt(int[] arr, int seq) {

        int[] temp = new int[arr.length];
        int l = arr.length;
        int biggerSeq = 0;
        int n = 0;


        for (int k = 0; k < l; k++) {
            int[] ar = new int[arr.length];
            ar[n] = arr[k];
            for (int i = k; i < l; i++) {
                if (ar[n] < arr[i]) {
                    ar[n + 1] = arr[i];
                    seq++;
                    n++;
                }
            }
            n = 0;

            //display each iteration
            for(int x : ar){
            System.out.print("\t"+x);
            }
            //current seq - iteration
            System.out.println("====> " + seq);
            //solution
            if (biggerSeq < seq) {
                biggerSeq = seq;
                temp = ar;
            }
            seq = 1;
        }

        //display LIS
//        for (int x : temp) {
//            System.out.print("\t" + x);
//        }
//
        for(int o=0;o<biggerSeq;o++){
            System.out.print("\t" + temp[o]);
        }
        return biggerSeq;
    }
}
