import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60 * 60 * 89000);
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf2.format(y3));
		System.out.println(sdf2.format(x4));
		System.out.println(sdf2.format(x3));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
	}
	

}
