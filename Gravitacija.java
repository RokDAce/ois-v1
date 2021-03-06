import java.util.Scanner;
import java.lang.Math;


public class Gravitacija {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nadVisina = sc.nextDouble();
		double gravPospesek;
		double C = (6.674*(Math.pow(10, -11)));
		double M = (5.972*(Math.pow(10, 24)));
		double r = (6.371*(Math.pow(10, 6)));
		
		gravPospesek = (C*M)/(Math.pow((r+ nadVisina), 2));
        System.out.println(gravPospesek);
		System.out.println(nadVisina);
    }
	
}