
public class practice {
    public static void main(String[] args) { 
    int n = 7;
    int mid = n/2+1;
    int stv = 3;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (i==j || j==n+1-i) {
          if (i%2==0 && i !=mid) {
            System.out.print("* ");
          }
          else{
            System.out.print(stv+" ");
          }
        }else{
          System.out.print("  ");
        }
      }

      if (i%2!=0 && i<=mid) {
        stv -=1;
      }else if (i%2!=0 || i==mid) {
        stv +=1;
      }
      
      System.out.println();
    }

  }
}
