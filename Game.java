
public class Game {
		private static final int Startposition =0;
		private static final int No_Play=0;
		private static final int Ladder=1;
		private static final int snake=2;
		public static void main(String[] args) {
			System.out.println("Welcome to the snake and ladder game...");
			System.out.println("Starting position: "+Startposition);
			int End_position=0;
			int die=(int)(Math.floor(Math.random()*10)%6)+1;
			System.out.println("you got:"+die);
			int play=(int)Math.floor(Math.random()*10)%3;
			System.out.println("Your play is:"+play);
			switch(play)
			{
				case Ladder:
					End_position+=die;
					break;
				case snake:
					End_position-=die;
					break;
				default:
					End_position+=0;
			}
			System.out.println("Your position is : "+End_position);
				
}

}
