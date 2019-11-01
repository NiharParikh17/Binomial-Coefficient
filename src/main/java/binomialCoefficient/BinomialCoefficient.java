package binomialCoefficient;

public class BinomialCoefficient {
    public static long factorial (int n) {
        if (n==1)
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
}
