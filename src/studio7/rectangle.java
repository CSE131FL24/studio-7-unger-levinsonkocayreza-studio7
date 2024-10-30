package studio7;

import java.util.Scanner;

public class rectangle {

	private double width, length;
		
	public rectangle(double width, double length) {
		this.length = length;
		this.width = width;
	}
		
	public double area() {
		return this.length*this.width;
	}
	public double perimeter() {
		return (2*this.width)+(2*this.length);
	}
	public boolean isSquare() {
		if (this.length==this.width) {
			return true;}
			else {
				return false;
			}
	}
	public boolean isSmaller(rectangle A) {
		if (this.area() < A.area()) {
			return true;
		}
		else {
				return false;
			}
	}

public static void main(String[] args) {
	
}}

