import java.util.Scanner;

public class p1
{ 
public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
         if (i<=5) {
            System.out.print(i);
         }
         else{
            System.out.print("* ");
         }
         if (i<=15) {
            System.out.print(i);
         }
         else{
            System.out.print("* ");
         }
        }
        sc.close();
}
}