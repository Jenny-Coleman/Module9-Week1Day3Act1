import java.util.Arrays;
import java.util.Scanner;

public class removeDoubles {
	
	public static int removeDuplicates(int[] nums, int len) {
		if (len == 0 || len == 1) {
			return len;			
		}
		
		int[] arr = new int[len];
		int j = 0;
		
		for (int i = 0; i < len-1; i++) {
			if (nums[i] != nums[i+1]) {
				arr[j++] = nums[i];
			}
		}
		arr[j++] = nums[len-1];
		
		for (int k = 0; k < j; k++) {
			nums[k] = arr[k];
		}
		
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers are there?");
		int len = sc.nextInt();
		
		int[] nums = new int[len];
		System.out.println("Enter "+len+" numbers:");
		for (int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		int newLen = removeDuplicates(nums, len);
		
		for (int j = 0; j < newLen; j++) {
			System.out.print(nums[j]+" ");
		}
		
	}

}
