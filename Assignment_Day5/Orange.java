package Assignment_Day5;

public class Orange extends Fruit {

	public Orange(double weight) {

		super("Orange", "Orange", weight);

	}

	@Override
	public String taste() {

		return "Sour";
	}

	public void juice() {
		System.out.println("name : " + super.getName() + " colour : " + super.getColor() + " extracting JUICE!!!!!");
	}

}
