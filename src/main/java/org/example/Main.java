package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<CurrencyConverter> loader = ServiceLoader.load(CurrencyConverter.class);
        List<CurrencyConverter> converters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tillgängliga valutakonverterare:");

        int index = 1;
        for (CurrencyConverter converter : loader) {
            String name = converter.getConverterName();
            System.out.println(index + ". " + name);
            converters.add(converter);
            index++;
        }

        if (converters.isEmpty()) {
            System.err.println("❌ Inga valutakonverterare hittades.");
            return;
        }

        System.out.print("Ditt val (1-" + converters.size() + "): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice < 1 || choice > converters.size()) {
            System.err.println("❌ Ogiltigt val.");
            return;
        }

        CurrencyConverter selected = converters.get(choice - 1);
        System.out.printf("Ange belopp i %s: ", selected.getSupportedCurrencyCode());
        double amount = scanner.nextDouble();

        double result = selected.convertToSEK(amount, selected.getSupportedCurrencyCode());
        System.out.printf("💰 %.2f %s motsvarar %.2f SEK enligt %s%n",
                amount,
                selected.getSupportedCurrencyCode(),
                result,
                selected.getConverterName());
    }
}
