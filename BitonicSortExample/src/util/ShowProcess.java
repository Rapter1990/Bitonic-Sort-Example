package util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import model.Person;

public class ShowProcess {

	private static String pattern = "dd/MM/yyyy"; 
	private static SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

	public static void showValues(ArrayList<Person> personList) {
			
		System.out.println("Person List");
		for(Person person : personList) {
			
			//String registerDate = dateFormat.format(person.getRegisterDate());
			
			Date input = person.getRegisterDate();
			LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String registerDate = date.format(formatter);
			
			System.out.println("ID : " + person.getId() + " || "
			                 + "NAME : " + person.getName() + " || "
					         + "LASTNAME : " + person.getLastname() + " || "
					         + "AGE : " + person.getAge() + " || "
					         + "REGISTER DATE : " + registerDate
					);
		}
	}
}
