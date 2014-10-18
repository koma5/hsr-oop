package u4;

public class BracketCheckerTest {
	public static void main(String[] args) {
		bracketTest("Test1", "(<[()]>){}", true);
		bracketTest("Test2", "()[]{}<>", true);
		bracketTest("Test3", "(((<>)))([<>])", true);
		bracketTest("TestBlank", "", true);
		bracketTest("Test4", "<", false);
		bracketTest("Test5", "[()>", false);
		bracketTest("Test6", "{)(][}", false);
		bracketTest("Test7", "({)}", false);
		bracketTest("Test8", "{hallo}", true);
		bracketTest("Test9", "{ha<lo}", false);
		bracketTest("Test10", "{ha(ll)o}", true);
		bracketTest("Test11", "{hallo}LoL()", true);
	}

	private static void bracketTest(String testName, String input, boolean expected) {
		boolean result = new BracketChecker().validate(input);
		System.out.println(testName + ": " + (expected == result ? "ok" : "failed"));
	}
}
