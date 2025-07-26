
public class acme2 {
    public static void main(String[] args) {

        // *                                           * 
        // 100 0                                       100 0
        // * * *                                       * * * 
        // 300 400 500 600                             300 400 500 600
        // * * * * *                                   * * * * *
        // 700 800 900 1000 1100 1200                  500 600 700 800 900 1000
        
         

        int n = 8; // you can change this to any number
        int count = 100;
        int a = 500;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    // Odd row → print *
                    System.out.print("* ");
                } else {
                    // Even row
                    if (i == 2 && j == 2) {
                        System.out.print("0 ");
                        count += 100; // still increase count
                    } 
                    else if (i == 6){
                        System.out.print(a + " ");
                        a += 100;
                    }
                    
                    else {
                        System.out.print(count + " ");
                        count += 100;
                    }
                }
            }
            System.out.println();
        }
    }
}