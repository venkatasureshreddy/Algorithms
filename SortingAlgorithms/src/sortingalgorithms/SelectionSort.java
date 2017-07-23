/**
 * Selection Sort
 */

package sortingalgorithms;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 8, 4, 3, 9, 6, 2, 3, 1 };
		SelectionSort obj = new SelectionSort();

		for (int i = 0; i < nums.length-1; i++) {
			int min = i;
			for (int j = i+1; j < nums.length; j++) {

				if (nums[j] < nums[min]) {

					min = j;
				}

				int temp = nums[i];
				nums[i] = nums[min];
				nums[min] = temp;

			}
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.print("\t"+nums[i]);
		}

	}

}
