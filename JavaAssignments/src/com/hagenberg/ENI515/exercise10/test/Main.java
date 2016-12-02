package com.hagenberg.ENI515.exercise10.test;
import com.hagenberg.ENI515.exercise10.Person;
import com.hagenberg.ENI515.exercise10.Race;
import com.hagenberg.ENI515.exercise10.Ranking;
import com.hagenberg.ENI515.exercise10.time.SimpleTime;
import com.hagenberg.ENI515.exercise10.time.SimpleTime.Mode;
public class Main {
	public static void main(String[] args) {
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
			Ranking p5 = new Ranking(new Person("Some pther girl", 6),
					new SimpleTime(0, 5, 42), 1);
			collection.add(p);
			collection.add(p1);
			collection.add(p2);
			collection.add(p3);
			System.out.println(collection.remove(p2));
			collection.add(p4);
			collection.add(p5);
			System.out.println(collection);
			p3.changeRank(8);
			System.out.println(collection);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
