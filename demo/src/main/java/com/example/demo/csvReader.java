package com.example.demo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class csvReader {
    public static double csvRead(String curr) {
        String line = "";
        String splitBy = ",";
        String csvPath = ""; //<<<------------------- įkopijuoti nauja kursai.csv failo kelia (absolute path)!!
        try
        { BufferedReader br = new BufferedReader(new FileReader(csvPath));
            while ((line = br.readLine()) != null)
            { String[] currency = line.split(splitBy);
                if(curr.equals(currency[0])){
                    return Double.parseDouble(currency[1]);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return 0;
    }
}