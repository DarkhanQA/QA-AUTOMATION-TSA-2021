package HomeWorks;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class HomeWork_2_TempConversions_and_DataTypes {

   // HOMEWORK 1 _ part 1 _ TEMPERATURE CONVERSIONS _ DK 11/04
    private static final DecimalFormat df = new DecimalFormat("0.00");  // to round to 2 decimals
    public static void main(String[] args) {

        System.out.println("\nHello! This is my 1st Java Home Work on Temperature conversions! :)");

        /**
         *  FAHRENHEIT to CELSIUS temperature conversion
         *  formula: T(°C) = (T(°F) - 32) × 5/9
         *  ex: fahrTemp = 99  which is celsTemp = 37.22222(2)
         */
        double fahrTemp = 99;
        double celsTemp = (fahrTemp - 32) * 5/9;
        System.out.println("\nTASK 1: F to C: 99 degrees Fahrenheit equals to " +  df.format(celsTemp) + " degrees Celsius");
                                                                                   // with df here , i rounded to 2 decimals
        /**
         *  FAHRENHEIT to KELVIN temperature conversion
         *  formula: T(°K) = (T(°F) + 459.67) × 5/9
         *  ex: fahrTemp = 99  which is kelvTemp = 310.37222222
         */
        double kelvTemp = (fahrTemp + 459.67) * 5/9;
        System.out.println("TASK 2: F to K: 99 degrees Fahrenheit equals to " +  df.format(kelvTemp) + " degrees Kelvin");

        /**
         *  CELSIUS to FAHRENHEIT temperature conversion
         *  formula: T(°F) = T(°C) × 9/5 + 32
         *  ex: cTemp = 11  which is fTemp = 51.8
         */
        double cTemp = 11;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("\nTASK 3: C to F: 11 degrees Celsius equals to " +  df.format(fTemp) + " degrees Fahrenheit");

        /**
         *  CELSIUS to KELVIN temperature conversion
         *  formula: T(K) = T(°C) + 273.15
         *  ex: cTemp = 11  which is kTemp = 284.15
         */
        double kTemp = cTemp + 273.15;
        System.out.println("TASK 4: C to K: 11 degrees Celsius equals to " +  df.format(kTemp) + " degrees Kelvin");

        /**
         *  KELVIN to CELSIUS temperature conversion
         *  formula: T(°C) = T(K) - 273.15
         *  ex: kelvinTemp = 699  which is celsiusTemp = 425.85
         */
        double kelvinTemp = 699;
        double celsiusTemp = kelvinTemp - 273.15;
        System.out.println("\nTASK 5: K to C: 699 degrees Kelvin equals to " +  df.format(celsiusTemp) + " degrees Celsius");

        /**
         *  KELVIN to FAHRENHEIT temperature conversion
         *  formula: T(°F) = T(K) × 9/5 - 459.67
         *  ex: kelvinTemp = 999  which is fahrenTemp = 1338.53
         */
        kelvinTemp = 999;
        double fahrenTemp = kelvinTemp * 9/5 - 459.67;
        System.out.println("TASK 6: K to F: 999 degrees Kelvin equals to " +  df.format(fahrenTemp) + " degrees Fahrenheit");


    // HOMEWORK 2 part 2 _ STORE VALUES in VARIABLES _ DK 11/04

        // Number of Hours in a Day
        byte hoursInDay = 24;   //  storing number of Hours in a Day in BYTE
        System.out.println("\nTASK 1 (part2): Number of hours in a day is: " + hoursInDay);

        // Max number of days in a Year
        short daysInYear = 366;   //  storing in short data type
        System.out.println("TASK 2 (part2): Maximum Number of Days in a Year is: " + daysInYear + ". It is a leap year.");

        // Total Number of employees in an Organization.
        // Example: NASA employees count estimation is 17000 people
        short emplsCountNASA = 17000;   //  storing in short
        System.out.println("TASK 3 (part2): As per NASA records, as of 2021, more than " + emplsCountNASA + " employees work for NASA.");

        // Population in a Country
        // Example: U.S. population is 329.5 million people
        int ppltnUSA = 333601303;   //  storing in int data type
        System.out.println("TASK 4 (part2): Population of the USA as of November 2021 is: " + ppltnUSA + " people.");

        // Mortgage Rate
        float mrtgRate = 3.3756f;   //  storing in float as a practice, can store in double as well
        System.out.println("TASK 5 (part2): The client's current Mortgage Rate is: " + mrtgRate + "%");

        // Balance in the Bank Account
        // Example 1 Nigerian Naira is 0.0024 US dollars > so to store Balance in Nairas for rich people > using Long data type
        long bankAccntBlnc = 1231470019308l;   //  storing in long for a made up Richest person in Nigeria
        System.out.println("TASK 6 (part2): Richest man in Nigeria has a bank account balance of: " + bankAccntBlnc + " Nigerian Nairas (equivalent of 3 bln US dollars).");

        // Does the SUN rise from the West?
        boolean sunRise = false;   // storing in boolean
        System.out.println("TASK 7 (part2): Does the sun rise from the WEST? Answer is " + sunRise + ". Sun rises from the East and set in the West.");

        // Initials of my Name > USE CHAR
        char firstNameInitial = 'D', lastNameInitial = 'K';   //  storing in float as a practice, can store in double as well
        System.out.println("TASK 8 (part2): My name is Darkhan Khamid and my initials are: " + firstNameInitial + "." + lastNameInitial +".");

    }

}
