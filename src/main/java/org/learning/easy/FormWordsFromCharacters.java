package org.learning.easy;

import java.util.HashMap;
import java.util.Map;

public class FormWordsFromCharacters {
    //1160. Find Words That Can Be Formed by Characters

    public int countCharacters(String[] words, String chars) {

        int output = 0;
        //Create a map of occurrences of each character in "chars" and store
        Map<Character, Integer> ch = new HashMap();
        for (char c : chars.toCharArray()) {
            ch.put(c, ch.getOrDefault(c, 0) + 1);
        }

        //Iterate over each word
        for (String word : words) {
            //Create a map of occurrences of each word in words and store
            Map<Character, Integer> w_ch = new HashMap();
            for (char c : word.toCharArray()) {
                w_ch.put(c, w_ch.getOrDefault(c, 0) + 1);
            }

            boolean good = true;
            for (char c : w_ch.keySet()) {
                // if "ch" map does not contain every character
                // of "w_ch" map or the value of
                // the character in "ch" map is less than of "w_ch" map,
                // do not consider the word.
                if (ch.getOrDefault(c, 0) < w_ch.get(c)) {
                    good = false;
                    break;
                }
            }
            //increase the final length
            if (good) output += word.length();
        }
        return output;

    }

    public static void main(String[] args) {

        FormWordsFromCharacters s = new FormWordsFromCharacters();
        System.out.println(s.countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));

    }
}
