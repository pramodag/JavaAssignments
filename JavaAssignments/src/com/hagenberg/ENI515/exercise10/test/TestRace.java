package com.hagenberg.ENI515.exercise10.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.hagenberg.ENI515.exercise10.Person;
import com.hagenberg.ENI515.exercise10.Race;
import com.hagenberg.ENI515.exercise10.Ranking;
import com.hagenberg.ENI515.exercise10.time.SimpleTime;
import com.hagenberg.ENI515.exercise10.time.SimpleTime.Mode;
public class TestRace {
	@Test
	public void test() {
		String NEWLINECHAR = System.getProperty("line.separator");
		Race collection = new Race(5);
		SimpleTime.setMode(Mode.H24);
		collection.setRaceName("Ski world champion");
		try {
			Ranking p = new Ranking(new Person("Pramod", 2),
					new SimpleTime(0, 5, 40), 3);
			Ranking p1 = new Ranking(new Person("Some guy", 3),
					new SimpleTime(0, 5, 42), 5);
			Ranking p2 = new Ranking(new Person("Some otherGuy", 4),
					new SimpleTime(0, 5, 45), 7);
			Ranking p3 = new Ranking(new Person("Someone Else", 5),
					new SimpleTime(0, 5, 46), 2);
			Ranking p4 = new Ranking(new Person("Some girl", 6),
					new SimpleTime(0, 5, 42), 1);
			collection.add(p);
			assertTrue(1 == collection.size());
			collection.add(p1);
			assertTrue(2 == collection.size());
			collection.add(p2);
			assertTrue(3 == collection.size());
			collection.add(p3);
			assertTrue(4 == collection.size());
			assertTrue(collection.remove(p2));
			collection.add(p4);
			assertTrue(4 == collection.size());
			assertTrue(collection.contains(p3));
			assertTrue("Ski world champion".equals(collection.getRaceName()));
			String s = "Race name: Ski world champion" + NEWLINECHAR
					+ "Participents" + NEWLINECHAR
					+ "Rank: 1 Name: Some girl Time:0:5:42" + NEWLINECHAR
					+ "Rank: 2 Name: Someone Else Time:0:5:46" + NEWLINECHAR
					+ "Rank: 3 Name: Pramod Time:0:5:40" + NEWLINECHAR
					+ "Rank: 5 Name: Some guy Time:0:5:42" + NEWLINECHAR;
			assertTrue(s.equals(collection.toString()));
		} catch (Exception e) {}
	}
}
