package binomialCoefficient;

public class BinomialCoefficient {
    public static long factorial (int n) {
        if (n==1)
            return 1;
        return n*factorial(n-1);
    }
}
