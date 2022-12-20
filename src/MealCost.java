
public class MealCost {

	public static void main(String[] args) {
		solve(12, 20, 8);

	}

	private static void solve(double meal_cost, int tip_percent, int tax_percent) {
		/*
		 * double tip = tip_percent*meal_cost/100; double tax =
		 * tax_percent*meal_cost/100;
		 */
		meal_cost=meal_cost+((tip_percent*meal_cost)/100)+((tax_percent*meal_cost)/100);
        System.out.println(Math.round(meal_cost));
		/*
		 * System.out.println(tip); System.out.println(tax);
		 */
        //System.out.println(Math.round(total));
		
	}

}
