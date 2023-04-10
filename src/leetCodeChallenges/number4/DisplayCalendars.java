package leetCodeChallenges.number4;

public class DisplayCalendars {
    public static void main(String[] args) {
        displayCalender(2023, 0);
        
    }

    public static void displayCalender(int year, int firstDay){

        String monthName = "Jan";
        int monthDays = 0;

        for(int month = 1; month <= 12; month++){

            switch (month){
                case 1 :
                    monthDays = 31;
                    monthName = "Jan";
                    break;
                case 2 :
                    monthDays = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
                    monthName = "Feb";
                    break;
                case 3 :
                    monthDays = 31;
                    monthName = "Mar";
                    break;
                case 4:
                    monthDays = 30;
                    monthName = "Apr";
                    break;
                case 5:
                    monthDays = 31;
                    monthName = "May";
                    break;
                case 6 :
                    monthDays = 30;
                    monthName = "Jun";
                    break;
                case 7:
                    monthDays = 31;
                    monthName = "Jul";
                    break;
                case 8:
                    monthDays = 31;
                    monthName = "Aug";
                    break;
                case 9:
                    monthDays = 30;
                    monthName = "Sep";
                    break;
                case 10:
                    monthDays = 31;
                    monthName = "Oct";
                    break;
                case 11:
                    monthDays = 30;
                    monthName = "Nov";
                    break;
                case 12:
                    monthDays = 31;
                    monthName = "Dec";
                    break;
            }

            System.out.println("\n\t\t"+monthName+" "+year);
            System.out.println("___________________________");
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

            for(int i = 0; i < firstDay; i++){
                System.out.print("\t");
            }
            for(int i = 1; i <= monthDays; i++){
                if(firstDay > 6){
                    firstDay = 0;
                    System.out.println();
                }
                System.out.printf("%2d\t",i);
                firstDay++;
            }
            System.out.println();

        }
    }
}
