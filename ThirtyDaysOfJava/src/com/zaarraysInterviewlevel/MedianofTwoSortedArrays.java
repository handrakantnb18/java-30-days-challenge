package com.zaarraysInterviewlevel;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

    // Using Sorting - O((n + m) × log (n + m)) Time and O(n + m) Space
    static double medianOf2(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        Arrays.sort(c);

        int len = c.length;

        if (len % 2 == 0)
            return (c[len / 2] + c[len / 2 - 1]) / 2.0;

        else
            return c[len / 2];
    }

    //  Use Merge of Merge Sort - O(m + n) Time and O(1) Space
    static double medianofTwoArray(int[] c, int[] d) {
        int n = c.length, m = d.length;
        int i = 0, j = 0;

        int m1 = -1, m2 = -1;

        for (int count = 0; count <= (m + n)/2; count++) {
            m2 = m1;

            if (i != n && j != m)
                m1 = (c[i] > d[j]) ? d[j++] : c[i++];

            else if (i < n)
                m1 = c[i++];

            else
                m1 = d[j++];
        }

        if ((m + n) % 2 == 1)
            return m1;
        else
            return (m1 + m2) / 2.0;
    }

    // Using Binary Search - O(log min(n, m)) Time and O(1) Space
    static double medianofSort(int[] e, int[] f) {
        int n = e.length, m = f.length;

        if (n > m)
            return medianofSort(f, e);

        int lo = 0, hi = n;
        while (lo <= hi) {
            int mid1 = (lo + hi) / 2;
            int mid2 = (n + m + 1) /2 - mid1;

            int l1 = (mid1 == 0) ?
                    Integer.MIN_VALUE : e[mid1 - 1];
            int r1 = (mid1 == n) ?
                    Integer.MAX_VALUE : e[mid1];

            int l2 = (mid2 == 0) ?
                    Integer.MIN_VALUE : f[mid2 - 1];
            int r2 = (mid2 == m) ?
                    Integer.MAX_VALUE : f[mid2];

            if (l1 <= r2 && l2 <= r1) {
                if ((n + m) % 2 == 0)
                    return (Math.max(11, 12) + Math.min(r1, r2)) / 2.0;

                else
                    return Math.max(11, 12);
            }

            if (l1 > r2)
                hi = mid1 - 1;
            else
                lo = mid1 + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
       // Using Sorting - O((n + m) × log (n + m)) Time and O(n + m) Space
       int[] a = { -5, 3, 6, 12, 15};
       int[] b = {-12, -10, -6, -3, 4, 10};

        System.out.println(medianOf2(a, b));

        // Use Merge of Merge Sort - O(m + n) Time and O(1) Space
        int[] c = {-5, 3, 6, 12, 15};
        int[] d = {-12, -10, -6, -3, 4, 10};

        System.out.println(medianofTwoArray(c, d));

        // Using Binary Search - O(log min(n, m)) Time and O(1) Space
        int[] e = {-5, 3, 6, 12, 15};
        int[] f = {-12, -10, -6, -3, 4, 10};
        System.out.println(medianofSort(e, f));
    }
}
