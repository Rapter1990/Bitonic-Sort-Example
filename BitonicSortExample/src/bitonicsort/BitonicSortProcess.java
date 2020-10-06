package bitonicsort;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

import model.Person;
import util.ShowProcess;

public class BitonicSortProcess {

	private static ArrayList<Person> sortedpersonList = new ArrayList<>();
	private static Person[] sortedPersonArray = null;

	public static void byId(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				return Long.compare(p0.getId(), p1.getId());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = bitonicSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byLastName(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				Collator collator = Collator.getInstance(new Locale("tr", "TR"));
				return collator.compare(p0.getLastname(), p1.getLastname());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = bitonicSort(persons,  compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byName(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				Collator collator = Collator.getInstance(new Locale("tr", "TR"));
				return collator.compare(p0.getName(), p1.getName());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = bitonicSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byAge(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				return Integer.compare(p0.getAge(), p1.getAge());
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = bitonicSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	public static void byRegisterDate(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				if (p0.getRegisterDate().before(p1.getRegisterDate())) {
					return -1;
				} else if (p0.getRegisterDate().after(p1.getRegisterDate())) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		Person[] persons = convertListToArray(personList);
		sortedPersonArray = bitonicSort(persons, compTr);

		sortedpersonList = convertArrayToList(sortedPersonArray);
		ShowProcess.showValues(sortedpersonList);
	}

	private static Person[] convertListToArray(ArrayList<Person> personList) {
		Person[] persons = personList.toArray(new Person[personList.size()]);
		return persons;
	}

	private static ArrayList<Person> convertArrayToList(Person[] persons) {
		ArrayList<Person> personList = new ArrayList<>(Arrays.asList(persons));
		return personList;
	}

	
	private static Person[] bitonicSort(Person[] a,Comparator comp) {
		int up = 1;
		int n = a.length;
		Person[] sortArray = bitonicSort(a, 0, n, up,comp);
		return sortArray;
	}

	private static Person[] bitonicSort(Person[] a, int low, int cnt, int dir,Comparator comp) {
		if (cnt > 1) {
			int k = cnt / 2;

			// sort in ascending order since dir here is 1
			bitonicSort(a, low, k, 1,comp);

			// sort in descending order since dir here is 0
			bitonicSort(a, low + k, k, 0,comp);

			// Will merge wole sequence in ascending order
			// since dir=1.
			bitonicMerge(a, low, cnt, dir,comp);
		}
		
		return a;
	}

	private static void bitonicMerge(Person[] a, int low, int cnt, int dir,Comparator comp) {
		if (cnt > 1) {
			int k = cnt / 2;
			for (int i = low; i < low + k; i++)
				compAndSwap(a, i, i + k, dir,comp);
			bitonicMerge(a, low, k, dir,comp);
			bitonicMerge(a, low + k, k, dir,comp);
		}
	}

	private static void compAndSwap(Person[] a, int i, int j, int dir,Comparator comp) {
		if ((greaterThan(comp,a[i],a[j]) && dir == 1) || (lessThan(comp,a[i],a[j]) && dir == 0)) {
			// Swapping elements
			Person temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
	}

	// ASC
	private static boolean greaterThan(Comparator comp, Person x, Person y) {
		return comp.compare(x, y) > 0;
	}

	// DESC
	private static boolean lessThan(Comparator comp, Person x, Person y) {
		return comp.compare(x, y) < 0;
	}
}
