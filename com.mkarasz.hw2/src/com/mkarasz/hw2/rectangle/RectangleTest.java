package com.mkarasz.hw2.rectangle;



public class RectangleTest {

	public static void main(String[] args) throws InterruptedException {
		Rectangle r = new Rectangle();
		
		
		System.out.println("Non-initialized-Rectangle stats:");
		printStats(r);
		System.out.println();
		r.draw();
		
		r = new Rectangle(70,45.2);
		System.out.println("Width and Height-initialized-Rectangle stats:");
		printStats(r);
		System.out.println();
		r.draw();
		
		r = new Rectangle(8.1, 9.2, 2.6, 3.0);
		System.out.println("Everything-initialized-Rectangle stats:");
		printStats(r);
		r.draw();
		
		Thread.sleep(20000);
		
		System.exit(0);
		
	}
	
	public static void printStats(Rectangle r){
		System.out.printf("The upper left corner of the rectangle is at (%f,%f).", r.getRectX(), r.getRectY());
		System.out.println("The rectangle is " + r.getRectWidth() + " by " + r.getRectHeight());
		System.out.println("It has area " + r.area() + " and perimeter " + r.perimeter());
		System.out.println("The rectangles diagonal is of length " + r.diagonalLength());
		System.out.println("The rectangles upper left corner is " + r.distanceFromOrigin() + " from the origin.");
	}

}
