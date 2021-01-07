import java.util.Calendar; 
import java.util.GregorianCalendar;
import java.util.TimeZone;     
public class time{
     public static void main(String[] args) {
        Calendar localTime = Calendar.getInstance();
 
		int hour = localTime.get(Calendar.HOUR);
		int minute = localTime.get(Calendar.MINUTE);
		int second = localTime.get(Calendar.SECOND);
        int year = localTime.get(Calendar.YEAR);
        System.out.printf("Local time: %02d:%02d:%02d %02d\n", hour, minute, second, year);

        Calendar ChicagoTime = new GregorianCalendar(TimeZone.getTimeZone("America/Chicago"));
		ChicagoTime.setTimeInMillis(localTime.getTimeInMillis());
		hour = ChicagoTime.get(Calendar.HOUR);
		minute = ChicagoTime.get(Calendar.MINUTE);
		second = ChicagoTime.get(Calendar.SECOND);
        year = ChicagoTime.get(Calendar.YEAR);
        System.out.printf("ChicagoTime: %02d:%02d:%02d %02d\n", hour, minute, second, year);
 
		
        log(TimeZone.getAvailableIDs());
     }
     private static void log(String[] availableIDs) {
 
		System.out.println("\nHere are all list of timezones for your reference:");
		for (String temp : availableIDs) {
			System.out.println(temp);
        }
    }

    
    

}
