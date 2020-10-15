package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringCalculatorApp {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringCalculator calculator = new StringCalculator();
        System.out.println(calculator.splitAndSum(str));
    }

}
