/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colby_brooks_interactivefiction;
import java.util.Scanner;
/**
 *
 * @author colby
 */
public class Colby_brooks_interactiveFiction {
static Scanner sc = new Scanner(System.in);
    static boolean tryAgain;
    static public int counter = 3;
   
    public static void main(String[] args) {
        tryAgain = true;
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("Okay " + name + " Let's play a game");
        
        while (counter > 0){
        start();
        if (counter == 0){
                System.out.println("$$\\     $$\\                         $$\\                               ");
                System.out.println("\\$$\\   $$  |                        $$ |                              ");
                System.out.println(" \\$$\\ $$  /$$$$$$\\  $$\\   $$\\       $$ | $$$$$$\\   $$$$$$$\\  $$$$$$\\  ");
                System.out.println("  \\$$$$  /$$  __$$\\ $$ |  $$ |      $$ |$$  __$$\\ $$  _____|$$  __$$\\ ");
                System.out.println("   \\$$  / $$ /  $$ |$$ |  $$ |      $$ |$$ /  $$ |\\$$$$$$\\  $$$$$$$$ |");
                System.out.println("    $$ |  $$ |  $$ |$$ |  $$ |      $$ |$$ |  $$ | \\____$$\\ $$   ____|");
                System.out.println("    $$ |  \\$$$$$$  |\\$$$$$$  |      $$ |\\$$$$$$  |$$$$$$$  |\\$$$$$$$\\ ");
                System.out.println("    \\__|   \\______/  \\______/       \\__| \\______/ \\_______/  \\_______|");
               tryAgain = false;
            }
        }
        counter--;
        
    }
    public static void died() {
        counter--;
    }
    

    /**
     * @param args the command line arguments
     */
 /*
    START START START
    
    */
   static public void start(){

       System.out.println("You have " + counter + " lives!");
        System.out.println("You just woke up");
        System.out.println("Do you want to snooze your alarm or get up?");
        String choice1 = sc.nextLine();
        if(choice1.contains("Snooze") || choice1.contains("snooze")){
            start();
        }
        else if(choice1.contains("Get") || choice1.contains("get")){
            wokeUp();
        }  
    }
   
   /*
   Woke Up
   */
   public static void wokeUp(){
    System.out.println("You just got out of bed, do you want to brush your teeth or just use mouthwash?");
    String brushTeeth = sc.nextLine();
    if(brushTeeth.contains("Brush") || brushTeeth.contains("brush")){
        brushed();
    }
    else if(brushTeeth.contains("Mouth") || brushTeeth.contains("mouth")){
        mouthWashed();
    }
        else {
            System.out.println("I'm sorry I didn't understand what you said...");
            wokeUp();
        }

}
   /*
   If Brushed Teeth
   */
   
   public static void brushed() {
       System.out.println("Gotta get dressed! Do you want to dress fancy or casual?");
       String dress = sc.nextLine();
       if(dress.contains("Fancy") || dress.contains("fancy")){
           fancy();
       }
       else if(dress.contains("Casual") || dress.contains("casual")){
           goodCasual();
       }
        else {
            System.out.println("I'm sorry I didn't understand what you said...");
            brushed();
        }
   }
   
   /*
   if mouth washed
   */
   
