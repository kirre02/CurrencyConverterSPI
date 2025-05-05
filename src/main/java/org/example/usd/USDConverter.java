package org.example.usd;

import org.example.ConverterName;
import org.example.CurrencyConverter;

@ConverterName("USD -> SEK (Dollaromvandlare)")
public class USDConverter implements CurrencyConverter {
    @Override
    public String getConverterName() {
        return "USDConverter";
    }

    @Override
    public double convertToSEK(double amount, String currencyCode) {
        if (!currencyCode.equalsIgnoreCase("USD")) throw new IllegalArgumentException("Invalid currency");
        return amount * 10.5;
    }
}