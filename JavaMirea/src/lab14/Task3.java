package lab14;

import java.util.regex.Pattern;

public class Task3 {
    static void main() {
        var prices = new String[] {"25.98 USD", "44 ERR", "0.004 EU", "1500 RUB", "57.61 EU", "0124 RUB", "0.5 RUB"};
        prices = new String[] {"0.5 RUB", "5 RUB", "1.5 RUB", "1.57 RUB"};
        // 0.5 RUB
        // 5 RUB
        // 1.5 RUB
        // 1.57 RUB
        var regex = "";

        prices = new String[] {"1045 RUB", "12.4 EU", "0.5 USD", "0.001 USD", "0.05 EU", "1024.24 EU", "12.30 RUB",
                "12.03 RUB", "12.30 EER", "00.12 RUB", "000.323 EU", "0.00 USD", "5 RUB", "5.0 RUB"};

        regex = "((?!0)\\d+|0)(\\.?(\\d{1,2}))?\\s(RUB|EU|USD)";

        var pattern = Pattern.compile(regex);
        for (var price : prices){
            var matcher = pattern.matcher(price);
            IO.println(price + " -> " + matcher.matches());
        }
    }
}

/*
1045 RUB
12.4 EU
0.5 USD
0.001 USD
0.05 EU
1024.24 EU
12.30 RUB
12.03 RUB
12.30 EER
00.12 RUB
000.323 EU
0.00 USD
 */