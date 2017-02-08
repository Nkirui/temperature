package com.example.karugo.tempoconverter;

/**
 * Created by karugo on 2/7/17.
 */

public class unitConverter {

    //convert from fahrenheit
    public static double celsiusToFahrenheit(double f) {
        return ((f- 32) * 5 / 9);
    }

    // converts to celsius
    public static double fahrenheitToCelsius(double c) {
        return (((c * 9) /5)+ 32);
    }
}
