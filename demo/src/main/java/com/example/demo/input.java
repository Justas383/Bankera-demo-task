package com.example.demo;

import java.math.BigDecimal;
import java.util.Scanner;

public class input {
    public static void CurrencyInput(){

        //Sukuriu scanner objektą ir laukiu vartotojo įvesties
        Scanner inputCurrency = new Scanner(System.in);
        System.out.print("Enter what currency you want to convert(EUR, USD, GBP, BTC, ETH, FKE): ");
        // reads the entire word
        String Currency = inputCurrency.next();
        //Viska paverciu didziosiomis raidėmis
        String Ucurrency = Currency.toUpperCase();
        //Tikrinu ar atitinka valiuta
        if(Ucurrency.equals("EUR")|| Ucurrency.equals("USD")  ||  Ucurrency.equals("GBP")  || Ucurrency.equals("ETH") || Ucurrency.equals("FKE") || Ucurrency.equals("BTC") ){
            System.out.println("You entered correct currency: " + Ucurrency);
            //jei tinka, sukuriu antrą scanner objektą ir valiutos kiekio
            Scanner inputValue = new Scanner(System.in);
            System.out.print("Enter how much "+ Ucurrency +" you want to convert: ");
            BigDecimal value = inputCurrency.nextBigDecimal();
            //tikrinu ar valiutos kiekis yra daugiau negu nulis
            if(value.compareTo(BigDecimal.ZERO) > 0){
                //sukuriu trečią scanner objektą antrai valiutai
                Scanner inputCurrency2 = new Scanner(System.in);
                System.out.print("Enter into what currrency you want to convert (EUR, USD, GBP, BTC, ETH, FKE): ");
                String Currency2 = inputCurrency.next();
                String Ucurrency2 = Currency2.toUpperCase();
                if(Ucurrency2.equals("EUR")|| Ucurrency2.equals("USD")  ||  Ucurrency2.equals("GBP")  || Ucurrency2.equals("ETH") || Ucurrency2.equals("FKE") || Ucurrency2.equals("BTC")){
                    System.out.println("Your conversion of " + value + " " + Ucurrency + " to " + Ucurrency2 + " is: " + calculator.currencyConv(Ucurrency,Ucurrency2,value) + " " + Ucurrency2);}
                else {
                    System.out.println("Please enter a valid currency. You entered: " + Currency2 + ".");
                }
            } else{
                System.out.println("You need to enter a valid value! more than 0");
            }
        } else{
            System.out.println("Please enter a valid currency. You entered: >>>" + Currency + "<<<");
        }
        inputCurrency.close();
    }
}
