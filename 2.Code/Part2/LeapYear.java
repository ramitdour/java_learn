package Part2;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(2,2018));
    }
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            boolean isLeapYear = false;

            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        isLeapYear = true;
                    }
                }else{
                    isLeapYear = true;
                }
            }

            return isLeapYear;

        }else{
            return false;
        }
    }

    public static int getDaysInMonth(int month ,int year){
        if((year < 1) || (year > 9999) || (month < 1)  || (month > 12)) {
            return -1;

        }else{
            int days = -2;
            switch(month){
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                    days = 31;
                    break;
                case 4:case 6:case 9:case 11:
                    days = 30;
                    break;
                case 2:
                    if(isLeapYear(year)){
                        days = 29;

                    }else{
                        days = 28;

                    }
                    break;
                default:
                    days = -1;
                    break;

            }
            return days;
        }
    }
}