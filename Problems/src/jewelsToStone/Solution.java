package jewelsToStone;

public class Solution {
	public int numJewelsInStones(String J, String S) {
		int i = 0;
		for (char jewel : J.toCharArray()) 
		{
			for(char stone :S.toCharArray())
					{
						if(jewel == stone)
						{
							i++;
						}
					}
		}
		return i;
	}
}
