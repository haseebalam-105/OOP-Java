public class Cylinder
{
	private double height;
	private double radius;
	
	public Cylinder()
	{
		System.out.println("Constructor with non-parameterized ");
		display();
	}
	public Cylinder(double height)
	{
		System.out.println("Constructor with 1-parameterized ");
		setHeight(height);
		this.radius = 1;
		display();
	}
	public Cylinder(double height,double radius)
	{
		System.out.println("Constructor with 2-parameterized ");
		setHeight(height);
		setRadius(radius);
		display();
	}
	
//setter for height
	public void setHeight(double height)
	{
		if(height<0)
		{
			this.height=0;
		}
		else
		{
				this.height=height;
		}
	}
//setter for radius
	public void setRadius(double radius)
	{
		if(radius<0)
		{
			this.radius=0;
		}
		else
		{
				this.radius=radius;
		}
	}

//getter for height
	public double getHeight()
	{
		return height;
	}
//getter for radius
	public double getRadius()
	{
		return radius;
	}
	
//Method to calculate the Area
	public double calculateArea()
	{
		return 2*Math.PI*radius*height;
	}
	
//Method to calculate the volume
	public double calculateVolume()
	{
		return Math.PI*radius*radius*height;
	}
	
	//Method to display the informations
	
	public void display()
	{
		System.out.printf("Height: %.2f %n",getHeight());
		System.out.printf("Radius: %.2f %n",getRadius());
		System.out.printf("Area: %.2f %n",calculateArea());
		System.out.printf("Volume: %.2f %n",calculateVolume());
	}
}