package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String operation;
    public static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            operation = reader.readLine();
            if (operation.equals("q")) {
                break;
            }
            String[] a_b = Parsing.parsing(Solution.operation);
            try {
                if (Integer.parseInt(a_b[0].trim())>0&&Integer.parseInt(a_b[0].trim())<11){
                    AraCalculator.araCalculator();
                    System.out.println(result);
                }
            } catch (NumberFormatException e) {

                Rome.getRomeFromAra(RomeCalculator.romeCalculator());
            }
        }
    }
}
