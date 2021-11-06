package HomeWorks;

import java.util.Locale;

public class HomeWork_3_Strings {
    public static void main(String[] args) {


        // Due Date: Nov 7
        System.out.println("\nHomeWork 3 _ JAVA _ by Darkhan _ Nov.6");
        //--------------------------------------------
        //TASK 1 -------------
        String sentence1 = "Hello dear, how are you doing?";
        int result1 = 0;
        /**
         * Store 100 in result1 if the length of sentence1 is greater then or equal to 10
         * else store 150 in result1.
         * hint: use Ternary operator
         */
        int lengthOfSentence1 = sentence1.length();
        result1 = lengthOfSentence1 >= 10 ? 100:150;

        System.out.println("\nTASK 1 -------------- \nSentence1: " + sentence1);
        System.out.println("If sentence1 length is >= 10, return result1 as 100, otherwise 150. Result1 value is : " + result1 + ".");

        //--------------------------------------------
        //TASK 2 -------------
        String sentence2 = "Health was Earlier said to Be the ability of the body functioning WElL.";
        /**
         * replace all instances of a/A with Z
         */
            //1st Replace all 'a' in a sentence with 'Z'
            String replace_a2Z = sentence2.replace("a", "Z");
            //Now let's replace 'A' instances with 'Z'
            String replace_A2Z = replace_a2Z.replace("A", "Z");
            System.out.println("\nTASK 2 -------------- \nInitial sentence: \n   " + sentence2);
            System.out.println("All 'a' and 'A' instances in the initial sentence were replaced with 'Z'. See below:\n   " + replace_A2Z);

        //--------------------------------------------
        //TASK 3 -------------
        /**
         * Print
         *  1. the length of the sentence3-value.
         *  2. result if the sentence3 starts with "health" (ignoring cases)
         *  3. result if the sentence3 contains "Body" (ignoring cases)
         *  4. index of "Body" in sentence3
         */
        String sentence3 = "Health was Earlier said to Be the ability of the body functioning WElL.";

        // Task 1 > return the LENGTH of the sentence
        int sentence3_Length = sentence3.length();
        System.out.println("\nTASK 3 -------------- \nGiven sentence is: " + sentence3);
        System.out.println("   1. Length of the given sentence is: " + sentence3_Length + " characters.");

        // Task 2 > boolean check if the sentence STARTS WITH "health", cases ignored
        String sentence3_toLowerCase = sentence3.toLowerCase();  // here i am converting the given sentence to lower case
        String checkString_health = "health";  // here i am assigning a target word check
        String checkString_health_toLowerCase = checkString_health.toLowerCase();  // converting the target check word into lower case
        boolean isSentenceStartsWith_health = sentence3_toLowerCase.startsWith(checkString_health_toLowerCase);   // here i am checking if sentence StartsWith target word
        System.out.println("   2. Is given sentence above starts with 'health' (cases ignored)? Answer: " + isSentenceStartsWith_health + ".");  //printing the boolean result  here

        // TASK 3 > boolean check of the sentence CONTAINS "Body", cases ignored
        String sentence3_toUpperCase = sentence3.toUpperCase();  // here i am converting the sentence into Upper Case and storing it into a new variable
        String checkString_Body = "Body";   // target string pattern, assigning it into a variable
        String checkString_Body_toUpperCaseCase = checkString_Body.toUpperCase();  //converting target word into an upper case string and storing in a new variable
        boolean doesSentenceContain_Body = checkString_Body_toUpperCaseCase.contains(checkString_Body_toUpperCaseCase);  // checking the sentence if it Contains "BODY"
        System.out.println("   3. Does the given sentence contain the word 'Body' in it (cases ignored)? Answer: " + doesSentenceContain_Body  + "."); // printing the result in boolean

        // TASK 4 > Return INDEX of "Body" in sentence 3
        int indexOf_Body_1stOccurr = sentence3_toUpperCase.indexOf(checkString_Body_toUpperCaseCase);
        int indexOf_Body_lastOccurr =sentence3_toUpperCase.lastIndexOf(checkString_Body_toUpperCaseCase);
        System.out.println("   4.1. Index for 1st occurrence of Body in the sentence is " + indexOf_Body_1stOccurr + ".");
        System.out.println("   4.2. Index for Last occurrence of Body in the sentence is " + indexOf_Body_lastOccurr + ".");



    }

}
