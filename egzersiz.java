
import java.util.Scanner;
public class egzersiz {  
        public static void main(String[] args) {
             
            Scanner scan = new Scanner(System.in);
    
            // 1
            System.out.print("Enter an Integer: ");
            int num = scan.nextInt();
      
            int result = 0;
            int count = 0;
            int num2 = 0;
            if(num < 0){
                 num2 = num * (-1);
            }
            else{
                 num2 = num;
            }
    
            for(int i = num2; i > 0; i /= 10){
                count ++;
    
                if(count == 2){
                    result = i % 10;
                    break;
                }
    
            }
            System.out.println("Result: " + result);
            System.out.println("---------------------------------------------------------------------");
    
            // 2
            System.out.print("Enter the minutes spent: ");
            int minutes = scan.nextInt();
    
            if( minutes < 0){
                System.out.println(" ERROR! Minutes cannot be negative!");
            }
            else{
            
            int hours = (minutes + 59) / 60;
    
            int totalAmount = hours * 50;
            int overpaid = (hours * 60 - minutes);
    
            System.out.println("Total amount to pay " + totalAmount + " liras.");
            System.out.println("Overpaid amont " + overpaid + ".");
            }
    System.out.println("--------------------------------------------------------------");
    
            // 3
            System.out.print("Enter the value of K: ");
            int k = scan.nextInt();
    
            if(k < 0){
                System.out.println("ERROR! K cannot be negative!");
            }
            double p = 1.0 / 6;
            double probability = Math.pow(1 - p, k - 1) * p;
            System.out.println("The probability of the first 4 on trial " 
                    + k + " is " + probability + ".");
                    
    
        }
     } 

