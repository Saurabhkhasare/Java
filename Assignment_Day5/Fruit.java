package Assignment_Day5;

public class Fruit {

	private String name;
	private String color;
	private double weight;
	private boolean fresh;

	public Fruit(String name, String color, double weight) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void markstale() {
		fresh = false;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + ", fresh=" + fresh;
	}

	public String taste() {

		return "no specific test";
	}

}
