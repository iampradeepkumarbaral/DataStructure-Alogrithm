import java.util.Scanner;

class SearchLinkedList{

	Node head;

	static class Node{
			Node next;
			int data;

		Node(int data){
			this.data = data;
			this.next = null;
		}
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of an Array: ");
		int data = sc.nextInt();


		System.out.println("Size of an array : " + data);
		int i=0;
		SearchLinkedList searchLinedList = new SearchLinkedList(); 
		System.out.println("Insert Element : ");

		while(i<data){
			int datainsert = sc.nextInt();
			searchLinedList.pushInList(datainsert);
			i++;

		}
		System.out.println("Please Insert data that you want to search: ");
		
		int datasearch = sc.nextInt();
		boolean getData =  searchLinedList.searchItem(searchLinedList.head,datasearch);

		if(getData){
			System.out.println("Value is Avalilabe in an Array : "+getData);
		}else{
			System.out.println("Not Able to find the Value : "+getData);
		}

	
		
	}

	public void pushInList(int data){
		Node new_node = new Node(data);

		new_node.next = head;

		//System.out.println(new_node.next + " H2 " +head);

		head = new_node;

		//System.out.println(new_node.next+ " H3 " +head.data+ " "+head.next);

	}

	public boolean searchItem(Node head,int data){
			Node current_node = head;

			while(current_node != null){
				if(current_node.data == data){
					return true;
				}
				current_node = current_node.next;
			}
			return false;

	}
}