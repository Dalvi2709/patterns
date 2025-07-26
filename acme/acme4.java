
public class acme4{
    public static void main(String args[]){

                        // 5 25 
                        // * * *
                        // 30 35 40 45
                        // * * * * *
                        // 50 55 60 65 70 75
        int n=6;
        int count=0;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(i==1){
               continue;
            }
            else if(i==2 && j==2){
                count+=20;
                System.out.print(count+" ");
            }
            else if(i%2==0){
                
              count=count+5;
                System.out.print(count+" ");
                 
            }
            else{
                System.out.print("* ");
            }
        }
        System.out.println();
       }

    }
}