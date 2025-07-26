
public class acme5{
    public static void main(String[] args) {

    //                                 * 
    //                             *   *
    //                        30  20  10 
    //                    60  50  40  30
    //                 *   *   *   *   *
    //             *   *   *   *   *   *
    //        80  70  60  50  40  30  20 
    //   110 100  90  80  70  60  50  40 
    
    int n = 8, start = 30;

    for (int i = 1; i <= n; i++) {
        // Print spaces manually
        for (int j = 1; j <= n - i; j++)
            System.out.print("    ");

        int val = start;

        for (int j = 1; j <= i; j++) {
            if (i == 1 || i == 2 || i == 5 || i == 6)
                System.out.print("  * ");
            else {
                System.out.printf("%3d ", val);
                val -= 10;
            }
        }

        System.out.println();

        // Update start value
        if (i == 3 || i == 4 || i == 7) start += 30;
        if (i == 6) start -= 10;
    }
    }
}