package HomeWorks;
import java.util.Arrays;
import java.util.Scanner;

public class Methods_Storage_for_HW7 {

    public void sentenceAbbreviator(String sentenceToAbbreviate) {

        String[] sentenceBrokenDown = sentenceToAbbreviate.toUpperCase().split(" ");
        String abbrvn = "";
        for (int i = 0; i < sentenceBrokenDown.length; i++) {
            abbrvn += sentenceBrokenDown[i].charAt(0);
        }
        System.out.println(abbrvn);
    }

}
