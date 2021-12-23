package com.assignment.calculator;

public class CalculatorMain
{
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(5, 10);
		cal.add(5.0,10.0);
		cal.add(5, 10.0);
		cal.add(5.0, 10);
		System.out.println();
		
		cal.diff(5, 10);
		cal.diff(5.0,10.0);
		cal.diff(5, 10.0);
		cal.diff(5.0, 10);
		System.out.println();
		
		cal.mul(5, 10);
		cal.mul(5.0,10.0);
		cal.mul(5, 10.0);
		cal.mul(5.0, 10);
		System.out.println();
		
		cal.div(5, 10);
		cal.div(5.0,10.0);
		cal.div(5, 10.0);
		cal.div(5.0, 10);
		System.out.println();
	}



}
