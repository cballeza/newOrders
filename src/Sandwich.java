public class Sandwich {

	private String bread;
	private String vegetables;
	private String meat;
	private double totalPrice = 0;

	public Sandwich(int breadSelect, String veggieSelect, int meatSelect, double vegTotal) {

		
		
		if (breadSelect == 1) {

			bread = "White Bread";
			totalPrice += 1.5;
		} else if (breadSelect == 2) {

			bread = "Wheat Bread";
			totalPrice += 1.6;
		} else if (breadSelect == 3) {

			bread = "French Bread";
			totalPrice += 1.8;

		} else if (breadSelect == 4) {

			bread = "Organic Bread";
			totalPrice += 2.0;
		}
		vegetables = veggieSelect;
		totalPrice += vegTotal;
	
		if (meatSelect == 1) {

			meat = "Ham";
			totalPrice += 1.0;
			
		} else if (meatSelect == 2) {

			meat = "Roasted Chicken Breast";
			totalPrice += 1.1;
		} else if (meatSelect == 3) {

			meat = "Turkey Breast";
			totalPrice += 1.2;

		} else if (meatSelect == 4) {

			meat = "Roast Beef";
			totalPrice += 1.5;
		}
	}

	public String getBread() {

		return bread;

	}
	public String getVeggies() {
		
		return vegetables;
	}
	public String getMeat() {
		
		return meat;
	}
	public double getTotalPrice() {
		
		return totalPrice;
	}
}
