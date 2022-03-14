import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewDateApi {

    public static void main(String[] args){
        LocalDate localDate ;
        LocalTime localTime;
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
