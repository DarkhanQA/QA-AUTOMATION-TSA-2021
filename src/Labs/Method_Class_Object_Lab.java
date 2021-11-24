package Labs;

public class Method_Class_Object_Lab {


    public static void main(String[] args) {

        int[] arrayOfIntgrs = {90, 56, -76, 22, 33, 99, 67, 23};
        int maxValueInArray = arrayOfIntgrs[0];

        for (int currentValueInArray : arrayOfIntgrs){
            if (currentValueInArray > maxValueInArray)
                maxValueInArray = currentValueInArray;
        }
        System.out.println("Max Value in given array is: " + maxValueInArray);


        System.out.println(nameRevMethod("Darkhan Khamid"));
        System.out.println(nameRevMethod("Ovi Md Hassan"));
        System.out.println(nameRevMethod("Siva Sankari"));



    }


    //created a method below:
    public static String nameRevMethod(String studentName){
        String stringToReverse = studentName;
        String[] nameArray = stringToReverse.split("");
        String reversedName = "";

        for (int i = nameArray.length-1; i >=0; i--){
            reversedName += nameArray[i];
        }
        return reversedName;
    }
}



