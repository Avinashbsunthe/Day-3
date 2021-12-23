package com.assignment.shape;

public class Shape
{
	public void perimeter(int l, int b)
	{
		int perimeter= (l + b) * 2;
		System.out.println("Perimeter of Rectangle: "+perimeter);
	}
	
	public void perimeter(int side)
	{
		System.out.println("Perimeter of Square: "+(side * 4));
	}
	
	public void area(int l, int b)
	{
		System.out.println("Area of Rectangle: "+(l * b));
	}

	public void area(int side)
	{
		System.out.println("Area of Square: "+(side * side));
	}


}
