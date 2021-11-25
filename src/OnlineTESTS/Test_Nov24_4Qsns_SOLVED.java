package OnlineTESTS;

import java.util.Arrays;

public class Test_Nov24_4Qsns_SOLVED {
    public static void main(String[] args) {

        /**
         * Ques-1:  Create a method to return an int-array after sorting an input-int-array
         * eg:
         * input -> [32, 54, 12, 67, 2, 5]
         * returned array -> [2, 5, 12, 32, 54, 67]
         */

        System.out.println("\n>>> TASK 1 - Create a method to return an int-array after sorting an input-int-array <<<");
        int[] inputArray = {32, 69, 54, 12, 67, 2, 5, 99, -66};
        int buffer;                     // will hold a number then swap
        int[] sortedArray = {};
        for (int n = 0; n < inputArray.length; n++) {
            for (int m = n + 1; m < inputArray.length; m++) {
                if (inputArray[n] > inputArray[m]) {
                    buffer = inputArray[n];
                    inputArray[n] = inputArray[m];
                    inputArray[m] = buffer;
                }
                sortedArray = inputArray;    //  SORTED ARRAY
            }
        }
        System.out.println("unsorted int array: " + Arrays.toString(inputArray));
        System.out.println("sorted int array: "+ Arrays.toString(sortedArray));


        //---------------------------------------------------------------------

        System.out.println("\n>>> TASK 2 - Create a method to return the sum of digits in input-int-value <<<");
        /**
         * Ques-2: Create a method to return the sum of digits in input-int-value
         * eg:
         * input -> 123
         * returned value -> 6
         */
        int inputNumberToBeSummed = 81029;
        String numToString = Integer.toString(inputNumberToBeSummed);
        int[] convertedIntoArray = new int[numToString.length()];
        for (int i = 0; i <= numToString.length() - 1; i++) {
            convertedIntoArray[i] = numToString.charAt(i) - '0';

        }
        System.out.println("Initial Input Integer: " + inputNumberToBeSummed);
        System.out.println("Integer converted into Array: " + Arrays.toString(convertedIntoArray));

        int sumOfValuesInArray = 0;
        for (int j = 0; j <= convertedIntoArray.length - 1; j++) {
            sumOfValuesInArray += convertedIntoArray[j];
        }
        System.out.println("SUM of Integers in Array: " + sumOfValuesInArray);


        //---------------------------------------------------------------------

        System.out.println("\n>>> TASK 3 - Create a method to print the common Strings values in two input-String-arrays <<<");
        /**
         * Ques-3: Create a method to print the common Strings values in two input-String-arrays
         * Note: two input-String-arrays can be of same size or different size
         * eg: input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
         * Method should print ->  happy    peace
         */
        String[] firstStringArray = {"happY", "king", "peace", "living standard"};
        String[] secondStringArray = {"king kong", "Happy", "PEACE"};

        String matchedWords = "";

        for (int i = 0; i < firstStringArray.length; i++) {
            for (int j = 0; j < secondStringArray.length; j++) {
                if (firstStringArray[i].equalsIgnoreCase(secondStringArray[j])) {
                    matchedWords += (firstStringArray[i].toLowerCase() + " ");
                }
            }
        }
        System.out.println("1st Array: " + Arrays.toString(firstStringArray));
        System.out.println("2nd Array:" + Arrays.toString(secondStringArray));
        System.out.println("Matched words: " + matchedWords);

        //---------------------------------------------------------------------

        /**
         * Ques-4:  Create a method to return an int-array after removing input-int-value from an input-int-array
         * input -> 23, {23, 54, 67, 12, 34, 23, 56}
         * returned array -> {54, 67, 12, 34, 56}
         */
        System.out.println("\n>>> TASK 4 - Create a method to return an int-array after removing input-int-value from an input-int-array <<<");

        int intInputToExtract = 55;
        int[] arrayToExtractFrom = {54, 67, 12, 34, 56, 55, 99, 12, 999};

        int length = arrayToExtractFrom.length;
        int i=0;
        for (int j=0; j<length; j++){
            if (arrayToExtractFrom[j] != intInputToExtract){
                arrayToExtractFrom[i] = arrayToExtractFrom[j];
                i++;
            }
        }
        if (i<length) arrayToExtractFrom[i] = '\0';
        System.out.println(Arrays.toString(arrayToExtractFrom) );




    }
}