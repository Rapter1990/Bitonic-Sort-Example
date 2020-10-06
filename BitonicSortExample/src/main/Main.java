package main;

import java.text.ParseException;
import java.util.ArrayList;

import bitonicsort.BitonicSortProcess;
import model.Person;
import util.DefineValues;
import util.ShowProcess;

public class Main {

	private static ArrayList<Person> personList = new ArrayList<>();
	private static ArrayList<Person> sortedpersonList = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {
		
		
		personList = DefineValues.defineValues(personList);
		
		
		System.out.println("---------------------------------");
		System.out.println("BEFORE BITONIC SORT byId");
		ShowProcess.showValues(personList);	
		

		System.out.println("AFTER BITONIC SORT byId");
		BitonicSortProcess.byId(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE BITONIC SORT byLastName");		
		ShowProcess.showValues(personList);				
		
		System.out.println("AFTER BITONIC SORT byLastName");
		BitonicSortProcess.byLastName(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE BITONIC SORT byName");
		ShowProcess.showValues(personList);

		System.out.println("AFTER BITONIC SORT byName");
		BitonicSortProcess.byName(personList);
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE BITONIC SORT byAge");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER BITONIC SORT byAge");
		BitonicSortProcess.byAge(personList);
		System.out.println("---------------------------------");
		
		System.out.println("BEFORE BITONIC SORT byRegisterDate");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER BITONIC SORT byRegisterDate");
		BitonicSortProcess.byRegisterDate(personList);
		System.out.println("---------------------------------");
	}
}
