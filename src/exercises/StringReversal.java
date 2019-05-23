package exercises;

import junit.framework.TestCase;

public class StringReversal extends TestCase {

	private String reverseMe(String word) {

		String reverseWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {

			reverseWord = reverseWord + word.charAt(i);

		}

		return reverseWord.toString();
	}

	public void test() {
		assertEquals("cellardoor", reverseMe("roodrallec"));
	}

	public static void main(String[] args) {

		StringReversal reverse = new StringReversal();

		System.out.println(reverse.reverseMe("QcXgW9w4wQd=v?hctaw/moc.ebutuoy"));

	}

}
