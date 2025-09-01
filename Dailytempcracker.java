//3. Daily Temperature Tracker 🌡️
//A weather app stores the temperature of 7 days in an array.
//Use a for loop to calculate the average temperature.
//Find the highest and lowest temperature of the week.
//Display all temperatures above the weekly average.
package Workshop;
import java.util.Scanner;

public class Dailytempcracker {
	

	public static void main(String[] args) {
		int[] temps = {30, 32, 28, 35, 31, 29, 33}; 

        int sum = 0;
        int max = temps[0];
        int min = temps[0];

        // Calculate sum, max, and min
        for (int temp : temps) {
            sum += temp;
            if (temp > max) max = temp;
            if (temp < min) min = temp;
        }

        double average = sum / 7.0;

        // Display results
        System.out.println("Average " + average);
        System.out.println("Highest " + max);
        System.out.println("Lowest " + min);
     
		
		   
		
	}

}
