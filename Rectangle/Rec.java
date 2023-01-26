package Rectangle;

public class Rec {
	private Point A;
	private Point B;
	private Point C;
	
	public Rec(Point _A, Point _B, Point _C) {
		A = _A;
		B = _B;
		C = _C;
	}
	
	public double perimeterRec() {
		double re;
		re = A.distance(B) + A.distance(C) + B.distance(C);
		return re;
	}
	
	public Point centerOfRec() {
		Point c = new Point();
		c.setX((A.getX() + B.getX() + C.getY())/3);
		c.setY((A.getY() + B.getY() + C.getY())/3);
		return c;
	}
	
	public String toString() {
		return String.format("%s - %s - %s", A.toString(), B.toString(), C.toString());
	}

}
