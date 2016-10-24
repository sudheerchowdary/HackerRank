package com.sudheer.hakers.rank;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Sudheer Babu Gutha.
 */
public class CurrencyChallenge {

    public static void main(String args[]){
            NumberFormat currencyFormatter =
                    NumberFormat.getCurrencyInstance(Locale.US);
            System.out.println(currencyFormatter.format(100000.000));
            Locale locale = new Locale("en","in");
            currencyFormatter =
                    NumberFormat.getCurrencyInstance(locale);
            System.out.println(currencyFormatter.format(100000.000));
            currencyFormatter =
                    NumberFormat.getCurrencyInstance(Locale.CHINA);
            System.out.println(currencyFormatter.format(100000.000)); currencyFormatter =
                    NumberFormat.getCurrencyInstance(Locale.FRANCE);
            System.out.println(currencyFormatter.format(100000.000));
    }
}
