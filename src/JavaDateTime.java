import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class JavaDateTime {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2020, 7, 9);
		System.out.println(ld.getDayOfWeek().toString());
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

	}

}
