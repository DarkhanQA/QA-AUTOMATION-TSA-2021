package HomeWorks;

public class HomeWork_5_ConditionalCode {
    public static void main(String[] args) {

        // Due date: Nov 10  ___ DARKHAN KHAMID HW


        //___________TASK 1 ___________
        /**
         * Create an int variable and store any value in it.
         * if the number is divisible by 5, print "divisible by 5"
         * if the number is divisible by 3, print "divisible by 3"
         * if the number is divisible by 5 and by 3, print "divisible by 5 and 3"
         * if the number is NOT divisible by 5, 3, or 15, print the value in int-variable
         *
         * int num = 45
         */
        System.out.println("\nTASK 1: ");
        int myVar = 16969;
        if (myVar%5 == 0 && myVar%3 == 0) {
            System.out.println("My variable " + myVar + " is divisible by both 5 and 3.");
        } else if (myVar%5 == 0) {
            System.out.println("My variable " + myVar + " is divisible by both 5." );
        } else if (myVar%3 == 0) {
            System.out.println("My variable " + myVar + " is divisible by 3." );
        } else {
            System.out.println("My variable is " + myVar + ". It is NOT divisible by 3, 5 or 15.");
        }

        //___________TASK 1 ___________

        /**
         * Create two variable, one to store student-score and another to store the max-score.
         * If student-score is NOT valid, print error statement, "Invalid student score entered"
         *
         * based on the student scoring percentage, print the grade.
         *
         * Grade-A: 91-100%
         * Grade-B: 81-90.99%
         * Grade-C: 71-80.99%
         * Grade-D: 61-70.00%
         * Grade-E: less than 61
         *
         * (double) myScore = 180
         * (int) maxScore = 200
         *
         * (180/200)*100
         */
        System.out.println("\nTASK 2: ");
        double studentScore = 188.88;       // student's grade variable
        int maxExamScore = 250;         // max exam score variable
        double studentGradeRatio = studentScore / maxExamScore * 100 ;   // calculating  student's score ratio

        System.out.println("Student's exam score is " + studentScore + " / Max exam score is " + maxExamScore + ".");
        System.out.println("Student's exam score ratio is " + studentGradeRatio + "%.");

        if (studentGradeRatio >= 91 && studentGradeRatio <= 100){
            System.out.println("STUDENT'S FINAL EXAM GRADE IS: A");
        } else if (studentGradeRatio >= 81 && studentGradeRatio <= 90.99){
            System.out.println("STUDENT'S FINAL EXAM GRADE IS: B");
        } else if (studentGradeRatio >= 71 && studentGradeRatio <= 80.99){
            System.out.println("STUDENT'S FINAL EXAM GRADE IS: C");
        } else if (studentGradeRatio >= 61 && studentGradeRatio <= 70.99){
            System.out.println("STUDENT'S FINAL EXAM GRADE IS: D");
        } else if (studentGradeRatio < 61){
            System.out.println("STUDENT'S FINAL EXAM GRADE IS: F");
        } else {
            System.out.println("Invalid student score entered");
        }



        }

    }


