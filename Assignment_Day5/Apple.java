package Assignment_Day5;

public class Apple extends Fruit {

	public Apple(double weight) {

		super("Apple", "RED", weight);

	}

	@Override
	public String taste() {

		return "Sweet and Sour";
	}

	public void jam() {
		System.out.println("name : " + super.getName() + " colour : " + super.getColor() + " JAM!!!!!");
	}

}
