import java.time.LocalTime;

public class DateClass {

	public static void main(String[] args) {
		DateMethod dt=new DateMethod();
		System.out.println(dt.getDateNow());
        System.out.println(dt.localTime());
        System.out.println(dt.getDate());
	}

}
