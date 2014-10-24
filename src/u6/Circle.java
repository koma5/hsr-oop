package u6;

public class Circle implements Shape {

	private int x, y, radius, color;

	public Circle(int centerX, int centerY, int radius, int color) {
		x = centerX;
		y = centerY;
		this.radius = radius;
		this.color = color;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	@Override
	public int getAreaColor() {
		return color;
	}

	@Override
	public void draw(Visualization v) {
		v.drawCircle(x, y, radius, color);
	}

}
