/* constructor */
package org.TechMDay1.app;

  public class Rectangle 
  {
	public int l;
	public double w;
 
   public Rectangle(int l,double w)
    {
	this.l=l;
	this.w=w;
    }
   public void findArea()
    {
	double area=this.l*this.w;
	System.out.println("Area of Rectangle:"+ area);
    }

    public static void main(String[] args)
    {
   Rectangle r1=new Rectangle(7,3.1);
    r1.findArea();
    }
  }
