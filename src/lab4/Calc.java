package lab4;

public class Calc {
	
	public void sum(int[] nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		System.out.println(String.format("Sum of numbers: %d", sum));
	}

	public void average(int[] nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		int avg = sum / nums.length;
		System.out.println(String.format("Average: %d", avg));
	}
	
	public void min(int[] nums) {
		int min = nums[0];
		for (int i : nums) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println(String.format("Minimum Number: %d", min));
	}
	
	public void max(int[] nums) {
		int max = nums[0];
		for (int i : nums) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(String.format("Maximum Number: %d", max));
	}
	
	public void index(int[] nums) {
		int i = 0;
		boolean found = false;
		while (!found) {
			if (nums[i] == 0) {
				break;
			}
			else {
				i++;
			}
		}
		System.out.println(String.format("0 found at index: %s", i));
	}
}
