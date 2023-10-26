package COre;

import java.time.LocalDate;

public class Book extends Publication{

	private int count;
	
	public Book(String title, double price, LocalDate publishdate, int rate, int count) {
		super(title, price, publishdate, rate); 
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return super.toString() +" Book count=" + count + "]";
	}
	
	

}