   public static void mouthWashed(){
       System.out.println("Gotta get dressed! Do you want to dress fancy or casual?");
       String dress = sc.nextLine();
        if(dress.contains("Fancy") || dress.contains("fancy")){
           fancy();
       }
       else if(dress.contains("Casual") || dress.contains("casual")){
           badCasual();
       }
        else {
            System.out.println("I'm sorry I didn't understand what you said...");
            mouthWashed();
        }
   }
   //dresses fancy
   public static void fancy() {
       System.out.println("Do you want to ride the bus or take your bike to work?");
         String travel = sc.nextLine();
         if(travel.contains("Bus") || travel.contains("bus")){
         busGood();
   }
         else if (travel.contains("Bike") || travel.contains("bike")) {
             bikeGood();
         }
         else {
            System.out.println("I'm sorry I didn't understand what you said...");
            fancy();
        }
   }
   // dresses casual (good)
   public static void goodCasual(){
       System.out.println("Do you want to ride the bus or take your bike to work?");
         String travel = sc.nextLine();
         if(travel.contains("Bus") || travel.contains("bus")){
         busHit();
   }
         else if (travel.contains("Bike") || travel.contains("bike")) {
             bikeGood();
         }
         else {
            System.out.println("I'm sorry I didn't understand what you said...");
            goodCasual();
        }
   }
   // Dresses casual (bad)
   public static void badCasual () {
       System.out.println("Do you want to ride the bus or take your bike to work?");
         String travel = sc.nextLine();
         if(travel.contains("Bus") || travel.contains("bus")){
         busHit();
   }
         else if (travel.contains("Bike") || travel.contains("bike")) {
             bikeHit();
         }
         else {
            System.out.println("I'm sorry I didn't understand what you said...");
            badCasual();
        }
   }
   // killed on bus
   public static void busHit (){
    System.out.println("The bus you were riding swerved off the bridge and you died!!!");
    died();
}
   // Good bus condition
   public static void busGood(){
       System.out.println("You made it to work but the bus ran a little late due to traffic and now you're late! You have yet to eat breakfast,"
               + "do you want to get something to eat and be extra late or just go to work on an empty stomach?");
       String busBreakfast = sc.nextLine();
       if(busBreakfast.contains("Get") || busBreakfast.contains("get")) {
           badBreakfast();
       }
       System.out.println("You made it to work but the bus ran a little late due to traffic and now you're late! You have yet to eat breakfast,"
               + "do you want to get something to eat and be extra late or just go to work on an empty stomach?");
       if(busBreakfast.contains("Go") || busBreakfast.contains("go")) {
           hungry();
           
       }
   }
   // user chooses whether to eat breakfast (bike)
   public static void bikeGood () {
       System.out.println("You made it to work but you ran a little late due to traffic and now you're late! You have yet to eat breakfast,"
               + "do you want to get something to eat and be extra late or just go to work on an empty stomach?");
       String busBreakfast = sc.nextLine();
       if(busBreakfast.contains("Get") || busBreakfast.contains("get")) {
           goodBreakfast();
       }
       System.out.println("You made it to work but the bus ran a little late due to traffic and now you're late! You have yet to eat breakfast,"
               + "do you want to get something to eat and be extra late or just go to work on an empty stomach?");
       if(busBreakfast.contains("Go") || busBreakfast.contains("go")) {
           hungry();
   }
   }
   // user gets killed on bike
   public static void bikeHit () {
       System.out.println("A bus swerved into the bike lane and killed you!!!");
       died();
   
}
   
   // user chooses where to eat breakfast
   public static void badBreakfast (){
    System.out.println("Where should you go to eat breakfast? You can eat at McDonalds or Denny's");
    String badBreakfast = sc.nextLine();
    if (badBreakfast.contains("McDonalds") || badBreakfast.contains("mcdonalds")) {
        badMcD();
    }
    else if (badBreakfast.contains("Denny") || badBreakfast.contains("denny")) {
        badDenny();
    }
    
}
   
   // user dies on way to breakfast
   public static void badMcD() {
    System.out.println("On your way to McDonalds a meteorite fell from the sky and crushed you and you died!!!!");
       died();
}
   public static void badDenny() {
       System.out.println("On your way to Denny's a meteorite fell from the sky and crushed you and you died!!!!");
       died();
   }
   
   
   //good breakfast condition
   public static void goodBreakfast (){
       System.out.println("You think to yourself 'is it really worth going to work?'. You can either go to breakfast or go home, the choice is yours");
       String goodBreakfast = sc.nextLine();
       if (goodBreakfast.contains("Breakfast") || goodBreakfast.contains("breakfast")) {
        badBreakfast();
    }
    else if (goodBreakfast.contains("Home") || goodBreakfast.contains("home")) {
        home();
    }
   }
   String goodBreakfast = sc.nextLine();
   
   //player doesnt eat breakfast
   public static void hungry (){
       System.out.println("You decided to skip breakfast and just go to work, on your way up to your office a strange man offered you an apple, you"
               + "are starving so you accept the offer. A few minutes later you start to feel dizzy. You've been poisoned and now you're dead!");
       died();
   }
   
  // Player goes home
   public static void home() {
    System.out.println("Good Job! You had perfect outcome to a Monday morning! You win!!!");
    win();
}
   public static void win() {
       System.out.println("WINNER WINNER CHICKEN DINNER!!!!!!!!!!!");
       tryAgain = false;
   }
   }




           
