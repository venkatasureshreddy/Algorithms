package sortingalgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This Program is  for Bubble sort. 
		//For every iteration highest element comes to right in ascending order sorting.
		
		int [] arr = new int[] {9,6,10,25,4,7,12,3,1,2};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
