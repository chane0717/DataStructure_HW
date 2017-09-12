package locatedrectangle;
public class TestDestRotate{
    public static void main(String args[]){
        LocatedRect r1 = new LocatedRect(1.0,3.0,1.0,2.0);
        LocatedRect r2 = new LocatedRect(1.0,3.0,1.0,2.0);
        r1.DestRotate();
        r2.NonDestRotate();
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
/*    public static void main(String args[]){
        Rectangle r = new Rectangle(4.0,5.0);
        r.DestRotate();
        System.out.println(r.toString());
    }
    */
}
