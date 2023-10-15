package Assignment_Day5;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of basket : ");
		Fruit[] basket = new Fruit[sc.nextInt()];

		int counter = 0;
		do {
			System.out.println("Options:");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket");
			System.out.println("5. Display name, color, weight, and taste of fresh fruits in the basket");
			System.out.println("6. Mark a fruit as stale");
			System.out.println("7. Mark all sour fruits as stale");
			System.out.println("8. Invoke fruit-specific functionality (pulp/juice/jam)");
			System.out.println("9. Exit");

			System.out.println("Enter the choice : ");

			switch (sc.nextInt()) {

			case 1:
				if (counter < basket.length) {
					System.out.println("Enter the weight :");
					double weight = sc.nextDouble();

					basket[counter] = new Mango(weight);
					counter++;
					System.out.println("Mango is added in basket");

				}
				System.out.println("Basket is full");

				break;

			case 2:
				if (counter < basket.length) {
					System.out.println("Enter the weight :");
					double weight = sc.nextDouble();

					basket[counter] = new Orange(weight);
					counter++;
					System.out.println("Orange is added in basket");

				}
				System.out.println("Basket is full");

				break;

			case 3:
				if (counter < basket.length) {
					System.out.println("Enter the weight :");
					double weight = sc.nextDouble();

					basket[counter] = new Apple(weight);
					counter++;
					System.out.println("Apple is added in basket");

				}
				System.out.println("Basket is full");

				break;

			case 4:

				for (Fruit fruit : basket) {
					if (fruit != null) {
						System.out.println(fruit.getName());

					}
				}

				break;

			case 5:
				for (Fruit fruit : basket) {
					if (fruit != null) {
						System.out.println(fruit.toString() + ", taste=" + fruit.taste() + "]");
					}
				}
				break;

			case 6:
				System.out.println("Enter the index of the fruit which is stale...");
				int index = sc.nextInt() - 1;
				if (index >= 0 && index <= basket.length) {
					basket[index].markstale();
					basket[index] = null;
					System.out.println("Marked as stale..");

				} else {
					System.out.println("Invalid index");
				}
				break;

			case 7:

				boolean sourFruits = false;
				for (int i = 0; i < basket.length; i++) {
					if (basket[i] != null) {
						if (basket[i].isFresh() && "Sour".equals(basket[i].taste())) {
							basket[i].markstale();
							sourFruits = true;
							basket[i] = null;
						}
					}
				}

				if (sourFruits) {
					System.out.println("Marked all sour fruits as stale.");
				} else {
					System.out.println("No sour fruits found in the basket.");
				}

				break;

			case 8:

				System.out.println("Enter the index of the fruit to invoke specific functionality:");
				int fruitIndex = sc.nextInt();

				if (fruitIndex >= 1 && fruitIndex <= counter) {
					Fruit selectedFruit = basket[fruitIndex - 1];

					if (selectedFruit instanceof Mango) {
						((Mango) selectedFruit).pulp();
					} else if (selectedFruit instanceof Orange) {
						((Orange) selectedFruit).juice();
					} else if (selectedFruit instanceof Apple) {
						((Apple) selectedFruit).jam();
					}
				} else {
					System.out.println("Invalid index.");
				}
				break;

			case 9:

				System.out.println("!!! EXIT !!!");
				if (sc != null && sc.hasNext()) {
					sc.close();
				}

				break;

			default:
				System.out.println("Invalid choice........");
			}

		} while (true);

	}

}
