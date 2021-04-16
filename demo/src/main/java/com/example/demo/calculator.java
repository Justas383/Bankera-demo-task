package com.example.demo;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class calculator {
    public static String currencyConv(String fromCurr, String toCurr,BigDecimal value){
        int scale = 18;
        BigDecimal num1 = new BigDecimal(csvReader.csvRead(fromCurr));
        BigDecimal num2 = new BigDecimal(csvReader.csvRead(toCurr));
        return value.multiply(num1.divide(num2, scale, RoundingMode.HALF_UP)).toString();
     }
}
