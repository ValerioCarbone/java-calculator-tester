package org.experis.bonus;

import java.math.BigDecimal;

public class Ticket {

    // FIELDS

    final static BigDecimal pricePerKm = BigDecimal.valueOf(0.21);

    final static BigDecimal youngDisc = BigDecimal.valueOf(0.2);

    final static BigDecimal oldDisc = BigDecimal.valueOf(0.4);

    private BigDecimal finalPrice;

    // COSTRUCTOR

    public Ticket(double age, double km) throws IllegalArgumentException {
        if (age <= 0 || km <= 0) {
            throw new IllegalArgumentException("Invalid input. Age or Km must be over 0");
        }

        BigDecimal price = BigDecimal.valueOf(km).multiply(pricePerKm);

        if (age < 18) {
            finalPrice = price.subtract(price.multiply(youngDisc));
        } else if (age >= 65) {
            finalPrice = price.subtract(price.multiply(oldDisc));
        } else {
            finalPrice = price;
        }

    }

    // METHODS

    public BigDecimal getPrice() {
        return finalPrice;
    }
}
