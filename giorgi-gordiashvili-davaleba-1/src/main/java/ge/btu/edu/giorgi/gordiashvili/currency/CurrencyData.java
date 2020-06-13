package ge.btu.edu.giorgi.gordiashvili.currency;

import java.util.ArrayList;
import java.util.List;

public class CurrencyData {
    static List<Currency> getData(){
        List <Currency> currencyList = new ArrayList<>();

        currencyList.add(new Currency("USD", 3.16f,3.2f));
        currencyList.add(new Currency("EUR",3.425f,3.475f));
        currencyList.add(new Currency("GBP",3.84f,3.94f));
        currencyList.add(new Currency("RUB",4.12f,4.3f));
        currencyList.add(new Currency("TRY",0.4f,0.47f));
        currencyList.add(new Currency("AZN",1.6f,1.84f));

        return currencyList;
    }
}
