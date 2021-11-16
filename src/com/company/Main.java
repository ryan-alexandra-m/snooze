package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(snooze(5, true));
        System.out.println(snooze(6, false));


    }

    public static boolean snooze(int hour, boolean isWeekday){
        return (hour < 7 && isWeekday== true);

    }

}
