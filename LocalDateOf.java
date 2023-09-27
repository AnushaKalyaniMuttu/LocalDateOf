import java.time.*;
import java.time.temporal.*;
  
public class LocalDateOf {
    public static void main(String[] args)
    {
        // create LocalDate object
        LocalDate localdate
            = LocalDate.of(2020, 5, 13);
  
        // print full date
        System.out.println("Date: " + localdate);
    }
}
