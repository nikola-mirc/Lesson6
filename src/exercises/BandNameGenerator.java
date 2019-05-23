package exercises;

import java.util.ArrayList;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {

	public static void main(String[] args) {

		ArrayList<String> adjectives = new ArrayList<String>();
		ArrayList<String> nouns = new ArrayList<String>();

		adjectives.add("slimy");
		adjectives.add("blind");
		adjectives.add("frozen");
		adjectives.add("random");
		adjectives.add("bloody");
		adjectives.add("homicidal");

		nouns.add("pants");
		nouns.add("bones");
		nouns.add("bikers");
		nouns.add("refrigerator");
		nouns.add("planet");
		nouns.add("berserkers");

		int size1 = 0;
		int size2 = 0;

		for (int i = 0; i < adjectives.size(); i++) {
			adjectives.get(i);
			size1++;
		}

		for (int i = 0; i < nouns.size(); i++) {
			adjectives.get(i);
			size2++;
		}

		Random r = new Random();
		

		for (int i = 0; i < 66; i++) {

			System.out.println(adjectives.get(r.nextInt(size1)) + " " + nouns.get(r.nextInt(size2)));

		}
	}
}
