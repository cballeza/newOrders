import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class sandwichApp {

	public static void main(String[] args) {

		Date now = new Date();
		DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		String time = defaultDate.format(now);

		Scanner scnr = new Scanner(System.in);

		boolean newOrder = true;
		String onward = "Y";

		while (newOrder) {
			System.out.println("==== Select Sandwich Bread: ==== ");
			System.out.println("1 White Bread:   $1.5\n" + "2 Wheat Bread:   $1.6\n" + "3 French Bread:  $1.8\n"
					+ "4 Organic Bread: $2.0\n");

			int breadSelect;
			System.out.println("Select a bread from 1 to 4");
			breadSelect = scnr.nextInt();

			while (breadSelect <= 0 || breadSelect >= 5) {

				System.out.println("Error! Select a number from 1 to 4\n");
				System.out.println("Select a bread from 1 to 4");
				breadSelect = scnr.nextInt();
			}

			System.out.println("==== Select Sandwich Vegetables: ====");
			System.out.println("1 Red Onions: $0.05\n" + "2 Olives: $0.10\n" + "3 Pickles: $0.10\n"
					+ "4 Lettuce: $0.25\n" + "5 Green peppers: $0.25\n" + "6 Tomatoes: $0.30\n" + "7 Cheese $0.50\n"
					+ "8 Quit vegetable selection\n");

			int temp;
			double vegTotal = 0;
			String veggieSelect = "";
			System.out.println("Select a vegetable from 1 to 7 or select 8 to quit");
			temp = scnr.nextInt();

			while (temp != 8) {
				if (veggieSelect != "") {
					veggieSelect += ", ";
				}
				if (temp <= 0 || temp > 8) {
					System.out.println("Error! Select a number from 0 to 8\n");
				} else {
					veggieSelect += addVeggies(temp);
					vegTotal += vegTotal(temp);

				}
				System.out.println("Select a vegetable from 0 to 7 or select 8 to quit");
				temp = scnr.nextInt();

			}
			System.out.println("==== Select Sandwich Meat: ====");
			System.out.println("1 Ham: $1.0\n" + "2 Roasted Chicken Breast: $1.1\n" + "3 Turkey Breast: $1.2\n"
					+ "4 Roast Beef: $1.5\n" + "5 Quit meat selection\n");

			int meatSelect;
			System.out.println("Select a meat from 1 to 4 or select 5 to quit");
			meatSelect = scnr.nextInt();

			while (meatSelect <= 0 || meatSelect > 5) {

				System.out.println("Error! Select a number from 1 to 5\n");
				System.out.println("Select a meat from 1 to 4 or select 5 to quit");
				meatSelect = scnr.nextInt();
			}
			String customerName;
			System.out.println("Enter your name");
			customerName = scnr.nextLine();
			customerName = scnr.nextLine();

			Sandwich sandwich = new Sandwich(breadSelect, veggieSelect, meatSelect, vegTotal);
			Order order = new Order(customerName, time, sandwich);
			System.out.println(order.getOrder());
			sandwichIO file = new sandwichIO();
			file.writeOrderToFile(order);
			System.out.println("Continue to order more sandwich? (Y/N)");
			onward = scnr.next();
			if (onward.toUpperCase().compareTo("Y") == 0) {
				newOrder = true;
			} else {
				newOrder = false;
			}
		}
	}

	public static String addVeggies(int vegNum) {

		String veggies = "";

		switch (vegNum) {
		case 1:
			veggies = "red onion";
			break;
		case 2:
			veggies = "olives";
			break;
		case 3:
			veggies = "pickes";
			break;
		case 4:
			veggies = "lettuce";
			break;
		case 5:
			veggies = "green peppers";
			break;
		case 6:
			veggies = "tomatoes";
			break;
		case 7:
			veggies = "cheese";
			break;
		}
		return veggies;
	}

	public static double vegTotal(int vegNum) {

		double veggies = 0;

		switch (vegNum) {
		case 1:
			veggies = 0.05;
			break;
		case 2:
			veggies = 0.10;
			break;
		case 3:
			veggies = 0.10;
			break;
		case 4:
			veggies = 0.20;
			break;
		case 5:
			veggies = 0.25;
			break;
		case 6:
			veggies = 0.30;
			break;
		case 7:
			veggies = 0.50;
			break;
		}
		return veggies;
	}
}
