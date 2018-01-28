class QuickSortImpl
{
	int leftIndex = 0;
	int pivotIndex;
	int pivot;
	void doQuickSort(int[] inputArr)
	{
		int lastIndex = inputArr.length - 1;
		pivot = inputArr[lastIndex];
		pivotIndex = lastIndex;
		for(int i=0; i< inputArr.length ; i++)
		{
			if(inputArr[i]>inputArr[(inputArr.length-2)-i])
			{
				
			}
		
		}
		
		
		
		
	}

}




public class QuickSortClient {

	public static void main(String[] args) {
		QuickSortImpl qsi = new QuickSortImpl();
		
	}

}
