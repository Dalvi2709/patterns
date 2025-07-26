public class p22
{ 
public static void main(String[] args)
{
    for(int i =1; i <= 5; i++)
 {
 //Printing first half of the row 
for(int j =1; j <= i; j++)
{
    System.out.print(j+" ");
} //Printing second half of the row
for(int j = i-1; j >=1; j--) 
{
     System.out.print(j+" "); 
}
 System.out.println(); 
}
}
}