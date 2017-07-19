package sortingalgorithms;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{ 3, 6, 9, 40, 2,0, 1, 7 };
		
		for(int i=1;i<arr.length;i++) {
			
			int val= arr[i];
			int hole = i;
			
			while(hole > 0 && arr[hole-1] > val ) {
				arr[hole] = arr[hole-1];
				hole--;
			}
			
			arr[hole] = val;
			
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+ " ");
		}

	}

}
