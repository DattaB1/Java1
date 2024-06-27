package LinkedList;

import java.util.LinkedList;

public class LinkedList1 
{
	public static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	 }
	public static Node head;
	public static Node tail;
	
	
	//adding a method in first way
	public void addFirst(int data)
	{
		//step 1=craete new node
		Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
			
		//step 2=newNode next=head
		newNode.next=head;  //linking stpe
		
		//step 3
		head=newNode;
	}
	
	
	//adding a elemnt using lastmethod
	public void addLast(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
	//printing the element
	public void print()
	{
		if(head==null)
		{
			System.out.println("LL is empty");
			return;
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	 }
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		LinkedList.print();
		ll.addFirst(2);
		ll.print();
		ll.addFirst(1);
		ll.print();
		ll.addLast(3);
		ll.print();
		ll.addLast(4);
		ll.print();
		System.out.println(ll);

	}
}
