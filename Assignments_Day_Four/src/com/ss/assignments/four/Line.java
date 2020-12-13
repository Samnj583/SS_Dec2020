/**
 * 
 */
package com.ss.assignments.four;

/**
 * 
 *
 */
public class Line {
	//construct a line object
	public Line(double x0, double y0, double x1, double y1) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
	}
	
	//calculate the slope of a line
	public double getSlope() {
		//avoid dividing by zero
		if(x1 == x0) {
			throw new ArithmeticException();
		}
		
		return (y1-y0)/(x1-x0);
	}
	
	//calculate the distance of the line
	public double getDistance() {
		return Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0));
	}
	
	//return whether a line is parallel to another
	public boolean parallelTo(Line I) {
		if(Math.abs(getSlope()-I.getSlope())<.0001) {
			return true;
		}else {
			return false;
		}
	}
	
	//private member data
	private double x0, y0, x1, y1;
}
