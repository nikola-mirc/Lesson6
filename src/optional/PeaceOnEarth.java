package optional;

import java.util.ArrayList;

public class PeaceOnEarth {

	public static void main(String[] args) {
		
		ArrayList<Character> truth = new ArrayList<Character>();
		
		truth.add('#');
		truth.add('g');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('s');
		truth.add('#');
		truth.add('u');
		truth.add('#');
		truth.add('#');
		truth.add('c');
		truth.add('k');

		String message = "";
		for (int i = 0; i < truth.size(); i++) {

			if (!truth.get(i).equals('#')) {

				message = message + truth.get(i);

			}

		}
		System.out.println(message);

	}

}