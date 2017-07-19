package sortingalgorithms;

public class DescendingOrderSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{ 3, 6, 9, 40, 2,0, 1, 7 };
		int temp =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+ " ");
			
		}


	}

}
