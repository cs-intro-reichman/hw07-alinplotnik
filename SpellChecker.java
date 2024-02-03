
public class SpellChecker {


	public static void main(String[] args) {
		String word = args[0];
		int threshold = Integer.parseInt(args[1]);
		String[] dictionary = readDictionary("dictionary.txt");
		String correction = spellChecker(word, threshold, dictionary);
		System.out.println(correction);
	}

	public static String tail(String str) {
		// Your code goes here
      return null;
	}

	public static int levenshtein(String word1, String word2) {
		word1.toLowerCase();
		word2.toLowerCase();

		if ( word2.isEmpty() )
		{
			return word1.length();
		}
         
		if ( word1.isEmpty() )
		{
			return word2.length();
		}
         
		if ( word1.charAt(0) == word2.charAt(0))
		{
			return levenshtein(word1.substring(1), word2.substring(1));
		}

		return 1 + Math.min(Math.min(levenshtein(word1.substring(1), word2), levenshtein(word1, word2.substring(1))), levenshtein(word1.substring(1), word2.substring(1)));
	}

	public static String[] readDictionary(String fileName) {
		String[] dictionary = new String[3000];

		In in = new In(fileName);

		// Your code here

		return null;
	}

	public static String spellChecker(String word, int threshold, String[] dictionary) {
		// Your code goes here
		return null;
	}

}
