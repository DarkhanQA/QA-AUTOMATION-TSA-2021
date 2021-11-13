package Labs;

public class Lab_Conditions_Loops {
    public static void main(String[] args) {

        /**
         Create a weather app
         - Get the weather type of the day eg. Sunny, Rainy, Cloudy, Windy etc
         - Store above values into an array for next 5 days
         - Based on the weather type print "Show Sun Icon", "Show Rain Icon", "Show Cloud Icon",
         "Show Wind Icon" etc
         - Continue to print forecast for next 5 days
         *Output:
         * Day 1 -> Show sun icon
         * Day 2 -> Show Rain icon
         * Day 3 -> Show cloud icon
         * Day 4 -> Show Rain icon
         * Day 5 -> Show cloud icon
         */
        System.out.println("\nTASK to create Weather Icons for 7 days _ 11/13");

        String[] weatherType = {"Sunny", "Rainy", "Cloudy", "Windy", "ThunderStorm", "PartiallyCloudy", "Sunny"};
        int j = 1;     // this one is for DAY #  > increments after each loop
        for (int i =0; i <=weatherType.length-1; i++){      // initiation, condition, increment
            String currentWeatherType = weatherType[i];     // holds current type of Weather Type in current loop
            switch (currentWeatherType.toLowerCase()){
                case "sunny":
                    System.out.println("-- Day " + (j) + " weather is " + weatherType[i] + " ->>>>  Show SUN icon");
                    break;
                case "rainy":
                    System.out.println("-- Day " + (j) + " weather is " + weatherType[i] + " ->>>>  Show RAIN icon");
                    break;
                case "cloudy":
                    System.out.println("-- Day " + (j) + " weather is " + weatherType[i] + " ->>>>  Show CLOUD icon");
                    break;
                case "windy":
                    System.out.println("-- Day " + (j) + " weather is " + weatherType[i] + " ->>>>  Show WIND icon");
                    break;
                case "thunderstorm":
                    System.out.println("-- Day " + (j) + " weather is " + weatherType[i] + " ->>>>  Show LIGHTNING icon");
                    break;
                case "partiallycloudy":
                    System.out.println("-- Day " + (j) + " weather is " + weatherType[i] + " ->>>>  Show CLOUD+SUN icon");
                    break;
            }
            j++;
        }


    //  SELF PRACTICE

        System.out.println("\n\nELSE-IF condition practice + NESTED ELSE-IF");
        String weather = "cold";
        int temp = 33;
        if(weather.equalsIgnoreCase("")){        // < {} if multiple lines of code operations inside condition MUST use {}
            System.out.println("enjoy the weather.");
            System.out.println("And put on the sunscreen.");
        } else if (weather == "rainy")
            System.out.println("please take your umbrella with you.");   // <  if single line u can skip {}
        else if (weather == "cold") {
            System.out.println("it is cold outside, wear warm clothes.");
            if (temp > 45)                                              //  nested else-if inside of main else if
                System.out.println("It is chilly outside. Temp is " + temp + " degrees, grab a hoodie.");
            else if (temp <=45 && temp > 25)
                System.out.println("It is cold outside. Temp is " + temp + " degrees, grab a jacket.");
            else
                System.out.println("It is very cold outside. Temp is " + temp + " degrees, grab a coat.");
        }else
            System.out.println("please enter valid weather condition.");
    }

}




