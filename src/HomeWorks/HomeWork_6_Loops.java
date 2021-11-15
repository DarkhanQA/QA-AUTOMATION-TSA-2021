package HomeWorks;

import java.util.Arrays;

public class HomeWork_6_Loops {
    public static void main(String[] args) {

        // Due Date: Nov 16  _ DARKHAN KHAMID

        /**
         * Q1:
         * Create the abbreviation for sentence
         *
            * make America great again -> MAGA
            * outfit of the day -> OOTD
            * happy birthday to you -> HBTY
            * Good morning -> GM
            * Happy new Year -> HNY
            * Happy birthday to you dear -> HBTYD
            * happy new year to you dear -> HNYTYD
         *
         */
        System.out.println("\nTASK 1 ____________>> Create the abbreviations for sentences <<______________");
        String[] sentences1to6 = {"I love mY Dog", "make America great again", "outfit of the day", "happy birthday to you",
                                    "Happy new Year", "Happy birthday to you dear", "happy new year to you dear"};

        for (int i = 0; i < sentences1to6.length; i++){    // loop for all the sentences
            String sentenceAbbreviation = "";
            String[] sentenceSplit = sentences1to6[i].toUpperCase().split(" "); // split for a current sentence + turning into Upper case
            for (int j = 0; j < sentenceSplit.length; j++){    // loop for individual sentence to Abbreviate
                sentenceAbbreviation += sentenceSplit[j].charAt(0);   // adding first letters into variable
            }
            System.out.println("Given Sentence is: " + sentences1to6[i]);
            System.out.println("Abbreviation >>> " + sentenceAbbreviation);
        }

        /**
         * Q2:
         *
         *
         * HappY nEW YEAR to YoU dEAr -> Happy New year To You Dear
         * gooD morNING -> Good Morning
         * make AMERICA GreAT AgAIn -> Make America Great Again
         */
        System.out.println("\nTASK 2 ____________>> Change the given sentence in titlecase <<______________");
        String sentenceToBeCapped = "HappY nEW YEAR to YoU dEAr";    // given sentence
        System.out.println("Given sentence is: " + sentenceToBeCapped);
        String[] splitSentenceN = sentenceToBeCapped.toLowerCase().split(" ");  // splitting the sentence into array of words
        sentenceToBeCapped = "";     // cleaning the existing sentence

        for (int i = 0; i < splitSentenceN.length; i++){
            char capLetter = splitSentenceN[i].toUpperCase().charAt(0);     // UP-Casing 1st letters in words with a Capped letter > storing in CHAR
            sentenceToBeCapped += " " + capLetter + splitSentenceN[i].substring(1);  // " " + 1stCappedLetter + the rest of the substring after CharAt(0)
        }
        sentenceToBeCapped = sentenceToBeCapped.trim();   // eliminates leading and trailing spaces
        System.out.println("Result >>> " + sentenceToBeCapped);


        /**
         * Q3:
         * Reverse a String
         *
         * Learn -> Learn
         * Learn More -> More Learn
         * happy birthday to you -> you to birthday happy
         */
        System.out.println("\nTASK 3 ____________>> Reverse a given string sentence <<______________");

        String givenSentenceToReverse = "I am going to REVERSE this sentence!";
        String[] splitSentence = givenSentenceToReverse.split(" ");    // splitting up the sentence into array > separator is " "
        String reversedSentence = "";      // reversed sentence has NOTHING words at this point
        for (int i = splitSentence.length - 1; i >= 0; i--) {
             reversedSentence += splitSentence[i] + " ";    // adding words 1 by 1 from the end + " " after
         }
        System.out.println("Given Sentence is: " + givenSentenceToReverse);
        System.out.println("Reversed >>> " + reversedSentence);



        /**
         * Q4:
         * Find the maximum value from given int-array
         * int[] = {23, 54, 76, 12, 67, 90, 23}     ->  90
         * int[] = {23, 54, 76, 12}     ->  76
         * int[] = {-2, -9, -4, -7, -9, -55}     ->  -2
         */
        System.out.println("\nTASK 4 ____________>> Find and Print the MAX value in the array <<______________");

        int[] intArray = {23, 54, 76, 12, 67, 90, 23, 89, 78};   // given array to validate
        int maxValueInArray = 0;   // storing initial Max-value as 0 for 1st comparison

        for (int n = 0; n<=intArray.length-1; n++){
            int currentValue = intArray[n];         // storing current Array-Value to be evaluated
            if (currentValue > maxValueInArray) {      // if current Array Value is > more than Current Max
                maxValueInArray = currentValue;         // replace Max Current with New Max from Array
            }else
                maxValueInArray = maxValueInArray;     // if NOT then keep current Max value as Max value
        }
        System.out.println("Given array has values of: " + Arrays.toString(intArray)); // printing array as a string
        System.out.println("Max value is >>> " + maxValueInArray);   // printing out the Max value after all loops


    }

        }
