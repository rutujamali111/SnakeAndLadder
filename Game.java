
public class Game {
	private static final int Startposition =0;
	private static final int No_Play=0;
	private static final int Ladder=1;
	private static final int snake=2;
	private static final int Winning_position=100;
	
	public static void main(String[] args) {
		 boolean Player1=true;
		System.out.println("Welcome to the snake and ladder game...");
		System.out.println("Starting position of player1 and player2 is : "+Startposition);
		
		int End_position1=0;
		int End_position2=0;
		int total_Throws=0;
		while(End_position1!=Winning_position && End_position2!=Winning_position)
		{
			int die=(int)(Math.floor(Math.random()*10)%6)+1;
			int play=(int)Math.floor(Math.random()*10)%3;
		
			if(Player1)
			{
			
				System.out.println("Player1:"+die);
				total_Throws++;
				
				System.out.println(" play of player1 is:"+play);
				switch(play)
				{
					case Ladder:
						End_position1+=die;
						if(End_position1>100)
							End_position1-=die;
						break;
					case snake:
						End_position1-=die;
						if(End_position1<0)
							End_position1=0;
						break;
					default:
						End_position1+=0;
				}
				System.out.println("Player1 position is : "+End_position1);
				if(play==Ladder)
					Player1=true;
				else
					Player1=false;
			}
			else
			{
				System.out.println("Player2:"+die);
				total_Throws++;
				
				System.out.println(" play of player2 is:"+play);
				switch(play)
				{
					case Ladder:
						End_position2+=die;
						if(End_position2>100)
							End_position2-=die;
						break;
					case snake:
						End_position2-=die;
						if(End_position2<0)
							End_position2=0;
						break;
					default:
						End_position2+=0;
				}
				System.out.println("Player2 position is : "+End_position2);
				if(play==Ladder)
					Player1=false;
				else
					Player1=true;
				
			}
		}
		if(End_position1==Winning_position)
			System.out.println("Player1 is winner...");
		else
			System.out.println("Player2 is winner...");
		System.out.println("You throws the dice "+total_Throws+" times");
	}
}
