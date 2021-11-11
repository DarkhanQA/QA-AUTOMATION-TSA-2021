package HomeWorks;

import java.util.Arrays;

public class HomeWork_4_ArraysConcepts {

    public static void main(String[] args) {

        // Due Date: Nov 11   __by DARKHAN KHAMID

        /**
         * Q1  -  TASK  :
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (NOTE: you CANNOT use length() from String class)
         * Hint: you need to use split() method and length (from Array)
         * >>> System.out.println("Country name length = " + country.length());    // <-- CANNOT do it.
         */
        System.out.println("\nTASK 1:");
        String country = "Argentina";
        System.out.println("Country = " + country);

        String[] countrySplit = country.split("");    // here i am splitting the country name by nothing
        int countryLengthBySplit = countrySplit.length;     // here i am counting the length of splits
        System.out.println("Length of country name - " + country + " is "+ countryLengthBySplit + " characters.");
                                                            // printing the length of the given country

        // ---------------------------
        /**
         * Q2  - -  TASK:
         * Print the number of words in the sentence2-value
         */
        System.out.println("\nTASK 2:");
        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        System.out.println("Given sentence is: " + sentence2);

        String[] arrayOfWordsInSentence = sentence2.split(" ");  // splitting by spaces
        int numberOfWordsInSentence = arrayOfWordsInSentence.length;   // counting the number of words in array
        System.out.println(numberOfWordsInSentence + " is the number of words in the given sentence.");


        //-------------------------

        /**
         * Q3:
         * Create the abbreviation for 4-word sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */
        System.out.println("\nTASK 3:");
        String sentence3 = "make America great again";
        System.out.println("Given sentence is: " + sentence3);

        String[] splitArray = sentence3.toUpperCase().split(" "); // split array creation and to upper case
        System.out.println(Arrays.toString(splitArray)); // here i splat up into separate words

        char abrrevChar1 = splitArray[0].charAt(0);   // getting the 1st char of the 1st word
        char abrrevChar2 = splitArray[1].charAt(0);   // getting the 1st char of the 2st word
        char abrrevChar3 = splitArray[2].charAt(0);   // getting the 1st char of the 3st word
        char abrrevChar4 = splitArray[3].charAt(0);   // getting the 1st char of the 4st word

        System.out.println(abrrevChar1 +""+ abrrevChar2 +""+ abrrevChar3 +""+ abrrevChar4);  // printing all CHARS together
                                        // when adding without """ > returns integer value ??? (unicode sum)
                                        // to ge the abbreviation right, had to use  +""+  in between of CHAR variables

    }
}
