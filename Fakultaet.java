public class Fakultaet {

    // Attribute werden nicht benoetigt
    
     public int f(int n) {
        if ( n <= 1 ) {
            return 1;
        } else {
            return n * f(n-1);
        }
    }

    public int f2(int n) {
        int f = 1;

        for (int k = 1; k <= n ; k++)
        {
            f = f * k ; 
        }
        return f;
    }
    
}
