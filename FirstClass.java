//import javax.swing.*;
//import java.awt.*;
import java.util.Scanner;
class FirstClass{
public static void main(String[]arrgs){
System.out.println("WELCOME TO THIS REALLY STUPIDLY FUN GAME...");
int HealthBar;
int integer1 = 0;
boolean WantToContinue =false;
String[] WhichPug = new String[] {"Fawn","Beige","Black","Albino"};
int[] Health = new int[] {100,80,85,130};
int[] Damage = new int[] {6,4,8,10};
 Scanner Scanner_Thingy = new Scanner (System.in);
  while(integer1<1){
  
  System.out.println("ARE YOU ABSOLUTELY, POSITIVELY SURE YOU WANT TO PLAY THIS TERRIBLE GAME?");
  System.out.println("Yes/No");
  String awnser = Scanner_Thingy.next();
 
 if(awnser.equalsIgnoreCase("yes")){
     System.out.println("Wow, Seriously?! You ACTUALLY Said Yes... Ok Then, Have Fun Wasting Your Time!");
     System.out.println("Which Pug Do You Want To Choose? Dont Worry, They're All Evil Killing Machines.");
     integer1 ++;
     WantToContinue =true;
    } else if (awnser.equalsIgnoreCase("no")){
        System.out.println("Wait... Really?! WELL NO REFUNDS!");
        integer1 ++;
    } else {
        System.out.println("Wow... Just Wow, There Was Two Options And You Decided To Write Something Dumb Like That Down?! Crazy Person...");
        System.out.println("Now That Was Kindof Boring,So I'll Give You Another Try, So You Can Experience That Torture Again");
           
    }
}
 int integer2 = 0;
  System.out.println("We Didnt Want To Make You Go Through The Pain Of Writing 'Albino' Or Something, So Just Type The Number, You Lazy Kid");
  while(integer2<WhichPug.length){
      System.out.println(integer2 +1 + " . " + WhichPug[integer2]);
      
      integer2 ++;
    }
 int integer3 = 0;
  while(integer3<1){
      int PugSelected = Scanner_Thingy.nextInt();
       if(PugSelected <= WhichPug.length + 1){
        System.out.println("You Chose " + WhichPug [PugSelected -1]); 
        System.out.println("Are You Positive This Pug Suits You?");
        System.out.println("Yes/No");
        String YesOrNo = Scanner_Thingy.next();
        if(YesOrNo.equalsIgnoreCase("Yes")){ 
         integer3 ++;
         System.out.println("Ok Then, Try And Have Fun! (If That's Possible)");
         String Pug = WhichPug[PugSelected -1];
         ////////STARTUP GAME////////
         
        }
        else if(YesOrNo.equalsIgnoreCase("No")){
         System.out.println("Ok Then, 'Mr-I-Need-To-Have-Perfection', choose another one");
         
        }
      
      
    }
    
}
 //FunctionFactory.Print1();






}

}