import java.io.*;
import java.util.*;
import java.util.stream.*;
public class ArrayOperation {
	Scanner sc=new Scanner(System.in);
	int flag=0,s,temp;
	public int[] create() 
	{
		System.out.println("How many nos do u want in array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		return arr;
	}
	public void inputData(int arr[],int size)
	{
		System.out.println("Enter "+size+" elements in this array :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	public void displayData(int arr[],int size)
	{
		//System.out.println("Elements in array are :");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public int insertNewElement(int arr[],int size,int newelm,int pos)
	{           //i=4    1>=2 3--
		for(int i=size-1;i>=pos-1;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[pos-1]=newelm;//2
		size++;
		return size;
	}
	public int deleteElement(int arr[],int size,int pos)
	{
		int n=arr[pos-1];
		for(int i=pos-1;i<size;i++)
		{
			arr[i]=arr[i+1];			
		}
		System.out.println("ELement deleted "+n);
		size--;//5
		return size;
	}
	public int searchElement(int arr[],int size,int elm) {
		System.out.println("-----------------------------------------------------\n");
		System.out.println("\t1-Linear Search\n\t2-Binary Search\n");
		System.out.println("-----------------------------------------------------");
		System.out.println("\nEnter Your Choice :");
		int ch=sc.nextInt();
		int pos=-1;
		Searching s=new Searching();
		if(ch==1)
		{
			pos=s.linearsearch(arr, size, elm);
			if(pos!=0)
			{
				System.out.println("\n"+elm+" Element Found at "+(pos+1)+" Location");
			}
			else
			{
				System.out.println("\n"+elm+" Element Not found...");
			}
		}
		if(ch==2)
		{
			pos=s.binarysearch(arr,size,elm);
			if(pos != 0)
			{
				//System.out.println("\n"+elm+" Element Found at "+(pos+1)+" Location");								
			}
			else
			{
				System.out.println("\n"+elm+" Element Not found...");
			}
			
		}
		return pos;
	}
	public void sorting(int arr[],int size)
	{
		Sorting d=new Sorting();
		System.out.println("-----------------------------------------------------\n");
		System.out.println("\t1-Bubble Sort\n\t2-Selection Sort\n\t3-Insertion Sort\n");
		System.out.println("-----------------------------------------------------");
		System.out.println("\nWhich sort u want ? -");
		int ch=sc.nextInt();
		if(ch==1)
		{
			d.bubblesort(arr, size);
		}
		if(ch==2)
		{
			d.selectionsort(arr, size);
		}
		if(ch==3)
		{
			d.insertionsort(arr, size);
		}
	}
}
