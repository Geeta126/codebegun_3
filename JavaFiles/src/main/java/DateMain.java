import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {


	public static void main(String[] args) {
		Date dob = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		System.out.println(sdf.format(dob));
	}

}
