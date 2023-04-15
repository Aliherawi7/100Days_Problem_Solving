package leetCodeChallenges.displayTheFirstDaysOfEachMonth;


public class DisplayTheFirstDaysOfEachMonth {
    public static void main(String[] args) {
        printAllFirstDayOfMonth(2013, 2);
    }

    public static void printAllFirstDayOfMonth(int year, int firstDay){
        int prevMonthDays = 0;
        String monthName = "jan";
        String weekDay = "";


        for(int month = 1; month <= 12; month++){

            /*
            * in this switch statement we peek up the previous month total days
            * and the current month name.
            * */
            switch (month){
                case 2 :
                    prevMonthDays = 31;
                    monthName = "Feb";
                    break;
                case 3 :
                    prevMonthDays = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
                    monthName = "Mar";
                    break;
                case 4:
                    prevMonthDays = 31;
                    monthName = "Apr";
                    break;
                case 5:
                    prevMonthDays = 30;
                    monthName = "May";
                    break;
                case 6 :
                    prevMonthDays = 31;
                    monthName = "Jun";
                    break;
                case 7:
                    prevMonthDays = 30;
                    monthName = "Jul";
                    break;
                case 8:
                    prevMonthDays = 31;
                    monthName = "Aug";
                    break;
                case 9:
                    prevMonthDays = 31;
                    monthName = "Sep";
                    break;
                case 10:
                    prevMonthDays = 30;
                    monthName = "Oct";
                    break;
                case 11:
                    prevMonthDays = 31;
                    monthName = "Nov";
                    break;
                case 12:
                    prevMonthDays = 30;
                    monthName = "Dec";
                    break;
            }

            /*
            * in this loop we find the the current month first day
            * the way is to increment the firstDay var for each day
            * of the previous month. if the firstDay var reach to the
            * end of week then assign it to zero which mean the first
            * day of week
            * */
            for(int i = 1; i <= prevMonthDays; i++){
                firstDay++;
                if(firstDay > 6){
                    firstDay = 0;
                }
            }
            /*
            * select the day of week by firstDay var
            * */
            switch (firstDay) {
                case 6:
                    weekDay = "Saturday";
                    break;
                case 0:
                    weekDay = "Sunday";
                    break;
                case 1:
                    weekDay = "Monday";
                    break;
                case 2:
                    weekDay = "tuesday";
                    break;
                case 3:
                    weekDay = "wednesday";
                    break;
                case 4:
                    weekDay = "thursday";
                    break;
                case 5:
                    weekDay = "friday";
                    break;

            }
            System.out.println(monthName + " 1 is "+ weekDay);
        }

    }

}
