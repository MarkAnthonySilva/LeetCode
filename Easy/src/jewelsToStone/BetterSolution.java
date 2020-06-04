package jewelsToStone;
import java.util.Set;
import java.util.HashSet;
// import java.util.*;

public class BetterSolution {
	public int numJewelsInStones(String J, String S) {
		int noOfJewels=0;

		Set<Character> jewels = new HashSet<>();

		for(char c : J.toCharArray()){
			jewels.add(c);
		}    

		for(char d : S.toCharArray()){

			if(jewels.contains(d)){
				noOfJewels++;
			}
		}   

		return  noOfJewels;
	}
}

