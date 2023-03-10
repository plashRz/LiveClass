package wth;

public class LIS {

    /* lis() returns the length of the longest
       increasing subsequence in arr[] of size n */
    static int lis(int arr[], int n) {
        int lis[] = new int[n];

        int i, j, q = 0, max = 0;

        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++)
            lis[i] = 1;

//            for(int p : lis){
//                System.out.print("\t"+p);
//            }
        System.out.println();
// int arr[] = { 10, -2, -9, 0, 13, -50, 81, 90 };

        /* Compute optimized LIS values in
           bottom up manner */
        for (i = 1; i < n; i++) {
            int ar2[] = new int[10];
            ar2[i-1] = arr[q];
            for (j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                    ar2[q + 1] = arr[i];
                    q++;
                }

            }
            q = 0;
//                    for(int z : lis){
//                        System.out.print("\t"+z);
//                    }
            //System.out.println(arr[i]+"     i="+i+" -- "+arr[j]+" j="+j);

            for (int z : ar2) {
                System.out.print("\t" + z);
            }
            System.out.println();

        }



        /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];

        return max;
    }

    public static void main(String args[]) {
        int arr[] = {10, -2, -9, 0, 13, -50, 81, 90};
        int n = arr.length;
        System.out.println("Length of lis is " + lis(arr, n)
                + "\n");
    }
}

