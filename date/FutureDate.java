public class FutureDate {
    public static void main(String[] args) {

        int day = 7, month = 7, year = 2025;  // today's date: 7 July 2025
        int daysToAdd = 500;

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        while (daysToAdd > 0) {
            // Check for leap year and adjust February
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                daysInMonth[1] = 29;
            } else {
                daysInMonth[1] = 28;
            }

            int daysLeftInMonth = daysInMonth[month - 1] - day + 1;

            if (daysToAdd >= daysLeftInMonth) {
                daysToAdd -= daysLeftInMonth;
                day = 1;
                month++;

                if (month > 12) {
                    month = 1;
                    year++;
                }
            } else {
                day += daysToAdd;
                daysToAdd = 0;
            }
        }

        System.out.println("Final date after 500 days: " + day + "/" + month + "/" + year);
    }
}
