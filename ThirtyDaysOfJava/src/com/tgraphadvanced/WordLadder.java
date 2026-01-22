package com.tgraphadvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordLadder {
    public static int minWordTransForm(String start, String target,
                                      Map<String, Integer> mp) {
        if (start.equals(target))
            return 1;

        int mini = Integer.MAX_VALUE;

        mp.put(start, 1);

        for (int i = 0; i < start.length(); i++) {
            char[] chars = start.toCharArray();
            char origiinalChar = chars[i];

            for (char ch = 'a'; ch <= 'z'; ch++) {
                chars[i] = ch;
                String transformed = new String(chars);

                if (mp.containsKey(transformed) &&
                mp.get(transformed) == 0) {
                    mini = Math.min(mini, 1 + minWordTransForm(transformed, target, mp));
                }
            }
            chars[i] = origiinalChar;
        }

        mp.put(start, 0);

        return mini;

    }

    public static int wordLadder(String start, String target,
                                 ArrayList<String> arr) {

        Map<String, Integer> mp = new HashMap<>();

        for (String word : arr) {
            mp.put(word, 0);
        }

        int result = minWordTransForm(start, target, mp);

        if (result == Integer.MAX_VALUE)
            result = 0;

        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(
                "poon", "plee", "same", "poie", "plie", "poin", "plea"
        ));

        String start = "toon";
        String target = "plea";

        System.out.println(wordLadder(start, target, arr));

    }
}
