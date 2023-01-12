package question4;

public class Rectangle {
	int lenght,breadth;
	public Rectangle(int l,int b) {
		lenght=l;
		breadth=b;
	}
 void area() {
	System.out.println(lenght*breadth); 
 }
 void perimeter() {
	 System.out.println(2*(lenght+breadth));
 }
}
