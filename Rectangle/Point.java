package Rectangle;

public class Point {
	private int x;
	private int y;

	public Point() {}
	
	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int _x) {
		x = _x;
	}
	
	public void setY(int _y) {
		y = _y;
	}
	
	public double distance(Point b) {
		double re;
		re = Math.sqrt(Math.pow(b.x - this.x, 2) + Math.pow(b.y - this.y, 2));
		return re;
	}
	
	public String toString() {
		return String.format("(%s, %s)", x, y);
	}
	
	
}
