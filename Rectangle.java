// Rectangle.java
// A ``floating'' rectangle has a width xSpan and a height ySpan
//package locatedrectangle;

public class Rectangle {
    protected double xSpan, ySpan;
    public Rectangle(double x, double y) { // Contructor with two args
        if (x < 0.0) x = 0.0;  // Allow degenerate rectangles
        if (y < 0.0) y = 0.0;  // but not inverted rectangles
        xSpan = x; ySpan = y;
         }
    public Rectangle() {this(1.0,1.0);} // Constructor with no args
    public void setSpans(double x, double y) {   // Setter
        if (x < 0.0) x = 0.0;  // Allow degenerate rectangles
        if (y < 0.0) y = 0.0;  // but not inverted rectangles
        xSpan=x; ySpan=y; }
    public double getXSpan() {return xSpan;}     // Getters
    public double getYSpan() {return ySpan;}
    public String toString() {                   // Printable form
         return "Rect["+ xSpan + ", " + ySpan + "]";
     }
     // DestRotate is a destructive form of rotation
     public Rectangle DestRotate(){
         setSpans(getYSpan(),getXSpan());
         return this;
    }

    // NonDestRotate is a nondestructive form of rotation
    public Rectangle NonDestRotate(){
        return new Rectangle(getYSpan(),getXSpan());
    }


} // end Rectangle
