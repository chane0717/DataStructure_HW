
public class TestLocatedRect{
    public static void main(String args[]){
        LocatedRect r1 = new LocatedRect(1.0,3.0,1.0,2.0);
        LocatedRect r2 = new LocatedRect(1.0,3.0,1.0,2.0);
        r1.DestRotate();
        r2.DestRotate();
        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
