package Part2.examples;

public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            int dayMins = 24 * 60 ;
            int yearMins = dayMins * 365 ;
            long YY = minutes / yearMins;
            long ZZ = (minutes % yearMins) / dayMins;
            System.out.println(""+minutes+" min = "+YY+" y and "+ZZ+" d");
        }
    }
}