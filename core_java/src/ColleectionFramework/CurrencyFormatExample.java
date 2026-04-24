package ColleectionFramework;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatExample {
    public static void main(String[] args) {

        double amount = 123456.789;

        Locale indiaLocale = new Locale.Builder()
                .setLanguage("en")
                .setRegion("IN")
                .build();

        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        System.out.println(indiaFormat.format(amount));

        // US
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(usFormat.format(amount));

        // Japan
        NumberFormat japanFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println(japanFormat.format(amount));
    }
}
