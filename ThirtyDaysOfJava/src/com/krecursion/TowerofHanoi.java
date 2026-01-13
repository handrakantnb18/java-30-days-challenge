package com.krecursion;

public class TowerofHanoi {
    static void towerofHonai(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 0) {
            return;
        }
        towerofHonai(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " + from_rod + " to road " + to_rod);
        towerofHonai(n -1, aux_rod, to_rod, from_rod);
    }
    public static void main(String[] args) {
        int N = 2;

        towerofHonai(N, 'A', 'B', 'C');
    }
}
