package com.demo.linkedList;

public class LinkedList {
	
	Node head;
	
	public LinkedList() {
		this.head =null;
	}
	
	public LinkedList insert(LinkedList list , int data) {

		Node newNode = new Node(data);
		if(list.head==null)
			{
				list.head = newNode;
				return list;
			}
		else {
			Node current = list.head;
		while(current.next!=null) {
			current=current.next;
		}
			current.next=newNode;
		}
		
		
		
		return list;
	}
	
	public LinkedList delete(LinkedList list , int key)
	{
		
		LinkedList list1 = new LinkedList();
		
		
		if(list.head.data==key && list.head.next!=null) {
			list.head=list.head.next;
			return list;
		}
		else {
			//Node pre=null;
			//Node current=list.head;
			while(list.head.data!=key)
			{
				//pre=list.head;
				list1=insert(list1, list.head.data);
				list.head=list.head.next;
			}
			while(list.head.next!=null && list.head.next.next!=null) {
			list1=insert(list1, list.head.next.data);
			list.head = list.head.next.next;
			}
		}
		return list1;
	}
	
	public void display(LinkedList list)
	{
		Node current = list.head;
		while(current.next!=null) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);
		
		
	}

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list = list.insert(list, 1);
		list = list.insert(list, 2);
		list = list.insert(list, 3);
		list = list.insert(list, 4);
		list.display(list);
		list=list.delete(list, 2);
		System.out.println("After del");
		list.display(list);
	}

}
