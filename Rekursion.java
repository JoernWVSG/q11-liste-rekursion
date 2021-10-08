public class Rekursion
{
    public static int ggt(int a, int b) {
        if ( a > b ) {
            return ggt(a-b, b);
        } else if ( b > a ) {
            return ggt(a, b-a);
        } else {
            return a;
        }
    }
    
    public static int potenz(int a, int n) {
        if ( n > 0 ) {
            return a*potenz(a, n-1);
        } else {
            return 1;
        }
    }
    
    public static String umdrehen(String s) {
        if (s.length()==0||s.length()==1) {
            return s;
        } else {
            return umdrehen(s.substring(1,s.length()))+s.charAt(0);
        }
    }
    
    public static boolean pruefe(String s) {
        return s.equals(umdrehen(s));
    }
    
    public static String toBinaer(int zahl) {
        if (zahl<=1) {
            return String.valueOf(zahl);
        } else {
            return toBinaer(zahl/2)+String.valueOf(zahl%2);
        }
    }
    
    public static int toInt(String zahl) {
        if (zahl.equals("0")) {
            return 0;
        } else if (zahl.equals("1")) {
            return 1;
        } else {
            return toInt(zahl.substring(0,zahl.length()-1))*2 + (int) zahl.charAt(zahl.length()-1);
        }
    }
}
