package com.jhashMapHashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    static final int MAX_CHAR = 26;

    static String hetHash(String s) {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[MAX_CHAR];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < MAX_CHAR; i++) {
            sb.append(freq[i]);
            sb.append("$");
        }
        return sb.toString();
    }

    static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String key = hetHash(arr[i]);

            if (!mp.containsKey(key)) {
                mp.put(key, res.size());
                res.add(new ArrayList<>());
            }
            res.get(mp.get(key)).add(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        String[] arr = {"abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

        ArrayList<ArrayList<String>> res = anagrams(arr);

        for (List<String> group : res) {
            for (String word : group) {
                System.out.println(word+ " ");
            }
            System.out.println();
        }
    }
}
