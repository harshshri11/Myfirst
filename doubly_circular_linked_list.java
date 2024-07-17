import java.util.*;
class Node{
public int data;
public Node next;
public Node prev;
Node(int d)
{
this.data = d;
this.next = null;
this.prev = null;
}
}

class linkedList{
Node head;
void insertAtHead(int d)
{
if(head == null)
{
Node newNode = new Node(d);
newNode.next = newNode.prev=newNode;
head = newNode;
return;
}
else{
Node newNode = new Node(d);
newNode.next = head;
newNode.prev = head.prev;
head.prev.next = newNode;
head.prev = newNode;
}
}

void insertAtEnd(int d)
{
if(head == null)
{
Node newNode = new Node(d);
newNode.next = newNode.prev = newNode;
head = newNode;
return;
}
else{
Node temp = head.next;
Node newNode = new Node(d);
newNode.next = temp;
head.next = newNode;
newNode.prev = head;
temp.prev = newNode;
head =  newNode;
}
}

void insertAtPosition(int position, int d)
{
if(position == 1)
{
insertAtHead(d);
return;
}
Node temp = head.next;
int cnt =1;
while(cnt < position-1)
{
temp = temp.next;
cnt++;
}
if(temp==head)
{
insertAtEnd(d);
return;
}
Node nodeToInsert = new Node(d);
nodeToInsert.next = temp;
nodeToInsert.prev = temp.prev;
temp.prev.next = nodeToInsert;
temp.prev = nodeToInsert;
}

void deleteNode(int value)
{
if(head == null)
{
System.out.println("Linked list is empty!!");
return;
}
else{
Node curr = head;
while(curr.data != value)
{
curr = curr.next;
}
curr.prev.next = curr.next;
curr.next.prev = curr.prev;
return;
}
}

void print()
{
Node temp = head;
if(temp == null)
{
System.out.println("Linked list is empty");
}
do{
System.out.println("Element in the linked list is: "+temp.data);
temp = temp.next;
}
while(temp!=head);
}


int length()
{
int len = 1;
Node temp = head.next;
do{
temp = temp.next;
len++;
}
while(temp!=head);
System.out.println("length of the linked list is: "+len);
return len;
}

void info()
{
System.out.println("Head of the linked list is: "+head.data);
System.out.println("Head next element of the linked list is: "+head.next.data);
}

}

class doubly_circular_linked_list{
public static void main(String args[])
{
linkedList L = new linkedList();


int op;
Scanner sc = new Scanner(System.in);
do{
System.out.println("\n1)InsertAtHead\n2)InsertAtEnd\n3)InsertAtPosition\n4)Delete Node\n5)Info\n6)print\n7)length of linked list\n8)Exit\n");
System.out.println("Enter your choice");
op = sc.nextInt();
switch(op)
{
case 1:
System.out.println("Enter element to be add in the linked list");
int a = sc.nextInt();
L.insertAtHead(a);
break;
case 2:
System.out.println("Enter element to be add in the linked list");
int b = sc.nextInt();
L.insertAtEnd(b);
break;
case 3:
System.out.println("Enter position");
int c = sc.nextInt();
System.out.println("Enter element");
int d = sc.nextInt();
L.insertAtPosition(c,d);
break;
case 4:
L.print();
System.out.println("Which element do you want delete from linked list");
int e = sc.nextInt();
L.deleteNode(e);
break;
case 5:
L.info();
break;
case 6:
L.print();
break;
case 7:
L.length();
break;
}
}while(op!=8);

}
}


