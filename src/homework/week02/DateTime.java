package homework.week02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.util.Arrays;

public class DateTime {
    public static void main(String[] args) {

        //1
        LocalDate bir = LocalDate.of(1996, 6, 25);
        System.out.printf("My birthday is : %s.%n", bir);

        LocalDate today = LocalDate.now();
        System.out.println("Today is : " + today);
        System.out.println("This year birthday is: " + today.getYear() +
                "-" + bir.getMonth() + "-" + bir.getDayOfMonth());

        LocalDate thisYearBirthday = LocalDate.of(2026, 6, 25);
        long days = ChronoUnit.DAYS.between(today, thisYearBirthday);
        System.out.printf("There are %d days left until my birthday.%n", days);

        //2
        LocalTime now = LocalTime.now();
        System.out.println("H : " + now.getHour() + " M : " + now.getMinute() + " S : " + now.getSecond());
        System.out.println(now.plusHours(3));
        long hour = ChronoUnit.HOURS.between(now, LocalTime.of(12, 0));
        System.out.println(hour);

        //3
        LocalDateTime t1 = LocalDateTime.of(2025, 12, 25, 18, 30);
        LocalDateTime t2 = LocalDateTime.of(2025, 12, 25, 18, 30);

        System.out.println(t1.equals(t2));

        //4
        // 台北時間 2025-12-25 18:30
        ZonedDateTime taipei = ZonedDateTime.of(2025, 12, 25, 18, 30, 0, 0, ZoneId.of("Asia/Taipei"));
        // 紐約時間 2025-12-25 10:30
        ZonedDateTime newYork = ZonedDateTime.of(2025, 12, 25, 10, 30, 0, 0, ZoneId.of("America/New_York"));
        System.out.println("台北: " + taipei);
        System.out.println("紐約: " + newYork);

        System.out.println(taipei.isBefore(newYork));
        System.out.println(taipei.isAfter(newYork));
        System.out.println(taipei.isEqual(newYork));

        //5
        // 1. 取得現在的 UTC 時間
        Instant now2 = Instant.now();

        // 2. 轉換成台北時間和紐約時間
        ZonedDateTime taipei2 = now2.atZone(ZoneId.of("Asia/Taipei"));
        ZonedDateTime newYork2 = now2.atZone(ZoneId.of("America/New_York"));

        // 3. 比較是否是同一個瞬間
        boolean isSame = taipei2.isEqual(newYork2);

        // 4. 印出結果
        System.out.println("UTC時間: " + now);
        System.out.println("台北時間: " + taipei2);
        System.out.println("紐約時間: " + newYork2);
        System.out.println("是否為同一瞬間: " + isSame);

        //5
        // 1. 建立三個事件（台北、倫敦、紐約）
        ZonedDateTime taipeiEvent = ZonedDateTime.of(2025, 12, 25, 18, 0, 0, 0, ZoneId.of("Asia/Taipei"));
        ZonedDateTime londonEvent = ZonedDateTime.of(2025, 12, 25, 10, 0, 0, 0, ZoneId.of("Europe/London"));
        ZonedDateTime newYorkEvent = ZonedDateTime.of(2025, 12, 25, 5, 0, 0, 0, ZoneId.of("America/New_York"));

        // 2. 轉成 UTC（Instant）
        Instant taipeiInstant = taipeiEvent.toInstant();
        Instant londonInstant = londonEvent.toInstant();
        Instant newYorkInstant = newYorkEvent.toInstant();

        // 3. 排序
        Instant[] events = {taipeiInstant, londonInstant, newYorkInstant};
        Arrays.sort(events);

        // 印出結果
        System.out.println("事件順序（UTC）:");
        for (int i = 0; i < events.length; i++) {
            System.out.println((i + 1) + ". " + events[i]);
        }
    }
}
