package ch14.localdateime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class LocalDateTimeEx2 {
    public static void main(String args[]){
        LocalDate today = LocalDate.now();
        System.out.println("올해는 " + today.getYear() + "년입니다.");
        System.out.println("이번달은 " + today.getMonthValue() + "월입니다.");
        System.out.println("오늘은 " + today.getDayOfWeek() + "입니다.");
        System.out.println("오늘은 1년 중 " + today.get(ChronoField.DAY_OF_YEAR) + "일째 날입니다.");
        DayOfWeek dayOfWeek = today.getDayOfWeek();

        // 텍스트 요일 구하기 (영문)
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US)); // Sunday
        System.out.println(dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.US)); // S
        System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US)); // Sun
        System.out.println("-----");

        // 텍스트 요일 구하기 (한글)
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN)); // 일요일
        System.out.println(dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.KOREAN)); // 일
        System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN)); // 일
        System.out.println("-----");

        // 텍스트 요일 구하기 (default)
        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault())); // 일
    }
}