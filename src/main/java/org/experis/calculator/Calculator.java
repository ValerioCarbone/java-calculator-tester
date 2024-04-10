package org.experis.calculator;

public class Calculator {

    // METODI

    public float add(float num1, float num2) throws IllegalArgumentException {

        float result = num1 + num2;

        if (Float.isNaN(num1) || Float.isNaN(num2) || Float.isNaN(result)) {
            throw new IllegalArgumentException("Input not valid or operation is not valid");
        }

        return result;
    }


    public float subtract(float num1, float num2) {

        float result = num1 - num2;

        if (Float.isNaN(num1) || Float.isNaN(num2) || Float.isNaN(result)) {
            throw new IllegalArgumentException("Input not valid or operation is not valid");
        }

        return result;
    }


    public float divide(float num1, float num2) {

        float result = num1 / num2;

        if (Float.isNaN(num1) || Float.isNaN(num2) || Float.isNaN(result)) {
            throw new IllegalArgumentException("Input not valid or operation is not valid");
        }

        return result;
    }

    public float multiply(float num1, float num2) {

        float result = num1 * num2;

        if (Float.isNaN(num1) || Float.isNaN(num2) || Float.isNaN(result)) {
            throw new IllegalArgumentException("Input not valid or operation is not valid");
        }

        return result;
    }
}
