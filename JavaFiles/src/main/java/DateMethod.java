import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateMethod {
   Date getDateNow() {
		return new Date();
		
	}
 
   LocalDate getDate() {
	   
	   return LocalDate.now();
   }
   
   public static LocalTime localTime (){
	   return LocalTime.now();
	
	}
}
