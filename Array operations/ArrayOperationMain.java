import java.util.Scanner;
public class ArrayOperationMain {		
	public static void main(String[] args){
		int ch;
		int size=0;
		int arr[]=null;
		Scanner sc=new Scanner(System.in);
		ArrayOperation ao=new ArrayOperation();
		do{
			System.out.println("--------------------|| MENU ||-----------------------");
			System.out.println("\t1-Create Array\n\t2-Insert Elements\n\t3-Display Elements\n\t4-Insert New Value\n\t5-Delete Elemets\n\t6-Search Elements\n\t7-Sort Elements");
			System.out.println("-----------------------------------------------------");
			System.out.println("\nEnter Your Choice :");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				//create the array...
				arr=ao.create();
				System.out.println("\nArray Created....");
				break;
			case 2:
				//insert elements...
				System.out.println("\nHow Many Elements Do You Want In Array max size is "+arr.length);
				size=sc.nextInt();
				ao.inputData(arr,size);
				break;
			case 3:
				//display elements...
				System.out.println("\nDisplay Elements From Array :");
				ao.displayData(arr,size);
				break;
			case 4:
				//Insert New element...
				System.out.println("\nEnter New Value & Position for New insertion:");
				size=ao.insertNewElement(arr,size,sc.nextInt(),sc.nextInt());
				break;
			case 5:
				//delete value...
				System.out.println("\nEnter possition to delete element from array");
				size=ao.deleteElement(arr,size,sc.nextInt());
				break;
			case 6:
				//search element..
				do{
				System.out.println("\nEnter no. to search in array :");
				int elm=sc.nextInt();
				ao.searchElement(arr,size,elm);
				System.out.println("\nDo you want to continue with Searching...Press 1 :");
				ch=sc.nextInt();
				}while(ch==1);
				break;
			case 7:
				//sort element..
				do {
				ao.sorting(arr,size);
				System.out.println("\nDo you want to continue with Sorting ...Press 2 :");
				ch=sc.nextInt();
				}while(ch==2);
				break;
			}
			System.out.println("\nDo You Want to Continue to MENU..press 1:");
			ch=sc.nextInt();
		}while(ch==1);
	}
}
