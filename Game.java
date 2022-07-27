
public class Game {
	private static final int Startposition =0;
	private static final int No_Play=0;
	private static final int Ladder=1;
	private static final int snake=2;
	private static final int Winning_position=100;
	public static void main(String[] args) {
		System.out.println("Welcome to the snake and ladder game...");
		System.out.println("Starting position: "+Startposition);
		int End_position=0;
		int total_Throws=0;
		while(End_position!=Winning_position)
		{
			int die=(int)(Math.floor(Math.random()*10)%6)+1;
			System.out.println("you got:"+die);
			total_Throws++;
			int play=(int)Math.floor(Math.random()*10)%3;
			System.out.println("Your play is:"+play);
			switch(play)
			{
				case Ladder:
					End_position+=die;
					if(End_position>100)
						End_position-=die;
					break;
				case snake:
					End_position-=die;
					if(End_position<0)
						End_position=0;
					break;
				default:
					End_position+=0;
			}
			System.out.println("Your position is : "+End_position);
		}
		System.out.println("You throws the dice "+total_Throws+" times");
	}
}
