public class SnakeAndLadder
{
	public static int dieRoll()
	{
		int roll= (int) (Math.floor(Math.random()*11)%6)+1;
		return roll;
	}
	public static void main(String[] args)
	{
		int position=0;
		int roll=dieRoll();
		position+=roll;
		int option = (int) (Math.floor(Math.random()*3)%3);
		switch(option)
		{
			case 0:
			System.out.println("You are at " + position + " and there is no snake or ladder");
			break;
			case 1:
			position+=roll;
			System.out.println("You landed on a ladder and you move forward " + roll + " spaces and now you are at " + position);
			break;
			case 2:
			position-=roll;
			System.out.println("You landed on a snake and you move backward " + roll + " spaces and now you are at " + position);
		}
	}
}
