import java.time.Duration;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        

        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime lastWeek = today.minusDays(7);
        System.out.println(lastWeek);

        Duration duration = Duration.between(today, lastWeek);
        System.out.println(duration.toDays());
    }
}
