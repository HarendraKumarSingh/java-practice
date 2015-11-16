package com.harendra.practice.CheckFlipkartReviewsSimilarity;

import java.util.HashMap;
import java.util.Map;

public class WordTrie {
	Map<String, Object> trieMap = new HashMap<String, Object>();

	/**
	 * 
	 * @param string
	 *            Token character array
	 * @return Addition to trie done
	 */
	public boolean add(char[] string) {
		Map<String, Object> startMap = trieMap;
		for (char character : string) {
			if (startMap.containsKey(character)) {
				startMap = (Map<String, Object>) startMap.get(String.valueOf(
						character).toUpperCase());
			} else {
				Map<String, Object> newMap = new HashMap<String, Object>();
				startMap.put(String.valueOf(character).toUpperCase(), newMap);
				startMap = newMap;
			}
		}
		startMap.put("_", null);
		return true;
	}

	/**
	 * 
	 * @param string
	 *            Token character array
	 * @return If the trie containf the given input tokent then it returns True
	 *         else False
	 */
	public boolean contains(char[] string) {
		Map<String, Object> startMap = trieMap;
		for (char character : string) {
			if (startMap.containsKey(String.valueOf(character).toUpperCase())) {
				startMap = (Map<String, Object>) startMap.get(String.valueOf(
						character).toUpperCase());
			} else if (!startMap.containsKey("_")) {
				return false;
			}
		}
		return true;
	}
}
