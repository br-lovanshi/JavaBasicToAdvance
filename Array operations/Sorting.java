public class Sorting {
	int temp;
	public void bubblesort(int arr[],int size){
		System.out.println("\n------BUBBLE SORT------");
		for(int i=1;i<=size-1;i++)
		{  	
			for(int j=0;j<size-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("\nElements After Pass "+i+"\t");
			for(int k=0;k<=size-1-1;k++)
			{
				System.out.print(arr[k]+"\n");
			}
			System.out.println("\n```````````````````````````````````````````````\n\t");
		}

	}
	public void selectionsort(int arr[],int size){
		System.out.println("\n------SELECTION SORT------");
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{	
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("\nElements After Pass %d :"+(i+1)+"\n\t");
			for(int k=0;k<=size-1;k++)
			{
				System.out.print(arr[k]+"\n");
			}
			System.out.println("\n-------------------------------------------");
		}
	}
	public void insertionsort(int arr[],int size){
		System.out.println("\n------INSERTION SORT------");
		for(int i=1;i<size;i++)
		{
			temp=arr[i];
			int j=i-1;
			while((temp<arr[j])&&(j>=0))
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
			System.out.println("\nElements After Pass %d :"+i+"\t");
			for(int k=0;k<=size-1;k++)
			{
				System.out.print(arr[k]+"\n");
			}
			System.out.println("\n````````````````````````````````````````````");
		}
	}

}
