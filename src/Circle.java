
public class Circle {

	private double radius; // instance variable field 
		
	public Circle() {
		setRadius(1.0);// you can use any of these. below 
		//this.radius = 1.0;
		//radius = 1.0;
		
	}//End of an empty argument constructor
	
	public Circle (double r) {
		
		setRadius(r);
		
	}//end of preferred constructor
	
	public double calcualteArea() {
		
		double area = Math.PI * Math.pow(radius, 2.0);
		return area;
		//or below
		//return Math.PI * Math.pow(radius, 2.0);
	}
	public double getRadius() {
		return radius;
		
	}// end of getRadius

	public void setRadius(double radius) {
		
		if(radius<1.0)
			this.radius = 1.0;
		else
			this.radius = radius;
		
	}//end of setRadius

	@Override
	public String toString() {
		
		return "Circle [radius=" + radius + "]";
		
	}// end of toString
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// end of the class
