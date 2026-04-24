package ColleectionFramework;

import java.util.Currency;

public class CurrencyExample {
	public static void main(String[] args) {
		Currency currency1 = Currency.getInstance("USD");
		System.out.println("Currency code: " + currency1.getCurrencyCode());
		System.out.println("Currency symbol: " + currency1.getSymbol());
		System.out.println("Currency Name: " + currency1.getDisplayName());

		Currency currency2 = Currency.getInstance("INR");
		System.out.println("Currency code: " + currency2.getCurrencyCode());
		System.out.println("Currency symbol: " + currency2.getSymbol());
		System.out.println("Currency Name: " + currency2.getDisplayName());

		Currency currency3 = Currency.getInstance("EUR");
		System.out.println("Currency code: " + currency3.getCurrencyCode());
		System.out.println("Currency symbol: " + currency3.getSymbol());
		System.out.println("Currency Name: " + currency3.getDisplayName());

	}
}
