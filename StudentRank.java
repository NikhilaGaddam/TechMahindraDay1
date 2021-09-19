/*statements(else-if)
 WAP to print student rank based on marks
*/
package org.TechMDay1.app;

public class StudentRank 
{
public static void main(String[] args)
  {
	int a=98;
	if((a>=90)&&(a<=100))
	 {
		System.out.println(a + "got 1st rank");
	 }
	else if((a>=70)&&(a<=89))
	 {
		System.out.println(a + "got 2nd rank");
	 }
	else if((a>=35)&&(a<=59))
	 {
		System.out.println(a + "got just pass");
	 }
	else if((a>=0)&&(a<=34))
	 {
		System.out.println(a + "got fail");
	 }
	else
	 {
		System.out.println("Invalid marks");
	 }
   }
}
