package com.main;

import java.util.Scanner;

public class Converter {
	static Scanner  myScanner = new Scanner(System.in);
	public static void main(String[] args) {
		Converter converter = new Converter();
		for(int x=0;x<1;) {
			
		System.out.println("Please select an option (1-4):"
				+ "\n1. Volume Conversion"
				+ "\n2. Distance Conversion"
				+ "\n3. Temperature Conversions"
				+ "\n4. Quit");
		int menuSelection = myScanner.nextInt();
		switch(menuSelection) {
		case 1:
			System.out.println("Please select an option (1-2):"
					+ "\n1. Teaspoons to Tablespoons"
					+ "\n2. Teaspoons to Cups");
			double vol = myScanner.nextDouble();
			if(vol == 1) {
				System.out.println("Please input an integer: ");
				double tea = myScanner.nextDouble();
				double table = converter.teaToTable(tea);
				System.out.println(tea + " teaspoons is " + table + " tablespoons.\n");
				}else if(vol == 2) {
					System.out.println("Please input an integer: ");
					double tea = myScanner.nextDouble();
					double cup = converter.teaToCup(tea);
					System.out.println(tea + " teaspoons is " + cup +" cups.\n");
					}
					else
						System.out.println("Invalid input. Try again.\n");
			break;
		case 2:
			System.out.println("Please select an option (1-2):"
					+ "\n1. Miles to Kilometers"
					+ "\n2. Inches to Meters");
			double dist = myScanner.nextDouble();
			if(dist == 1) {
				System.out.println("Please input an integer: ");
				double miles = myScanner.nextDouble();
				double kilo = converter.mileToKilo(miles);
				System.out.println(miles + " miles is " + kilo + " kilometers.\n");
				}else if(dist == 2) {
					System.out.println("Please input an integer: ");
					double inch = myScanner.nextDouble();
					double meter = converter.inchToMeter(inch);
					System.out.println(inch + " inches is " + meter +" meters.\n");
					} 
				    else
						System.out.println("Invalid input. Try again.\n");
			break;
		case 3:
			System.out.println("Please select an option (1-2):"
					+ "\n1. Fahrenheit to Celsius"
					+ "\n2. Celsius to Fahrenheit");
			double temp = myScanner.nextDouble();
			if(temp == 1) {
				System.out.println("Please input an integer: ");
				double fahr = myScanner.nextDouble();
				double cels = converter.fahrToCels(fahr);
				System.out.println(fahr + " degrees fahrenheit is " + cels + " degrees celsius.\n");
				}else if(temp == 2) {
					System.out.println("Please input an integer: ");
					double cels = myScanner.nextDouble();
					double fahr = converter.celsToFahr(cels);
					System.out.println(cels + " degrees celsius is " + fahr +" degrees fahrenheit.\n");
					}
				else 
					System.out.println("Invalid input. Try again.\n");
			break;
			
		case 4:
			x++;
			break;
			
		default:
			System.out.println("Invalid input. Try again.\n");
		}
	   }
	  }
	 public double teaToTable(double tea) {
	 	double table = tea * 0.333;
	  	return table;
	  }
	 public double teaToCup(double tea) {
	    double cup = tea * 0.020833;
    	return cup;
	 }
	 public double mileToKilo(double miles) {
		 double kilo = miles / 0.62137;
		 return kilo;
	 }
	 public double inchToMeter(double inch) {
		 double meter = inch/39.370;
		 return meter;
	 }
	 public double fahrToCels(double fahr) {
		double cels = (fahr - 32)/1.8;
		return cels;
	 }
	 public double celsToFahr(double cels) {
		 double fahr = cels * 1.8;
		 return fahr;
	 }
}