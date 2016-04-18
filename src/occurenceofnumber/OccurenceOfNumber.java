package occurenceofnumber;
import java.util.Scanner;
public class OccurenceOfNumber {
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter number between 1 and 100: ");
       int [] numList = new int[100];
       boolean bool = true;
       while(bool){
           int a = input.nextInt();
           if (a != 0)
               numList[a] += a;
           else
               break;
           }//end of while
       
       for ( int i = 1; i < numList.length; i++){
           if (numList[i] != 0){
               if (numList[i]/i > 1)
                   System.out.println(i+ " occurs " + numList[i]/i + " times.");
               else
                   System.out.println(i+ " occurs " + numList[i]/i + " time.");  
           }//end of if
       }//end of for    
     }//end of main  
}
