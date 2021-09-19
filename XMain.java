/*polymorphism*/
package org.TechMDay1.app;

  public class XMain 
   {
   public static void main(String[] args)
    {
	X x1=new Y();//upcasting
	x1.walk();
	Y y1=(Y)x1;//downcasting
	y1.run();
   }
}
