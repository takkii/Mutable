import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Sample {
	public static void main(String[] args) {
		LocalDateTime localtime = LocalDateTime.now();
		ZonedDateTime zone = ZonedDateTime.now();

		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("■            " + localtime + "               ■");
		System.out.println("■                                                  ■");
		System.out.println("■     " + zone      + "    ■");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	}
}
