package SLIIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		String startDate = "01-02-1993";
		String endDate = "01-08-1993";
		
		
		try {
		    Date date1 = myFormat.parse(startDate);
		    Date date2 = myFormat.parse(endDate);
		    long diff = date2.getTime() - date1.getTime();
		    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
		    e.printStackTrace();
		}

	}

}
