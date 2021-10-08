public class Fibonacci {
    public int fib(int n) {
        if ( n <= 2 ) {
            return 1;
        } else {
            return fib(n-2) + fib(n-1);
        }
    }

    public int fib2(int n) {
        if ( n<= 2) {
            return 1;
        } else {
            int f1 = 1;
            int f2 = 1;
            int erg = 0;
            for(int i=3; i<=n; i++) {
                erg = f1 + f2;
                f1 = f2;
                f2 = erg;
            }
            return erg;
        }
    }
}