package binomialCoefficient;

public class BinomialCoefficient {
    public static long factorial(int n) {
        if (n<0) // Invalid input
            return -1;

        if (n==1 || n==0) // Base Case
            return 1;
        return n*factorial(n-1);
    }

    public static long definitionMethod(int n, int k) {
        if (k>n || k<0) // Invalid input case
            return -1;
        long numerator = factorial(n);
        long denominator = factorial(k)*factorial(n-k);
        return numerator/denominator;
    }

    public static long pascalsMethod(int n, int k) {
        if (k>n || k<0) // Invalid input case
            return -1;

        if (k==n || k==0) // Base Case: k choose k OR n choose 0
            return 1;
        return pascalsMethod(n-1, k-1) + pascalsMethod(n-1, k);
    }

    public static long dynamicMethod(int n, int k) {
        if (k>n || k<0) // Invalid input case
            return -1;

        long[][] table = new long[n+1][k+1]; // n = row & k = columns
        for (int row=0; row<n+1; row++)
            for (int col=0; col<k+1; col++)
                if (col == 0 || col == row || row == 0)
                    table[row][col] = 1;
                else
                    table[row][col] = table[row-1][col-1] + table[row-1][col];
        return table[n][k];
    }
}
