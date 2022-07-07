package GenericsExampleLinkedIn;

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String item1 = "Apples";
		String item2 = "Oranges";
		String item3 = "Pears";
		String[] shopping = {"Bread", "Milk", "Eggs", "Bananas"};
		printShoppingList(item1, item2, item3);
		printShoppingList(shopping);
		
	}
	
	
	private static void printShoppingList(String... items) {
		System.out.println("SHOPPING LIST");
		for (int i = 0; i < items.length; i++) {
			System.out.println(i + 1 + ": " + items[i]);
		}
		System.out.println();
	}

}
