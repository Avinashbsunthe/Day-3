package com.assignment.shape;

public class ShapeMain
{
	public static void main(String[] args) {
		Shape s = new Shape();
		s.perimeter(20, 30);
		s.area(20,30);
		System.out.println();
		
		s.perimeter(25);
		s.area(25);
	}
}
