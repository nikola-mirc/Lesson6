package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(i);
			if (egg.contains("crack")) {
				return i;
			}
		}
		return -1;
	}

	static int countPearls(List<Boolean> oysters) {

		int totalPearls = 0;
		for (int i = 0; i < oysters.size(); i++) {

			Boolean pearl = oysters.get(i);
			if (pearl == true) {
				totalPearls++;
			}
		}
		return totalPearls;
	}

	static double findTallest(List<Double> peeps) {

		double tallestPeep = 0;
		for (int i = 0; i < peeps.size(); i++) {

			double singlePeepHeight = peeps.get(i);

			if (singlePeepHeight > tallestPeep) {

				tallestPeep = singlePeepHeight;
			}

		}
		return tallestPeep;

	}

	static String findLongestWord(List<String> words) {

		ArrayList<String> newList = new ArrayList<String>();
		int currentWordLength = 0;
		String longestWord = null;

		for (int i = 0; i < words.size(); i++) {

			while (words.get(i).length() > currentWordLength)

				currentWordLength = words.get(i).length();

		}

		for (int i = 0; i < words.size(); i++) {

			if (words.get(i).length() == currentWordLength) {

				String bb = words.get(i);
				newList.add(bb);

			}

		}

		longestWord = newList.get(0);
		return longestWord;

	}

//	static boolean containsSOS(List<String> message1) {
//
//		return true;
//
//	}
//
//	static boolean containsSOS(List<String> message2, List<String> message1) {
//
//		return true;
//	}
//
//	static double sortScores(List<Double> results) {
//
//		
//		
//	}
//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}