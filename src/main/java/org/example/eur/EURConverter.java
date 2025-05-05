package org.example.eur;

import org.example.ConverterName;
import org.example.CurrencyConverter;

@ConverterName("EUR -> SEK (Euroomvandlare)")
public class EURConverter implements CurrencyConverter {
    @Override
    public String getConverterName() {
        return "EURConverter";
    }

    @Override
    public double convertToSEK(double amount, String currencyCode) {
        if (!currencyCode.equalsIgnoreCase("EUR")) throw new IllegalArgumentException("Invalid currency");
        return amount * 11.3;
    }
}
