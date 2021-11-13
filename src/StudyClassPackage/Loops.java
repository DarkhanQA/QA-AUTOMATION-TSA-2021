package StudyClassPackage;

public class Loops {
    public static void main(String[] args) {

        System.out.println("\nNames that start with S: ");
        String[] names = {"Joy","Sarah","Dan","Viki","Sam","Mot","Soka","Korra", "Savage", "Moisha"};
        for (String word : names) {
            if (word.length() > 3 && word.startsWith("S")){
                System.out.println(word);
            }

        }
    }
}
