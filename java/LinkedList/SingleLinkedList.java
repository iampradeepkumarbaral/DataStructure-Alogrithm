class SingleLinkedList{
	Node head;

	static class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			next = null;
		}
	}



	public static void main(String[] args) {
		
		SingleLinkedList singleLinkedList = new SingleLinkedList();

		singleLinkedList.head  = new Node(0);

		Node one_1 = new Node(1);

		Node two_2 = new Node(2);

		Node three_3 = new Node(3);

		Node four_4 = new Node(4);

		Node five_5 = new Node(5);

		Node six_6 = new Node(6);

		Node seven_7 = new Node(7);

/*SingleLinkedList.head     one_1           two_2          three_3         four_4      five_5       six_6      		  seven_7
             |                |               | 				|				|			|			|				 |
             |                |               | 				|				|			|			|				 |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+
         | 0  | null |     | 1  | null |   |  2 | null |  | 3  | null |  | 4  | null | | 5  | null | | 6  | null |  | 7  | null |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+   */

         singleLinkedList.head.next = one_1;

 /*SingleLinkedList.head     one_1           two_2          three_3         four_4      five_5       six_6      		seven_7
             |                |               | 				|				|			|			|				 |
             |                |               | 				|				|			|			|				 |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+
         | 0  |    0------>| 1  | null |   |  2 | null |  | 3  | null |  | 4  | null | | 5  | null | | 6  | null |  | 7  | null |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+   */

         one_1.next = two_2;

   /*SingleLinkedList.head   one_1           two_2          three_3         four_4      five_5       six_6      		seven_7
             |                |               | 				|				|			|			|				 |
             |                |               | 				|				|			|			|				 |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+
         | 0  |    0------>|  1 | 0------->|  2 | null |  | 3  | null |  | 4  | null | | 5  | null | | 6  | null |  | 7  | null |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+   */

         two_2.next = three_3;

   /*SingleLinkedList.head   one_1           two_2           three_3         four_4      five_5       six_6      	 seven_7
             |                |               | 				|				|			|			|				 |
             |                |               | 				|				|			|			|				 |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+
         | 0  |    0------>| 1  | 0------->|  2  | 0----->| 3  | null |  | 4  | null | | 5  | null | | 6  | null |  | 7  | null |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+   */

         three_3.next = four_4;

  /*SingleLinkedList.head    one_1        	two_2          	three_3          four_4       five_5       six_6      		seven_7
             |                |               | 				|				|			|			|				 |
             |                |               | 				|				|			|			|				 |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+
         | 0  |    0------>| 1  | 0------->|  2  | 0----->| 3   | 0----->| 4  | null | | 5  | null | | 6  | null |  | 7  | null |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+   */

         four_4.next = five_5;

  /*SingleLinkedList.head    one_1           two_2          three_3         four_4      five_5       six_6      		seven_7
             |                |               | 				|				|			|			|				 |
             |                |               | 				|				|			|			|				 |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+
         | 0  |    0------>| 1  | 0------->|  2 |  0----->| 3  |  0----->| 4  | 0----->| 5  | null | | 6  | null |  | 7  | null |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+   */

         five_5.next = six_6;

   /*SingleLinkedList.head   one_1           two_2          three_3         four_4      five_5       six_6      		  seven_7
             |                |               | 				|				|			|			|				 |
             |                |               | 				|				|			|			|				 |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+
         | 0  |    0------>| 1  | 0------->|  2 |  0----->| 3   | 0----->| 4  | 0----->| 5  | 0----->| 6  | null |  | 7  | null |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+   */

         six_6.next = seven_7;

   /*SingleLinkedList.head   one_1           two_2          three_3         four_4      five_5       six_6      	 seven_7
             |                |               | 				|				|			|			|				 |
             |                |               | 				|				|			|			|				 |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+
         | 0  |    0------>| 1  | 0------->|  2 |  0----->| 3   | 0----->| 4  | 0----->| 5  | 0----->| 6  | 0-----> | 7  | null |
         +----+------+     +----+------+   +----+------+  +----+------+  +----+------+ +----+------+ +----+------+  +----+------+   */

         singleLinkedList.printList();

	}

	 /* This function prints contents of linked list starting from head */
    public void printList() { 
        Node n = head; 
         System.out.println(n.data + "Node "); 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
    } 
}