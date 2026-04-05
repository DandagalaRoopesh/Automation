package Java_Streams;

import java.util.ArrayList;

import org.testng.annotations.Test;

@Test
public class Strams_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Rahul");
		names.add("Shivam");
		names.add("Don");
		names.add("Amit");
		names.add("Adam");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Rahul");
		names.add("Shivam");
		names.add("Don");
		names.add("Amit");
		names.add("Adam");

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		Long d = names.stream().filter(s -> s.length() > 4).count();
		System.out.println(d);

		Long e = names.stream().filter(s -> s.endsWith("m")).count();
		System.out.println(e);

		Long f = names.stream().filter(s -> s.contains("a")).count();
		System.out.println(f);

		Long g = names.stream().filter(s -> s.equalsIgnoreCase("Rahul")).count();
		System.out.println(g);

		Long h = names.stream().filter(s -> s.equalsIgnoreCase("Shivam")).count();
		System.out.println(h);

		Long i = names.stream().filter(s -> s.equalsIgnoreCase("Don")).count();
		System.out.println(i);

		Long j = names.stream().filter(s -> s.equalsIgnoreCase("Amit")).count();
		System.out.println(j);

		Long k = names.stream().filter(s -> s.equalsIgnoreCase("Adam")).count();
		System.out.println(k);

	}
}
