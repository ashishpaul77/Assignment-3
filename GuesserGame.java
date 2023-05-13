
//1) Enhance the Guesser Game Project which you have learnt in live class. Add the maximum feature you could add to it.


//Enhacements
//1. give the range to guesser to guess number from the range.
//2. writing seperate methods for players. 


//->Object in game
//1.Guesse 
//->has part - guessNum
//->do  part - guessNum()

//->guesser guess the number gives to Umpire.

//2. Players
//->guess the number and give to umpire.


//3. Umpire
//->umpire collect numbers from players and guesser.
//->Umpire stores the number.


// Code

import java.util.Scanner;

class Guesser{
	
    static int Num;
	int guessNum;
	
	int  guessNum() {
		   Scanner scan=new Scanner(System.in);
		   System.out.print("guesser guess the number:"+"");
		   Num=scan.nextInt();
		   if(Num>0 && Num<10) {
			  guessNum=Num;
		   }
		  
		   return guessNum;	   
		   
	 }
}

class Player extends Guesser{
	int guessNum;
	
	int guessNum1(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Player 1 guess the number:"+" ");
		guessNum=scan.nextInt();
		return guessNum;	
	}
	int guessNum2(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Player 2 guess the number:" + " ");
		guessNum=scan.nextInt(); 
		return guessNum;
	}
	int guessNum3(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Player 3 guess the number:"+" ");
		guessNum=scan.nextInt();
		return guessNum;	
	}	
}

class Umpire extends Guesser{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		Guesser g=new Guesser();
	    numFromGuesser=g.guessNum();
	}
	
    void collectNumFromPlayer() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
	
		numFromPlayer1=p1.guessNum1();
		numFromPlayer2=p2.guessNum2();
		numFromPlayer3=p3.guessNum3();
		
	}
    
//  Umpire will compare and annoucnce the final result
    void Compare() {
    	
    	if(numFromGuesser== numFromPlayer1) {
    		if(numFromGuesser== numFromPlayer2 && numFromGuesser== numFromPlayer3) {
    			System.out.println("All players won the game");
    		}
    		else if(numFromGuesser== numFromPlayer2)
    		{
    			System.out.println("Player 1 & 2 won the game");
    		}
    		else if(numFromGuesser== numFromPlayer3)
    		{
    			System.out.println("Player 1 and 3 won the game");
    		}
    		else {
    		System.out.println("Player 1 won the game");
    		}
    	}
    	else if(numFromGuesser==numFromPlayer2){
    	    if(numFromGuesser== numFromPlayer3)
    		{
    			System.out.println("Player 2 and 3 won the game");
    		}
    	    else 
    	    {
    	    System.out.println("Player 2 won the game");
    	    }
        }
    	else if(numFromGuesser==numFromPlayer3)
    	{
    		System.out.println("Player 3 won the game");
    	}
    	else {
    		System.out.println("Game lost try again");
    	}
    }
  }
    
    
public class GuesserGame extends Guesser {

	public static void main(String[] args) {
		Umpire u =new Umpire();
	
		u.collectNumFromGuesser();
		
		if(Num>0 && Num<10) {
		u.collectNumFromPlayer();
		u.Compare();
		}
		else {
			System.out.println("Invalid seletion by Guesser");
		}
	}
}

//Outputs:

//=>output-1 : when invidual guesser selects number from out of range

//guesser guess the number:10
//Invalid seletion by Guesser

//=>output-2 : when player guess correct number

//guesser guess the number:2
//Player 1 guess the number: 2
//Player 2 guess the number: 3
//Player 3 guess the number: 8
//Player 1 won the game

//=>output-3 : when multiple player guess same number

//guesser guess the number:5
//Player 1 guess the number: 5
//Player 2 guess the number: 5
//Player 3 guess the number: 4
//Player 1 & 2 won the game

//=>output-4: when all players guess correct answer

//guesser guess the number:4
//Player 1 guess the number: 4
//Player 2 guess the number: 4
//Player 3 guess the number: 4
//All players won the game

//=>output-5 : whem all players guess incorrect answer

//guesser guess the number:5
//Player 1 guess the number: 3
//Player 2 guess the number: 7
//Player 3 guess the number: 8
//Game lost try again







