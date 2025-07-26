public class DateDifference {
    public static void main(String[] args) {

        // Define first date (dd/mm/yyyy)
        int d1 = 1, m1 = 1, y1 = 2020;

        // Define second date (dd/mm/yyyy)
        int d2 = 1, m2 = 1, y2 = 2024;

        // Array to store number of days in each month (for a non-leap year)
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        // -------------------- Calculate total days for first date --------------------

        // Start with total days from complete years before y1
        int totalDays1 = y1 * 365;

        // Add extra days for leap years before y1
        for (int i = 0; i < y1; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                totalDays1++; // leap year adds one extra day
            }
        }

        // Add days from months of the current year before month m1
        for (int i = 0; i < m1 - 1; i++) {
            totalDays1 += daysInMonth[i];
        }

        // Add one extra day if the current year is leap and month is after February
        if (m1 > 2 && ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))) {
            totalDays1++;
        }

        // Finally, add the current day
        totalDays1 += d1;

        // -------------------- Calculate total days for second date --------------------

        int totalDays2 = y2 * 365;

        for (int i = 0; i < y2; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                totalDays2++;
            }
        }

        for (int i = 0; i < m2 - 1; i++) {
            totalDays2 += daysInMonth[i];
        }

        if (m2 > 2 && ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))) {
            totalDays2++;
        }

        totalDays2 += d2;

        // -------------------- Print the difference --------------------

        int difference = Math.abs(totalDays2 - totalDays1);
        System.out.println("Difference in days: " + difference);
    }
}










// public class DateDifference {
//     public static void main(String[] args) {
//         int d1 = 1, m1 = 1, y1 = 2020;
//         int d2 = 1, m2 = 1, y2 = 2024;
//         int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

//         int days1 = y1 * 365, days2 = y2 * 365;

//         for (int i = 0; i < y1; i++) if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) days1++;
//         for (int i = 0; i < y2; i++) if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) days2++;

//         for (int i = 0; i < m1 - 1; i++) days1 += daysInMonth[i];
//         for (int i = 0; i < m2 - 1; i++) days2 += daysInMonth[i];

//         if (m1 > 2 && ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)) days1++;
//         if (m2 > 2 && ((y2 % 4 == 0 && y2 % 100 != 0) || y2 % 400 == 0)) days2++;

//         days1 += d1;
//         days2 += d2;

//         System.out.println("Difference in days: " + Math.abs(days2 - days1));
//     }
// }
