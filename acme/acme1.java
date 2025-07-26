
public class acme1 {
    public static void main(String args[]) {
        // *  
        // 20 25 
        // 30  *  *          
        // 40 45 50 55       
        // 50  *  *  *  *    
        // 60 65 70 75 80 85 
        // 70  *  *  *  *  *  *
        int stv = 10;

        for (int i = 1; i <= 7; i++) {
            int crv = stv;

            if (i % 2 == 0) { // Even lines
                for (int j = 1; j <= i; j++) {
                    System.out.print(crv + " ");
                    crv = crv + 5;
                }
            } else { // Odd lines
                for (int j = 1; j <= i; j++) {
                    if (i == 1) {
                        System.out.print("* ");
                    } else if (j == 1 && i != 1) {
                        System.out.print(crv + "  ");
                    }else {
                        System.out.print("*  ");
                    }
                }
            }

            System.out.println();
            stv += 10;
        }
    }
}
