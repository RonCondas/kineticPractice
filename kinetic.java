package kineticEnergy;

import java.util.Scanner;

public class kinetic {

	public static void main(String[] args) {
		
		//variables
		double m = 0.0;
		
		double vel =0.0;
		
		double keneticEnergy = 0.0;
		
		Scanner kb = new Scanner (System.in);
		
		
		
		
		System.out.println("Please enter the mass");
		m= kb.nextDouble();
		
		System.out.println("Please enter the velocity");
		vel= kb.nextDouble();
		
		keneticEnergy = kE(m, vel);
		
		System.out.println("Kinetic Energy:" + keneticEnergy);
		
	
	} public static double kE(double m, double vel) {
	
			return (0.5)*m*vel*vel;
}
}
