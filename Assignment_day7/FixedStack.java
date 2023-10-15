package Assignment_day7;

public class FixedStack implements Stack {

	// Customer[] arr;
	int top = 0;
	private Customer[] Customer;

	public FixedStack() {
	Customer = new Customer[stack_size];
}

	@Override
	public void push(Customer arr) {

		if (top < stack_size) {

			Customer[top] = arr;
			System.out.println(top);
			top++;
			

		} else
			System.out.println("stack is full");

	}

	@Override
	public void pop() {

		if (top > 0) {

			Customer[top] = null;
			top--;
			

			System.out.println("Customer is removed from stack");
		}else {
		System.out.println("stack is underflow");
		}
	}

}
