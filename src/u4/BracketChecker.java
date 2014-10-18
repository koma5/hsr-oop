package u4;

public class BracketChecker {
	
	private String inputString;
	private Stack openedBrackets = new Stack(100);
	private final String[] brackets = {
			"{[(<",
			"}])>"
	};
	private int position;
	
	public boolean validate() {

		if (position < inputString.length()) {
			//System.out.println(string.charAt(pos));
			if (isOpeningBracket(inputString.charAt(position))) {
				openedBrackets.push(inputString.charAt(position));
				position++;
				return validate();
			}
			else if (isClosingBracket(inputString.charAt(position))){
				int closingBracketType = brackets[1].indexOf(inputString.charAt(position));
				int openingBracketType = brackets[0].indexOf((char)openedBrackets.pop());
				
				if (closingBracketType == openingBracketType) {
					position++;
					return true && validate();
				}
				else {
					return false;
				}
			}
			else {
				position++;
				return validate();
			}
		}
		else if (openedBrackets.peek() == null) {
				return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validate(String input) {
		this.inputString = input;
		position = 0;
		return validate();
	}
	
	private boolean isOpeningBracket(char c) {
		if (brackets[0].indexOf(c) > -1 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean isClosingBracket(char c) {
		if (brackets[1].indexOf(c) > -1 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
