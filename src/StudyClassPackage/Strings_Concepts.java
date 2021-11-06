package StudyClassPackage;

import java.util.Locale;

public class Strings_Concepts {

    public static void main(String[] args) {

        /**
         * LENGTH() method syntax below
         */
        String cityName = "New York";
        int cityNameLength = cityName.length();
        System.out.println("\nLength of the " + cityName + " is " + cityNameLength+" characters long.");

        /**
         * EQUALS() method
         * for comparison, when we need to verify if 2 strings are IDENTICAL
         * return type is boolean, if 2 strings are identical > returns true else false
         * for strings to be identical - need to have same length and have to be identical
         */
        String countryName = "South Korea", clientCountryName = "North Korea";
        boolean isCountryEqual = countryName.equals(clientCountryName);
        System.out.println("Is client's country name - " + clientCountryName + " equals to " + countryName + "? Answer: " + isCountryEqual + ".");
        /**
         * verify
         */

        cityName = "nEW YoRk ciTY";
        String checkFor = "NEW";
        String cityName_UpperCase = cityName.toUpperCase();
        checkFor = checkFor.toUpperCase();
        boolean isContains = cityName_UpperCase.contains(checkFor);
        System.out.println("");

        /**
         * REPLACE
         * it will replace all valid instances
         * it will replace the value in the Given string and return the result
         */
        String news = "Covid cases are now spread to Brazil as well.";
        String newsReplaceWithNewCountry = news.replace("Brazil", "Ukraine");
        System.out.println("\nOriginal news: " + news + "\nAnd after replace news are: " + newsReplaceWithNewCountry);



    }
}
