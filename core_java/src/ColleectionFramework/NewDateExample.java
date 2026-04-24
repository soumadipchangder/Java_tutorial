package ColleectionFramework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NewDateExample {
public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	LocalTime time = LocalTime.now();
	LocalDateTime dateTime = LocalDateTime.now();
	
	System.out.println("Date: "+date);
	System.out.println("Time: "+time);
	System.out.println("DateTime: "+dateTime);
	
	//formatting
	DateTimeFormatter newformat = DateTimeFormatter.ofPattern("dd-MM-YYYY HH-mm-ss");
	String formatted = dateTime.format(newformat);
	System.out.println(formatted);
}
}
