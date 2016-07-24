/**
 * 
 */
package sdh.java.session5;

/**
 * @author Sudhish
 *
 */
public class Assignment3Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3Dimension rectangle = new Assignment3Dimension(10,5);
		System.out.println("Area of rectangle with length: "+rectangle.length+" breadth: "+rectangle.breadth+" is "+rectangle.area+" sq units");
		Assignment3Dimension square = new Assignment3Dimension(50);
		System.out.println("Area of square with side: "+square.length+" is "+square.area+" sq units");
	}
}
