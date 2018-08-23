package ooplets;

/**
 * The Main Class. A demonstration of Polymorphism in Object Oriented Programming.
 * 
 * @author marylene
 * @since 2 June 2018
 */
public class Main {
    
       /**
        * The Rectangle Class.
        * 
        * @author marylene
        * @since 2 June 2018
        */
	public static abstract class Rectangle{

		int length;
		int width;
		String name;
                     
               /**
                * The constructor for the Rectangle class.
                */
		public Rectangle() {
			this.length = 0;
			this.width = 0;
			this.name = "Rectangle";
		}
                
               /**
                * This will calculate the area.
                * 
                * @return - the area
                */
		public int getArea() {
			return length * width;

		};
                
               /**
                * This will obtain the name of the geometrical figure.
                * 
                * @return name - the name.
                */
		public String getName() {
			return this.name;

		};
                
               /**
                * This will draw the rectangle.
                */
		public abstract void drawShape();
	}
        
       /**
        * The RectangularShape Class.
        * 
        * @author marylene
        * @since 2 June 2018
        */
	public static class RectangularShape extends Rectangle {

               /**
                * The constructor for the RectangularShape class.
                * 
                * @param length - the length
                * @param width - the width
                */
		public RectangularShape(int length, int width) {
			super();
			this.length = length;
			this.width = width;
		}
                
               /**
                * This will draw the rectangle.
                */
		public void drawShape() {
			// draw rectangle
		};
	}
        
       /**
        * The SquareShape Class.
        * 
        * @author marylene
        * @since 2 June 2018
        */
	public static class SquareShape extends Rectangle {
           
               /**
                * The constructor for the SquareShape class.
                * 
                * @param  length - The length
                */
		public SquareShape(int length) {

			super();
			this.length = this.width = length;
			this.name = "Square";
		}
                
               /**
                * This will draw the square.
                * 
                * @author marylene
                * @since 2 June 2018
                */
		public void drawShape() {
			// draw square
		};
	}
	
        /**
         * The main method.
         * 
         * @param args - The arguments
         */
	public static void main(String args[]) {
		SquareShape sq = new SquareShape(5);

		RectangularShape rect = new RectangularShape(5, 7);
		System.out.println("Area of: " + rect.getName()  + ": " + 				rect.getArea());
		System.out.println("Area of: " + sq.getName()  + ": " + sq.getArea());

	}
}
