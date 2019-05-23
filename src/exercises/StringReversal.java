package exercises;

import junit.framework.TestCase;

public class StringReversal extends TestCase {
	/*
	 * Without using the reverse() method in StringBuffer or StringBuilder, write a
	 * string reverser that will make this unit test pass.
	 * 
	 * Then use it to decode this message: QcXgW9w4wQd=v?hctaw/moc.ebutuoy
	 */

	private String reverseMe(String word) {

		System.out.println(word);
		String reverseWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {

			reverseWord = reverseWord + word.charAt(i);

		}

		return reverseWord.toString();
	}

	public void test() {
		assertEquals("cellardoor", reverseMe("roodrallec"));
	}

}
