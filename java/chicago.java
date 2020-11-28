import java.util.*;
import java.util.GregorianCalender;
import java.util.Timezone;
public class chicagot{
    Calender localTime=Calender.getInstance();
    int hour=localTime.get(Calender.hour);
    int min=localTime.get(Calender.min);
    int second=localTime.get(Calender.second);
    int year=localTime.get(Calender.year);
    System.out.printf("Local time: %02d:%02d:%02d %02d\n", hour, minute, second, year);

    Calender ChicagoTime=new GregorianCalender(Timezone.getTimezone("America/Chicago"));
    ChicagoTime.setTimeinMillis(localTime.getTimeinMillis());
    hour = ChicagoTime.get(Calendar.HOUR);
		minute = ChicagoTime.get(Calendar.MINUTE);
		second = ChicagoTime.get(Calendar.SECOND);
        year = ChicagoTime.get(Calendar.YEAR);
        System.out.printf("ChicagoTime: %02d:%02d:%02d %02d\n", hour, minute, second, year);
 
		
        log(TimeZone.getAvailableIDs());
        private static void log(String[] availableIDs) {
 
		System.out.println("\nHere are all list of timezones for your reference:");
		for (String temp : availableIDs) {
			System.out.println(temp);
        }
}
}