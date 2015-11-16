package com.harendra.practice.CheckFlipkartReviewsSimilarity;

public class WordSimilarityGenerator {
	private static WordTrie trie = new WordTrie();

	public static void main(String[] args) {
		String review1 = "This phone. is very good.";
		String review2 = "A very very good cell phone.";

		// Basic approach for tokenization(you can use any of the tokenizer for
		// advance process)
		review1 = review1.replace('.', ' ');
		review2 = review2.replace(',', ' ');
		String[] trieStringArray = null;
		trieStringArray = review1.split("(\\s+)");
		int reviewSimilarityScore = compare(trieStringArray,
				review2.split("(\\s+)"));
		System.out.println("review1 : '" + review1 + "' and \nreview2 : '"
				+ review2 + " \nare " + reviewSimilarityScore + " % similar");
	}

	public static int compare(String[] trieStringArray,
			String[] compareStringArray) {
		for (String trieString : trieStringArray) {
			trie.add(trieString.toCharArray());
		}
		int i = 0;
		for (String compareString : compareStringArray) {
			if (trie.contains(compareString.toCharArray()))
				i++;
		}
		int percentage = (int) (Math.round((double) i
				/ ((double) compareStringArray.length) * 100.0d));
		return percentage;
	}
}
