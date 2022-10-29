public class ConditionAndLogic {
    public static void main(String[] args) {
        System.out.println("C&L");

        int a = 4 ;
        int b = 11 ;

        if ( a > 5 || b > 10){
            System.out.println("a > 5 maybe");
        }else {
            System.out.println("a <= 5 maybe");
        }

        boolean isCar = true ;
        int nosWheel = isCar ? 4 : 2;
        System.out.println(nosWheel);



        //-----------------------------------

        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
