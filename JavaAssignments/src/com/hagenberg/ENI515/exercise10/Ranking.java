package com.hagenberg.ENI515.exercise10;
import com.hagenberg.ENI515.exercise10.time.SimpleTime;
import com.hagenberg.ENI515.exercise10.time.Time;
public class Ranking implements Item, Time {
	private Person p;
	private SimpleTime time;
	private int rank;

	public Ranking(Person p, SimpleTime st, int rank) throws ListException {
		this.p = p;
		time = st;
		setRank(rank);
	}

	public Ranking(String name, int id, int h, int m, int s, int rank) throws ListException {
		p = new Person(name, id);
		time = new SimpleTime(h, m, s);
		setRank(rank);
	}

	@Override
	public int getId() {
		return p.getId();
	}

	@Override
	public String getName() {
		return p.getName();
	}

	@Override
	public int compareTo(Item item) {
		// int res = 0;
		// Ranking r = (Ranking) item;
		// res = this.time.getH() - r.getTime().getH();
		// if (res != 0)
		// return res;
		// res = this.time.getM() - r.getTime().getM();
		// if (res != 0)
		// return res;
		// return this.time.getS() - r.getTime().getS();
		return this.getId()-item.getId();
	}

	public SimpleTime getTime() {
		return time;
	}

	@Override
	public void set(int h, int m, int s) {
		time.set(h, m, s);
	}

	public int getRank() {
		return rank;
	}

	public void changeRank(int rank) throws ListException {
		if (rank < 1)
			throw new ListException("Invalid rank");
		this.rank = rank;
	}

	private void setRank(int rank) throws ListException {
		if (rank < 1)
			throw new ListException("Invalid rank");
		this.rank = rank;
	}
}
