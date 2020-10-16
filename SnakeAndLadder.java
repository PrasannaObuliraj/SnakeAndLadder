public class SnakeAndLadder
{
	function dieRoll
	{
		int roll= (int) (Math.floor(Math.random()*11)%6)+1;
		return roll;
	}
	public static void main(String[] args)
	{
		int position=0;
		int roll=dieRoll;
	}
}
