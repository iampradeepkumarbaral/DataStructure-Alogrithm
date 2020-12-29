import java.util.Scanner;
class DynamicInsertLinklist{
	     //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
  

		static class Node{
		 	int data;
		 	Node next;

		 	Node(int d){

		 		this.data = d;
		 		this.next = null;
		 	}
		}
	 	public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in); 
	        int data = sc.nextInt(); 


		 	System.out.println("Size Of Data "+data);
		 	DynamicInsertLinklist dynamicInsertLinklist = new DynamicInsertLinklist();
		 
		 	int i =0;
		 	while(i<data){
	        	int dataon = sc.nextInt(); 
				dynamicInsertLinklist.push(dataon);
				i++;
			}

		 	dynamicInsertLinklist.printList();
	 	}

	 	public void append(int data){

	 			Node new_node = new Node(data);


	 			while(head == null){
	 				head =  new Node(data);
	 				return;
	 			}
	 			Node last = head;
	 			while(last.next != null){
	 				last = last.next;
	 			}
	 			last.next=new_node;
	 	}

	 	public void printList(){
	 		Node current = head;


	 		if(head == null){
	 			System.out.println("Empty List");
	 			return;
	 		}

	 		while(current != null){
	 				System.out.print(current.data+" ");
	 				current= current.next;

	 		}
	 	}

	 	public void push(int data){

	 		Node new_node = new Node(data);

	 		while(head == null){
	 			head = new Node(data);
	 			return ;
	 		}

	 		new_node.next = head;

	 		head = new_node;

	 		return;

	 	}

	 
}