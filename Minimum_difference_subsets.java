package backtracking;

 class Node{
	String data;
	Node next;
	
	Node(String value){
		this.data=value;
		this.next=null;
	}
}



 class LinkedList{
	public Node head=null;
	int size=0;
	LinkedList(){
		this.size=0;
	}
	public void add(String value) {
		++size;
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
		}else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void remove() {
		--size;
		if(head==null) {
			System.out.println("Empty List");
		}else {
			head=head.next;
		}
	}
	
	public int size() {
		return this.size;
	}
	
	public void show() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
}

public class backtrackingTest {


	
	public static int sum(LinkedList temp) {
		int sum=0;
		Node current = temp.head;
		while(current!=null) {
			sum+=Integer.parseInt(current.data);
			current=current.next;
		}
		return sum;
	}
	
	public static Node x;
	public static  Node y;
	public static int min=Integer.MAX_VALUE;

	/////////////////////////////////////
	public static void show(Node temp) {
		Node current = temp;
		while(current!=null) {
			System.out.print(current.data+"-");
			
			current=current.next;
		}
	}

	public static void combi(String str,LinkedList a,LinkedList b,int index) {
		if(index==str.length())
		{
			int m=Math.abs(sum(a)-sum(b));
			if(m<min) {
				min=m;
				x=a.head;
				y=b.head;
			}
			
			return;

		}
		show(a.head);

		
		if(a.size()!=index) {
			a.add(String.valueOf(str.charAt(index)));
			combi(str,a,b,index+1);
			a.remove();
		}
		
		b.add(String.valueOf(str.charAt(index)));
		combi(str,a,b,index+1);
		b.remove();
		
	}
	
	
	public static void main(String[] args) {
	LinkedList a=new LinkedList();
	LinkedList b=new LinkedList();

		String str="1234";
		combi(str,a,b,0);
		
		show(x);
		System.out.println("");
		show(y);
	}
}

