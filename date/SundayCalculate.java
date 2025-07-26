public class SundayCalculate {
    public static void main(String[] args) {
         int year = 2025;
         int totaldays = 365;
         int sundaycount = 0;
                
        if ((year%4==0 && year%100 != 0) || (year%400==0)) {
              totaldays++;
        }
        int daycode = 3 ; // wed
   
        for (int i = 0; i < totaldays ; i++) {
               if ((daycode + i) % 7==0) {
                 sundaycount++;
               }
        }
        System.out.println(sundaycount);
       
        
    }
}
