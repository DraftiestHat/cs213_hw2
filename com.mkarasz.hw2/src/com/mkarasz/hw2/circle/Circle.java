/**
 * MY GOD DOES THIS NEED COMMENTS.
 */
package com.mkarasz.hw2.circle;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Circle extends JComponent{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double x;
	double y;
	double radius;
	
	public Circle(){
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	public Circle(double radius){
		this.x = 0;
		this.y = 0;
		this.radius = radius;
	}
	
	public Circle(double x, double y, double radius){
		this.x = x - radius;
		this.y = y - radius;
		this.radius = radius;
	}
	
	public double getCircleX(){
		return this.x + this.radius;
	}
	
	public double getCircleY(){
		return this.y + this.radius;
	}
	
	public double getCircleRadius(){
		return this.radius;
	}
	
	public void setCircleX(double x){
		this.x = x - this.radius;
	}
	
	public void setCircleY(double y){
		this.y = y - this.radius;
	}
	
	public void setCircleRadius(double radius){
		this.radius = radius;
	}
	
	public double area(){
		return Math.PI * this.radius * this.radius;
	}
	
	public double perimeter(){
		return 2 * Math.PI * this.radius;
	}
	
	public double distanceFromOrigin(){
		return Math.sqrt(Math.pow(this.x + this.radius, 2) + Math.pow(this.y + this.radius, 2));
	}
	
	public void draw(){
		JFrame f = new JFrame();
		f.setBounds(300,300,300,300);
		f.getContentPane().add(this);
		f.setVisible(true);
	}
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(new Ellipse2D.Double(this.x, this.y, this.radius * 2, this.radius * 2));
	}
	
}
