package com.mkarasz.hw2.circle;


public class CircleTest {

	public static void main(String[] args) throws InterruptedException {
		Circle c = new Circle();
		
		System.out.println("Non-initialized-circle stats:");
		printStats(c);
		System.out.println();
		
		c.draw();
		
		c = new Circle(20.5);
		
		System.out.println("Only-radius-initialized-circle stats:");
		printStats(c);
		System.out.println();
		c.draw();
		
		c = new Circle(84.3, 79.1, 60);
		System.out.println("Everything-initialized-circle stats:");
		printStats(c);
		c.draw();
		
		Thread.sleep(20000);
		c = null;
		System.exit(0);

	}
	
	public static void printStats(Circle r) {
		System.out.printf("The circle is at (%f,%f) with a radius of %f.\n", r.getCircleX(), r.getCircleY(), r.getCircleRadius());
		System.out.println("The perimeter is " + r.perimeter());
		System.out.println("The area is " + r.area());
		System.out.println("The distance the circle is from the origin is " + r.distanceFromOrigin());
	}

}
