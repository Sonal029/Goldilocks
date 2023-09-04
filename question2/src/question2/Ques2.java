package question2;
/**
 * Write a program to read a CSV file and print the same in the output file.
 * This csv file contains three columns having numeric value. The output file
 * should additionally contain the sum of these numeric values.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ques2 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("read.csv"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("write.csv"))) {


        	            String line= reader.readLine();
        	            while (line != null) {
        	                String[] values = line.split(",");
        	                double sum = 0.0;
        	                StringBuilder outputLine = new StringBuilder();
        	                for (String v : values) {
        	                    double value = Double.parseDouble(v);
        	                    sum += value;
        	                    outputLine.append(value).append(",");
        	                }
        	                outputLine.append(sum);
        	                writer.write(outputLine.toString());
        	                writer.newLine();
        	            }


        	            System.out.println("Successful.");
        	        } catch (IOException e) {
        	            e.printStackTrace();
        	        }
        	    }
        	}
