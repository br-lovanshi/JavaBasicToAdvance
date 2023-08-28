public class Searching
{
	public int linearsearch(int arr[],int size,int elm){ 
		for (int i = 0; i < size; i++) 
		{
			if (arr[i] == elm) 	
			{
				return i;
			}	
		}
		return 0;	
	}
	public int binarysearch(int arr[],int size,int elm) {
		int first = 0;
		int last = size - 1;
		while (first <= last) 
		{
			int middle = (first+last)/2;
			if (arr[middle] == elm) 
			{
				System.out.println("\n"+elm+" Element Found at "+(middle+1)+" Location");
				return middle;
			}
			else if (arr[middle] < elm)
			{
				last = middle - 1;
			}
			else if(arr[middle] > elm)
			{
				first = middle + 1;
			}
		}
		return 0;
	}
}
