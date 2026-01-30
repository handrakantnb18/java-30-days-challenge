package com.zabmixedinterviewproblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Meeting {
    int startTime, endTime, pos;

    Meeting(int startTime, int endTime, int pos) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.pos = pos;
    }
}

class MeetingComparator implements Comparator<Meeting> {
    @Override
    public int compare(Meeting m1, Meeting m2) {
        return Integer.compare(m1.endTime, m2.endTime);
    }
}

public class NMeetingsInOneRoom {
    static List<Integer> maxMeeting(int[] start, int[] end) {
        List<Integer> res = new ArrayList<>();
        int n = start.length;

        List<Meeting> meets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            meets.add(new Meeting(start[i], end[i], i + 1));
        }

        meets.sort(new MeetingComparator());

        int currTime = -1;
        for (Meeting meeting : meets) {

            if (meeting.startTime > currTime) {
                currTime = meeting.endTime;
                res.add(meeting.pos);
            }
        }

        res.sort(Integer::compareTo);
        return res;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5};
        int[] end = { 2, 4, 6, 7, 9, 9};

        List<Integer> res = maxMeeting(start, end);

        for (int meeting : res) {
            System.out.println(meeting+ " ");
        }
    }
}
