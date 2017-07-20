package sortingalgorithms;

public class QuickSort {

	// This program is for Quick sort it takes the last element as pivot and places all lesser elements to left side
	//and higher elements to right side of pivot
		public static void main(String args[])
			{
				int arr[] = {10, 7, 8, 9, 1, 5};
				int n = arr.length;

				QuickSort.sort(arr, 0, n-1);

				System.out.println("sorted array");
				for(int k=0;k<arr.length;k++) {
					System.out.print(arr[k]+" ");
				}
				
			}
		public static int partition(int arr[], int low, int high)
		{
			int pivot = arr[high]; // Taking Higher element as pivot
			int i = (low); // index of smaller element
			for (int j=low; j<high; j++)
			{
				if (arr[j] <= pivot)
				{
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i++;
					
				}
			}

			//Swaping Pivot with Pindex
			int temp = arr[i];
			arr[i] = arr[high];
			arr[high] = temp;

			return i;
		}
		
		public static void sort(int arr[], int low, int high)
		{
			if (low < high)
			{
			
				int pi = partition(arr, low, high);

				// Recursively sort elements before
				// partition and after partition
				sort(arr, low, pi-1);
				sort(arr, pi+1, high);
			}
		}

		
		
	}
	

