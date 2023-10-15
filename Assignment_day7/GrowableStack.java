package Assignment_day7;

public class GrowableStack implements Stack {

	static int top = 0;
	private Customer[] Customer;
	private Customer[] Cust1;

	public GrowableStack() {
		Customer = new Customer[stack_size];

	}

	@Override
	public void push(Customer arr) {
		if (top == Customer.length) {
			Customer[] Cust1 = new Customer[Customer.length * 2];

			for (int i = 0; i < Customer.length; i++) {
				Cust1[i] = Customer[i];
			}
			Customer = Cust1; // reference given back to customer

		}

		if (top < Customer.length) {

			Customer[top] = arr;
			System.out.println(top);
			top++;

		} else
			System.out.println("stack is full");

	}

	@Override
	public void pop() {

		if (top > 0) {

			Customer[--top] = null;

			System.out.println("Customer is removed from stack");
		} else {
			System.out.println("stack is underflow");
		}
	}

}
