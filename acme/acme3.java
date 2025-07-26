public class acme3 {
    public static void main(String[] args) {
                //           1 
                //         2 3 2 
                //       3 4 5 4 3 
                //     4 5 6 7 6 5 4 
                //   5 6 7 8 9 8 7 6 5
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int x = i;
            for (int j = 1; j <= n - i; j++) System.out.print("  "); // space print
            for (int j = 1; j < i * 2; j++) {
                System.out.print(x + " ");  // number print
                if (j < i) x++;             // increase in first half
                else x--;                   // decrease in second half
            }
            System.out.println();
        }
    }
}