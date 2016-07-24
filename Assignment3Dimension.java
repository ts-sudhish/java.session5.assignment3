/**
 * 
 */
package sdh.java.session5;

/**
 * @author Sudhish
 *
 */
public class Assignment3Dimension {
	int length;
	int breadth;
	double area;
	Assignment3Dimension() {}
	Assignment3Dimension(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
		this.area = this.length * this.breadth;
	}
	Assignment3Dimension(int side)
	{
		this.length = side;
		this.breadth = side;
		this.area = side * side;
	}
}
