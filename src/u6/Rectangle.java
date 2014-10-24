package u6;

public class Rectangle implements Shape {

	private int x, y, width, height, color;

	public Rectangle(int left, int top, int width, int height, int color) {
		x = left;
		y = top;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	void resize(int width, int height) {
		this.width = width;
		this.height = height;
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

}
