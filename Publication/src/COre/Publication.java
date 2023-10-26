package COre;

import java.time.LocalDate;

public class Publication {

	private static int idGenerator=1;
	private int id;
	private String title;
	private double price;
	private LocalDate publishdate;
	private int rate;
	
	public Publication(String title, double price, LocalDate publishdate, int rate) {
		super();
		this.id=idGenerator++;
		this.title = title;
		this.price = price;
		this.publishdate = publishdate;
		this.rate = rate;
	}

	
	public static int getIdGenerator() {
		return idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		Publication.idGenerator = idGenerator;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(LocalDate publishdate) {
		this.publishdate = publishdate;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Publication [id=" + id + ", title=" + title + ", price=" + price + ", publishdate=" + publishdate
				+ ", rate=" + rate + "]";
	}
	
	
}
