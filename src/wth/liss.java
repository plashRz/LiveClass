package wth;

public class liss {

    public static void main(String[] args) {
        int arr[] = { 10, -2, -9, 0, 13, -50, 81, 90 };
        int seq=1;
        int len = arr.length;

        seq = tryIt(arr, seq);

        System.out.println();
        System.out.println("LIS: "+seq);


    }

    private static int tryIt(int[] arr, int seq) {

        int l = arr.length;
        int biggerSeq=0;
        int n =0;

        for(int k=0;k<l;k++){
            int[] ar = new int[10];
            ar[n] = arr[k];
            for(int i=k; i<l;i++){
                if(ar[n]<arr[i]){
                    ar[n+1]=arr[i];
                    seq++;
                    n++;
                }
            }
            n=0;

            //display each iteration
            for(int x : ar){
            System.out.print("\t"+x);
            }
            //current seq - iteration
            System.out.println("====> "+seq);
            //solution
            if(biggerSeq<seq){
                biggerSeq=seq;
            }
            seq=1;
        }
        return biggerSeq;
    }
}
