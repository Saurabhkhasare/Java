package Assignment_Day5;

public class Mango extends Fruit {

	Mango(double weight) {

		super("Mango", "Yellow", weight);
	}

	@Override
	public String taste() {
		return "Sweet";
	}

	public void pulp() {
		System.out.println(" name : " + super.getName() + " " + "colour : " + super.getColor() + " Creating PULP!!!!");
	}

}
