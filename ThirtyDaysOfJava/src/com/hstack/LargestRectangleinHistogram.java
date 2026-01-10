package com.hstack;

import java.util.Stack;

public class LargestRectangleinHistogram {

    public int largestRectHist(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currentHight = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && currentHight < heights[st.peek()]) {
                int height = heights[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            st.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        LargestRectangleinHistogram lrh = new LargestRectangleinHistogram();
        int[] heights1 = {2, 5,1, 8, 6, 9};
        System.out.println("Largest Rectangle Area : " +lrh.largestRectHist(heights1));

        int[] heights2 = {5, 9, 6};
        System.out.println("Largest Rectangle Area : " + lrh.largestRectHist(heights2));
    }
}
