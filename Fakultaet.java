public class Fakultaet {

    // Attribute werden nicht benoetigt
    
    public int f(int n) {
        if ( n == 1 ) {
            return 1;
        } else {
            return n * f(n-1);
        }
    }
    
}
