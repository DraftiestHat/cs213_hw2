package com.mkarasz.hw2.rectangle;

import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;



public class Rectangle extends JComponent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double width;
	double height;
	double x;
	double y;
	
	public Rectangle(){
		this.width = 1;
		this.height = 1;
		this.x = 0;
		this.y = 0;
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.x = 0;
		this.y = 0;
	}
	
	public Rectangle(double width, double height, double x, double y){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	public void setRectX(double x){
		this.x = x;
	}
	
	public void setRectY(double y){
		this.y = y;
	}
	
	public void setRectWidth(double width){
		this.width = width;
	}
	
	public void setRectHeight(double height){
		this.height = height;
	}
	
	public double getRectX(){
		return this.x;
	}
	
	public double getRectY(){
		return this.y;
	}
	
	public double getRectWidth(){
		return this.width;
	}
	
	public double getRectHeight(){
		return this.height;
	}
	
	public double area(){
		return width * height;
	}
	
	public double perimeter(){
		return 2 * width + 2 * height;
	}
	
	public double diagonalLength(){
		return Math.sqrt(this.width * this.width + this.height * this.height);
	}
	
	public double distanceFromOrigin(){
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	
	public void draw(){
		JFrame f = new JFrame();
		f.setBounds(300,300,300,300);
		f.getContentPane().add(this); //why the hell this worked still amazes me, even though I understand the theory.
		f.setVisible(true);
	}
	
	public void paint(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(new Rectangle2D.Double(this.x, this.y, this.width, this.height));
	}
	
}
