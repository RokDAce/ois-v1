import.java.util.*
import.java.lang.math
public class Gravitacija {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double v = sc.nextDouble;
		double gravPospesek = 0,0;
		double C = (6,674*(Math.pow(10, -11)));
		double M = (5,972*(Math.pow(10, 24)));
		double r = (6,371*(Math.pow(10, 6)));
		
		gravPospesek = (C*M)/(Math.pow((r+v), 2));
		
    }
}