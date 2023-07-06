package binomial;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Combinationcalculator {
public static void main(String[] args) {
	for(int i=1;i<=20;i++) {
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.print("n = "+ i+"\t\t");
		for (double p=0.01;p<=1;) {
			DecimalFormat df = new DecimalFormat("###.####");
			System.out.print("\t"+df.format(p));
			if(p<0.05) {p+=0.04;}else {p+=0.05;}
		}
		System.out.println("\n");
		System.out.println("                      ________________________________________________________________________________________________________________________________________________________________________");
		System.out.println("\n");
		display(i);
	}

System.out.println(binomialcalculator(50,1,0.2));

}
public static void display(int n) {
	for(int r=0;r<=n;r++) {
		System.out.print("              r= "+r+" ");
		double p=0.01;
		for(int k=0;p<=1;k++) {
		
		double d=binomialcalculator(n,r,p);
		if(p>=0.05) {
		p=p+0.05;}
		if(p<0.05) {p+=0.04;}
		DecimalFormat df = new DecimalFormat("###.###");
		System.out.print("\t"+df.format(d));

		}
	
		System.out.print("\n");
	}
}

public static double binomialcalculator(int n, int r, double p) {

	double probab=combination(n,r)*Math.pow(p, r)*Math.pow((1-p), (n-r));
	return probab;
	
}
public static long combination(int n,int r) {
		long c=fact(n)/(fact(r)*fact(n-r));
		return c;
	}

private static long fact(int i) {
 long prod = 1;
    while(i>0) {
    	prod=prod*i;
    	i--;
    }
    return prod;
}
}
