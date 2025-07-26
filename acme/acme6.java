
public class acme6 {
        public static void main(String[] args) {
            //  3               3
            //    *          *
            //      2     2
            //         1
            //      2     2
            //    *          *
            //  3               3
               
           int n= 7 , mid = n/2+1 , stv = mid-1;
           for (int i = 1; i <=n; i++) {
                for (int j = 1; j <= n; j++) {
                  if (i==j || j==n+1-i) {
                    if (i%2==0 && i!=mid) {
                      System.out.print(" *");
                    }else {
                      System.out.print(stv+"  ");
                    }
                  }else{
                    System.out.print("  ");
                  }
                }

                if (i%2!=0 && i < mid)
                {
                  stv--;
                }else if (i==mid || i%2 != 0) 
                {
                  stv++;
                }
                System.out.println();
           }

        }   
}
