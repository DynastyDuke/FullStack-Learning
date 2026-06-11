package Java.others;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class NoteDateTime {
    public static void localDate() {

        //取得今日日期
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //取得指定日期(不用補0)
        LocalDate date = LocalDate.of(1989, 6, 4);
        System.out.println(date);

        //字串轉成日期(要補0)
        String date2 = "1989-06-04";
        LocalDate d = LocalDate.parse(date2);
        System.out.println(d);

        //日期轉字串
        LocalDate d1 = LocalDate.now();
        String str = d1.toString();
        System.out.println(str);

        //日期增減
        LocalDate today2 = LocalDate.now();
        LocalDate lastYear = today2.minusYears(1);
        LocalDate yesterday = today2.minusDays(1);
        LocalDate tomorrow = today2.plusDays(1);
        LocalDate nextWeek = today2.plusWeeks(1);
        LocalDate nextMonth = today2.plusMonths(1);
        LocalDate nextYear = today2.plusYears(1);
        System.out.println("Last year:" + lastYear + "\nYesterday:" + yesterday + "\nTomorrow:" + tomorrow + "\nNext week:" + nextWeek + "\nNext month:" + nextMonth + "\nNext year:" + nextYear);

        //只取年、月、日
        LocalDate d2 = LocalDate.now();
        int year = d2.getYear();
        int month = d2.getMonthValue();
        int day = d2.getDayOfMonth();
        System.out.println("year:" + year + "\nmonth:" + month + "\nday:" + day);

        //日期比較
        LocalDate d3 = LocalDate.now();
        LocalDate d4 = LocalDate.of(1989, 6, 4);
        System.out.println(d3.isBefore(d4));
        System.out.println(d3.isAfter(d4));
        System.out.println(d3.isEqual(d4));

        //閏年、轉字串
        LocalDate d5 = LocalDate.now();
        System.out.println(d5.isLeapYear());
        LocalDate d6 = LocalDate.of(1989, 6, 4);
        System.out.println(d6.isLeapYear());
        LocalDate d7 = LocalDate.of(1996, 6, 25);
        System.out.println(d7.isLeapYear());
    }

    public static void localTime() {

        //格式：h/m/s 24時制
        //取現在時間
        LocalTime thisTime = LocalTime.now();
        System.out.println(thisTime);

        //指定時間表達
        LocalTime time1 = LocalTime.of(9, 30);
        LocalTime time2 = LocalTime.of(0, 1, 7);
        System.out.println(time1);
        System.out.println(time2);


        //字串轉換時間
        LocalTime time3 = LocalTime.parse("09:30");//要補0不然會報錯
        LocalTime time4 = LocalTime.parse("17:30:45");
        System.out.println(time3);
        System.out.println(time4);

        //時間轉換字串
        LocalDateTime dt = LocalDateTime.now();
        String str = dt.toString();
        System.out.println(str);

        //時間增減
        LocalTime now = LocalTime.now();
        LocalTime sixHourAfter = now.plusHours(6);
        LocalTime fiveMinAfter = now.plusMinutes(5);
        LocalTime fortySecAfter = now.plusSeconds(40);
        LocalTime oneHourBefore = now.minusHours(1);
        System.out.println("sixHourAfter: " + sixHourAfter +
                "\nfiveMinAfter: " + fiveMinAfter +
                "\nfortySecAfter: " + fortySecAfter +
                "\noneHourBefore: " + oneHourBefore);

        //只取時、分、秒

        int hour = now.getHour();
        int min = now.getMinute();
        int sec = now.getSecond();

        System.out.println("H: " + hour + "\nM: " + min + "\nS: " + sec);

        LocalTime time5 = LocalTime.of(12, 34, 56);
        LocalTime time6 = LocalTime.of(23, 22, 21);

        System.out.println(time5.isAfter(time6));
        System.out.println(time5.isBefore(time6));
        System.out.println(time5.equals(time6));
    }

    public static void localDateTime() {

        // 取現在日期+時間
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        // 輸出範例：2026-06-11T15:30:45.123

        // 指定日期+時間（年月日時分，秒可省略）
        LocalDateTime dt1 = LocalDateTime.of(2026, 6, 11, 15, 30);
        LocalDateTime dt2 = LocalDateTime.of(2026, 6, 11, 15, 30, 45);
        System.out.println(dt1);
        System.out.println(dt2);

        // 從LocalDate + LocalTime組合
        LocalDate date = LocalDate.of(2026, 6, 11);
        LocalTime time = LocalTime.of(15, 30);
        LocalDateTime dt3 = LocalDateTime.of(date, time);
        System.out.println(dt3);

        // 字串轉LocalDateTime（格式固定：yyyy-MM-ddTHH:mm:ss）
        LocalDateTime dt4 = LocalDateTime.parse("2026-06-11T15:30:45");
        System.out.println(dt4);
        // ⚠️ 中間一定要有 T，否則報錯

        // LocalDateTime 轉字串
        LocalDateTime dt8 = LocalDateTime.now();
        String str = dt8.toString();
        System.out.println(str);

        // 日期+時間增減（會自動跨日）
        LocalDateTime now2 = LocalDateTime.now();
        LocalDateTime nextYear = now2.plusYears(1);
        LocalDateTime nextMonth = now2.plusMonths(1);
        LocalDateTime nextWeek = now2.plusWeeks(1);
        LocalDateTime tomorrow = now2.plusDays(1);
        LocalDateTime nextHour = now2.plusHours(1);
        LocalDateTime nextMinute = now2.plusMinutes(1);
        LocalDateTime nextSecond = now2.plusSeconds(1);
        LocalDateTime lastYear = now2.minusYears(1);

        System.out.println("原始時間: " + now2);
        System.out.println("加1年後: " + nextYear);
        System.out.println("加1月後: " + nextMonth);
        System.out.println("加1週後: " + nextWeek);
        System.out.println("加1天後: " + tomorrow);
        System.out.println("加1小時後: " + nextHour);
        System.out.println("加1分鐘後: " + nextMinute);
        System.out.println("加1秒後: " + nextSecond);
        System.out.println("減1年前: " + lastYear);

        // 只取年、月、日、時、分、秒
        LocalDateTime dt5 = LocalDateTime.now();
        int year = dt5.getYear();
        int month = dt5.getMonthValue();
        int day = dt5.getDayOfMonth();
        int hour = dt5.getHour();
        int minute = dt5.getMinute();
        int second = dt5.getSecond();

        System.out.println("year: " + year);
        System.out.println("month: " + month);
        System.out.println("day: " + day);
        System.out.println("hour: " + hour);
        System.out.println("minute: " + minute);
        System.out.println("second: " + second);

        // 拆回 LocalDate 和 LocalTime
        LocalDate onlyDate = dt5.toLocalDate();
        LocalTime onlyTime = dt5.toLocalTime();
        System.out.println("onlyDate: " + onlyDate);
        System.out.println("onlyTime: " + onlyTime);

        // 日期+時間比較
        LocalDateTime dt6 = LocalDateTime.of(2026, 6, 11, 10, 30);
        LocalDateTime dt7 = LocalDateTime.of(2026, 6, 12, 18, 45);

        System.out.println(dt6.isBefore(dt7));  // true
        System.out.println(dt6.isAfter(dt7));   // false
        System.out.println(dt6.equals(dt7));    // false
        // ⚠️ 不要用 ==
    }

    public static void periodDuration() {
        // Period 日期差（年月日）
        LocalDate startDate = LocalDate.of(2025, 12, 23);
        LocalDate endDate = LocalDate.of(2026, 2, 5);
        Period p = Period.between(startDate, endDate);
        System.out.println("相差年: " + p.getYears());
        System.out.println("相差月: " + p.getMonths());
        System.out.println("相差日: " + p.getDays());

        // Duration 時間差（時分秒）
        LocalTime startTime = LocalTime.of(9, 30);
        LocalTime endTime = LocalTime.of(12, 45);
        Duration d = Duration.between(startTime, endTime);
        System.out.println("相差小時: " + d.toHours());
        System.out.println("相差分鐘: " + d.toMinutes());
        System.out.println("相差秒: " + d.getSeconds());

        // ChronoUnit 計算兩個日期的總天數
        // 跟period寫法一致
        // import java.time.temporal.ChronoUnit;
        LocalDate start = LocalDate.of(2025, 12, 23);
        LocalDate end = LocalDate.of(2026, 2, 5);
        long days = ChronoUnit.DAYS.between(start, end);
        System.out.println(days);

        // until() 計算兩個日期的總天數
        LocalDate start2 = LocalDate.of(2025, 12, 23);
        LocalDate end2 = LocalDate.of(2026, 2, 5);
        long days2 = start2.until(end2, ChronoUnit.DAYS);
        System.out.println(days2);
    }

    public static void main(String[] args) {
        localTime();
    }
}
