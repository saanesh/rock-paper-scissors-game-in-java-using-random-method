import java.util.Random;
import java.util.Scanner;
public class GameRockPapperScissor{
  public static void main(String[] args) {
    System.out.println("welcome");
    Scanner sc = new Scanner(System.in);
    int mychoice ,computerchoice , iwon=0 ,cwon=0 ,game=1;
    System.out.println("0 :  Rock");
    System.out.println("1 :  paper");
    System.out.println("2 :  scissor");
    while(game<=5){
      Random rand = new Random();
      computerchoice=rand.nextInt(3);
      mychoice=sc.nextInt();
      switch (mychoice) {
        case 1:
        System.out.println("you choise is rock");
        break;
        case 2:
        System.out.println(" your choice is paper");
        break;
        case 3:
        System.out.println( " your choice is scissior");
        break;
          default:
          System.out.println("invalid");
        break;
      }
      switch (computerchoice) {
        case 0:
        System.out.println(" computer choose rock");
        break;
        case 1:
        System.out.println(" computer choose paper");
        break;
        case 2:
        System.out.println(" computer choose scissor");
        break;
        default:
        System.out.println("invaild");
        break;
      }

      if((computerchoice==mychoice)) {
        System.out.println(" opps tie");
      }

      else if (computerchoice==0 && mychoice==1){
        System.out.println("i am win");
        iwon++;
      }

      else if ((computerchoice==0&&computerchoice==2)){
        System.out.println("computer is win");
        cwon++;
      }

      else if(computerchoice==1&&computerchoice==0){
        System.out.println (" computer  win ");
        cwon++;
      }
  
      else if(computerchoice==1&&mychoice==2) {
        System.out.println("i am win");
        iwon++;
      }

      else if (computerchoice==2&&mychoice==0) {
        System.out.println(" i am win");
        iwon++;
      }

      else if (computerchoice==2&&mychoice==1){
          System.out.println("computer is win");
        cwon++;
      }

      if(game==5)
      break;
      game++;
    }  
    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    System.out.println("------------------------------------------------------------");
    System.out.println(" Computer :- " +cwon);
    System.out.println(" You      :- " +iwon);
    System.out.println("------------------------------------------------------------");
    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    if (iwon>cwon){
      System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

      System.out.println(" you won the game and computer loss ");
      System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

    }

    else if (cwon==iwon) { 
      System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-..");

      System.out.println("game tie ");
      System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

    }

    else{
      System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

      System.out.println("you loss the and computer won the game ");
      System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.--.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");

    }
  }
}