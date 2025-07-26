public class acme7 {

    public static void main(String[] args) {
    
                    //        1
                    //      *   *
                    //    2       2 
                    //  *           *
                    // 3              3
                    //  *           *
                    //    2       2
                    //      *   *
                    //        1
    
                int n = 9;
                int mid = n/2;
                int stv =1;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        
                        if (j==i-mid || j==mid+i || j==mid+2-i || j==n-i+mid+1) {
                            if (i%2==0) {
                                System.out.print("* ");
                            }else{
                                System.out.print(stv+" ");
                            }
                        }else{
                            System.out.print("  ");
                        } 
                    }
                    if (i%2!=0 && i<mid){
                    stv+=1;
                    }else if (i%2!=0 && i>mid){
                    stv-=1;
                    }
                    System.out.println();
                }
            }
    }