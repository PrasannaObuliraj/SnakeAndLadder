public class SnakeAndLadder
{
	public static int dieRoll()
	{
		int roll= (int) (Math.floor(Math.random()*11)%6)+1;
		return roll;
	}
	public static int forwardMove(int position,int roll)
	{
		if(position+roll>100)
		{
			System.out.println("You cant move past 100. Make another move");
			return position;
		}
		else
		{
			position+=roll;
			return position;
		}
	}
	public static void main(String[] args)
	{
		int position=0;
		while(position<100)
		{
			int roll=dieRoll();
			position=forwardMove(position,roll);
			int option = (int) (Math.floor(Math.random()*3)%3);
			switch(option)
			{
				case 0:
				if(position<100)
					System.out.println("You are at " + position + " and there is no snake or ladder");
				break;
				case 1:
				position=forwardMove(position,roll);
				if(position<100)
					System.out.println("You landed on a ladder and you move forward " + roll + " spaces and now you are at " + position);
				break;
				case 2:
				if(position<100)
				{
					position-=roll;
					System.out.println("You landed on a snake and you move backward " + roll + " spaces and now you are at " + position);
				}
			}
		}
		System.out.println("You have reached 100, you have won");
	}
}
