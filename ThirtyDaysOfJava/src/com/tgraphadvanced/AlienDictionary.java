package com.tgraphadvanced;

import java.util.ArrayList;
import java.util.Collections;

public class AlienDictionary {

    static boolean dfs(int u, int[][] graph, int[] vis, int[] rec,
                       ArrayList<Character> ans) {
        vis[u] = rec[u] = 1;

        for (int v = 0; v < 26; v++) {
            if (graph[u][v] == 1) {
                if (vis[v] == 0) {

                    if (!dfs(v, graph, vis, rec, ans))
                        return false;
                } else if (rec[v] == 1) {
                    return false;
                }
            }
        }

        ans.add((char) ('a' + u));

        rec[u] = 0;
        return true;
    }

    static ArrayList<Character> findOrder(String[] words) {

        int[][] graph = new int[26][26];
        int[] exist = new int[26];
        int[] vis = new int[26];
        int[] rec = new int[26];
        ArrayList<Character> ans = new ArrayList<>();

        for (String word : words ){
            for (char ch : word.toCharArray()) {
                exist[ch - 'a'] = 1;
            }
        }

        for (int i = 0; i + 1 < words.length; i++) {
            String a = words[i], b = words[i + 1];
            int n = a.length(), m = b.length(), ind = 0;

            while (ind < n && ind < m && a.charAt(ind) == b.charAt(ind))
                ind++;

            if (ind != n && ind == m)
                return new ArrayList<>();

            if (ind < n && ind < m)
                graph[a.charAt(ind) - 'a'] [b.charAt(ind) - 'a'] = 1;
        }

        for (int i = 0; i < 26; i++) {
            if (exist[i] == 1 && vis[i] == 0) {
                boolean x = dfs(i, graph, vis, rec, ans);

                if (!x)
                    return new ArrayList<>();
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        String[] wrods = {"baa", "abcd", "abca", "cab", "cad"};

        ArrayList<Character> order = findOrder(wrods);

        for (char c : order)
            System.out.println(c);
    }
}
