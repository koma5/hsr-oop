package u6;

public class TextBox extends Rectangle implements Text{

	private String text;
	private int textColor;

	public TextBox(int left, int top, int width, int height, int areaColor, String text, int textColor) {
		super(left, top, width, height, areaColor);
		this.text = text;
		this.textColor = textColor;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public int getTextColor() {
		return textColor;
	}
	
	

}
