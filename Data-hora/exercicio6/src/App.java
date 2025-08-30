import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        System.out.println(".......");

        ZonedDateTime horarioTokio = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(horarioTokio);
        
        ZonedDateTime algumaData = ZonedDateTime.of(2025, 2, 13, 9, 30, 0, 0, ZoneId.of("America/Fortaleza"));
        System.out.println(algumaData);

    }
}
