package Odate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d;
		System.out.println("Teste " + LocalDate.of(20, 1, 1));
		System.out.println(LocalDate.of(2000, 1, 1).toString());
		System.out.println(isValid(LocalDate.of(2000, 1, 1).toString()));
	}
	
	public static boolean isValid(String dateStr) {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		try {
			sdf.parse(dateStr);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

}
