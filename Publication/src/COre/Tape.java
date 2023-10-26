package COre;

import java.time.LocalDate;

public class Tape extends Publication {
	
	private int minutes;

	public Tape(String title, double price, LocalDate publishdate, int rate, int minutes) {
		super(title, price, publishdate, rate);
		this.minutes = minutes;
	}

	

}
