package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.Person;

public class DefineValues {

	public static ArrayList<Person> defineValues(ArrayList<Person> personList) throws ParseException {
		
		String pattern = "dd/MM/yyyy"; 
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		
		Person person1 = new Person();
		person1.setId(5);
		person1.setName("Ali");
		person1.setLastname("Mert");
		person1.setAge(21);		
		person1.setRegisterDate(dateFormat.parse("10/01/2017"));
		
		Person person2 = new Person();
		person2.setId(1);
		person2.setName("Gizem");
		person2.setLastname("Özge");
		person2.setAge(25);
		person2.setRegisterDate(dateFormat.parse("10/10/2018"));
		
		Person person3 = new Person();
		person3.setId(4);
		person3.setName("Köktuð");
		person3.setLastname("Mert");
		person3.setAge(20);
		person3.setRegisterDate(dateFormat.parse("9/12/2018"));
		
		Person person4 = new Person();
		person4.setId(2);
		person4.setName("Ali");
		person4.setLastname("Yaðmur");
		person4.setAge(16);
		person4.setRegisterDate(dateFormat.parse("15/04/2019"));

		Person person5 = new Person();
		person5.setId(6);
		person5.setName("Pelinsu");
		person5.setLastname("Ýlkem");
		person5.setAge(30);
		person5.setRegisterDate(dateFormat.parse("01/01/2018"));
		
		Person person6 = new Person();
		person6.setId(3);
		person6.setName("Çaðrý");
		person6.setLastname("Özgen");
		person6.setAge(27);
		person6.setRegisterDate(dateFormat.parse("01/01/2020"));
		
		Person person7 = new Person();
		person7.setId(8);
		person7.setName("Eda");
		person7.setLastname("Can");
		person7.setAge(41);
		person7.setRegisterDate(dateFormat.parse("11/11/2019"));
		
		Person person8 = new Person();
		person8.setId(7);
		person8.setName("Polen");
		person8.setLastname("Rengi");
		person8.setAge(36);
		person8.setRegisterDate(dateFormat.parse("05/05/2020"));
		
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);
		personList.add(person6);
		personList.add(person7);
		personList.add(person8);
		
		return personList;
	}
}
