package wth;

public class LIS {

        /* lis() returns the length of the longest
           increasing subsequence in arr[] of size n */
        static int lis(int arr[], int n)
        {
            int lis[] = new int[n];
            int i, j, max = 0;

            /* Initialize LIS values for all indexes */
            for (i = 0; i < n; i++)
                lis[i] = 1;

            for(int p : lis){
                System.out.print("\t"+p);
            }
            System.out.println();
// int arr[] = { 10, -2, -9, 0, 13, -50, 81, 90 };

        /* Compute optimized LIS values in
           bottom up manner */
            for (i = 3; i < n; i++) {
                for (j = 1; j < i; j++) {
                    if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                        lis[i] = lis[j] + 1;
                    }

                    for(int z : lis){
                        System.out.print("\t"+z);
                    }
                    System.out.println("     i="+i+" j="+j);

                }

            }

            for(int z : lis){
                System.out.print("\t"+z);
            }
            System.out.println();

            /* Pick maximum of all LIS values */
            for (i = 0; i < n; i++)
                if (max < lis[i])
                    max = lis[i];

            return max;
        }

        public static void main(String args[])
        {
            int arr[] = { 10, -2, -9, 0, 13, -50, 81, 90 };
            int n = arr.length;
            System.out.println("Length of lis is " + lis(arr, n)
                    + "\n");
        }
}

