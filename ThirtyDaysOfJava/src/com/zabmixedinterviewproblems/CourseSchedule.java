package com.zabmixedinterviewproblems;

import java.util.*;

public class CourseSchedule {

    public boolean canFinish(int numCourse, int[][] prerequisites) {
        Map<Integer, List<Integer>> mp = new HashMap<>();

        Queue<Integer> qu = new LinkedList<>();
        int[] inDegree = new int[numCourse];

        for (int i = 0; i < numCourse; i++)
            mp.put(i, new ArrayList<>());

        for (int i = 0; i < prerequisites.length; i++) {
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            inDegree[v]++;
            mp.get(u).add(v);
        }

        for (int i = 0; i < numCourse; i++) {
            if (inDegree[i] == 0)
                qu.offer(i);
        }

        int noOfProcessedNodes = 0;

        while (!qu.isEmpty()) {

            int nod = qu.poll();
            noOfProcessedNodes++;

            for (Integer padosi : mp.get(nod)) {
                inDegree[padosi]--;
                if (inDegree[padosi] == 0)
                    qu.offer(padosi);
            }
        }
        if (noOfProcessedNodes == numCourse)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        CourseSchedule cs = new CourseSchedule();
        int[][] prerequisites = {{1, 0}};
        System.out.println(cs.canFinish(2, prerequisites));
    }
}
