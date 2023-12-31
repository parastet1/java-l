package e33;

public class Point {
	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distance() {
		return Math.sqrt(x * x + y * y);
	}

	public double distance(Point otherPoint) {
		int x = this.x - otherPoint.x;
		int y = this.y - otherPoint.y;
		return Math.sqrt(x * x + y * y);
	}

	public double distance(int x, int y) {
		return distance(new Point(x, y));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
