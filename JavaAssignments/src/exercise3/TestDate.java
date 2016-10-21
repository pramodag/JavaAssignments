package exercise3;

class Date {
	int day, month, year;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}

public class TestDate {

	public static void main(String[] args) {
		Date d1;
		d1=new Date();
		d1.day=21;
		d1.month=10;
		d1.year=2016;
		print(d1);
		doSomething(d1);
		print(d1);
	}

	static void print(Date d) {
		System.out.printf("%d.%d.%d\n", d.day, d.month, d.year);
	}
	static void doSomething(Date d){
		d.month++;
	}
	
}
