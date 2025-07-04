import java.time.Duration;
import java.time.LocalDateTime;

public class Time {
    public static long calculateMinutesBetween(LocalDateTime start, LocalDateTime end) {
        return Duration.between(start, end).toMinutes();
    }

    public static LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }

    public static long calculateDaysBetween(LocalDateTime start, LocalDateTime end) {
        return Duration.between(start, end).toDays();
    }
}