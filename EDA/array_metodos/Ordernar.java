import java.util.Arrays;

public class Ordernar{
	public static void main(String [] args){
		int[] nums = {5,3,2,4,1,72,7,6,10};

		Arrays.sort(nums,0,9);

		for (int num: nums){
			System.out.print(num + " ");
		}
	}

}
