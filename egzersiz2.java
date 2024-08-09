import java.util.Scanner;

public class egzersiz2 {
         public static void main(String[] args) {
           
            Scanner scan = new Scanner(System.in);
    //1
    
            String [] meals = {"Doner" , "Kebap" , "Lahmacun"};
            int [] mealsPrice = {80 , 110 , 75};
    
    
            for(int i = 0; i < meals.length; i++){
                System.out.println(i + 1 + " for " + meals[i] + "(" + mealsPrice[i] + ")");
    
            }
            int mealId;
            int drinkId;
            while(true){
            System.out.print("Enter the ID of the meal you want: ");
             mealId = scan.nextInt();
    
            if(mealId >= 1 && mealId <= meals.length){
                break;
            }
            else{
                System.out.println("Invalid number");
            }
            }
    
    
            String [] drinks = {"Ayran" , "Kola" , "Salgam"};
            int [] drinksPrice = {10 , 20 , 15};
            
            for(int i = 0; i < drinks.length; i++){
                System.out.println(i + 1 + " for " + drinks[i] + "(" + drinksPrice[i] + ")");
            } 
            while(true){
    
            System.out.print
        ("Enter the ID of the drink you want: ");
            drinkId = scan.nextInt();
    
            if(drinkId >= 1 && drinkId < drinks.length){
               break;
            }
            else{
                System.out.println("Invalid number");
            }
        }
    
    
            int totalCost = mealsPrice[mealId - 1] + drinksPrice[ drinkId - 1];
    
            System.out.println(meals[mealId - 1] + " and " + drinks[drinkId - 1] + " " + totalCost + " liras.");
    
            System.out.println("------------------------------------------------------------------------" + 
            "-------------------------------------------------------------------------------------------");
    
            // 2
            System.out.println("100 GB quota for 80 lira and 3 lira per GB use with 15% tax. --> 1");
            System.out.println("200 GB quota for 140 lira and 5 lira per GB with 10% tax. --> 2");
    
            System.out.print("Select membership type: ");
            int select = scan.nextInt();
    
            System.out.print("Please write internet usage in GB: ");
            int netUsage = scan.nextInt();
    
            int quota;
            double taxRate;
            double basePrice;
            double costPerGb;
            double totalCost2;
    
               if(select == 1){
               quota = 100;
                taxRate = 0.15;
                basePrice = 80;
                costPerGb = 3;
    
                if(netUsage > quota){
                    double extraUsage = netUsage - quota;
                    basePrice += extraUsage * costPerGb;
                    totalCost2 = basePrice * (1 + taxRate);
                }else{
                    totalCost2 = basePrice * (1 + taxRate);
                }
              
    
            }
            else if(select == 2){
                quota = 200;
                taxRate = 0.10;
                basePrice = 140;
                costPerGb = 5;
    
                if(netUsage > quota){
    
                 double extraUsage = netUsage - quota;
                 basePrice += extraUsage * costPerGb * (1 + taxRate);
                 totalCost2 = basePrice;
                } else{
                    totalCost2 = basePrice * (1 + taxRate);
                }
               
    
            }
    
            else {
    
                System.out.println("ERROR! Invalid number.");
                return;
            }
            
            System.out.println("Total cost is " + totalCost2 + " liras.");
    
            System.out.println("---------------------------------------------------------------------------------------------------" + 
            "-------------------------------------------------------------------------------------------------------------------------");
    
           //3
    
          System.out.println("Enter the number of attack: 1 or 2 --->");
          int attack = scan.nextInt();
    
          int damage = 0;
    
          if(attack == 1){
    
            System.out.println("Enter result of first coin toss: 0 for tails / 1 for heads / 2 for random --->");
            int coin1 = scan.nextInt();
            if(coin1 == 2){
                coin1 = (int) (Math.random() * 2);
                
            }
    
            System.out.println("Enter result of second coin toss: 0 for tails / 1 for heads / 2 for random --->");
            int coin2 = scan.nextInt();
    
            if(coin2 == 2){
                coin2 = (int) (Math.random() * 2);
                
            }
    
            if(coin1 == 1 && coin2 == 1){
                damage = 60;
            } else{
                System.out.println("No  damage dealt.");
            }
            
        } else if( attack == 2){
            System.out.println("Enter result of first coin toss: 0 for tails / 1 for heads / 2 for random --->");
            int coin1 = scan.nextInt();
            if(coin1 == 2){
                coin1 = (int) (Math.random() * 2);
            }
            
            System.out.println("Enter result of second coin toss: 0 for tails / 1 for heads / 2 for random --->");
            int coin2 = scan.nextInt();
            if(coin2 == 2){
                coin2 = (int) (Math.random() * 2);
            }
            damage = 50 + (coin1 == 1 ? 20 : 0) + (coin2 == 1 ? 20 : 0);
    
        }
        else{
            System.out.println("Invalid attack number.");
            return;
        }
           
        System.out.println("Damage dealt: " + damage);
    
        }
        
    } 