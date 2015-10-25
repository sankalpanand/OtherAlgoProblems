public class FirstAndLastNodeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node headOdd = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		
		headOdd.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		
		Operate(headOdd);
	}
	
	public static void Operate(Node head)
	{
		int count = CountNodes(head);
		int mid = count / 2;
		
		int m = count %2 == 0 ? mid + 1 : mid + 2;
		int n = count;
		
		Print(head);
		
		
		
		// Step 1 : Reverse the LL in second half
		Node pre = reverseBetween(head, m, n);
		System.out.println();
		// System.out.println(pre.val);
		Print(head);
		
		// Step 2: Begin Operation
		Node tempHead = head;
		Node tempMid = pre;
		
		while(tempHead != null && tempMid != null)
		{
			tempHead.val = tempMid.val - tempHead.val;
			tempHead = tempHead.next;
			tempMid = tempMid.next;
		}
		
		System.out.println();
		Print(head);
		
		// Step 3: Reverse Again
		reverseBetween(head, m, n);		
		System.out.println();
		Print(head);
		
	}
	
	public static int CountNodes(Node head)
	{
		if(head == null) return 0;
		return 1 + CountNodes(head.next);
	}
	
	public static void Print(Node head)
	{
		if(head == null) return;
		System.out.print(head.val + "->");
		Print(head.next);
	}
	
	public static Node reverseBetween(Node head, int m, int n) {
        if(head == null) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        
        Node pre = dummy;
        
        for(int i=0; i<m-1; i++)
        {
            pre = pre.next;
        }
        
        Node start = pre.next;
        Node then = start.next;
        
        for(int i=0; i<n-m; i++)
        {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        
        return pre.next;
        
    }
	
	
	
	

}
