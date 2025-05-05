package org.example;

public interface CurrencyConverter {
    String getConverterName();
    double convertToSEK(double amount, String currencyCode);
}
