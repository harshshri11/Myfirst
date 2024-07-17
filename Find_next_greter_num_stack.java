import java.util.*;
class StackArray{
int a[];
int top;
int size;

public StackArray(int size){
a = new int[size];
top = -1;
}

public boolean isEmpty(){
if(top==-1)
{
System.out.println("\nStack is Empty");
return true;
}
return false;
}

public boolean isFull(){
if(top==size-1)
{
System.out.println("\nStack is full!!");
return true;
}
return false;
}


public int pop(){
if(!isEmpty())
{
int x=a[top];
top = top-1;
System.out.println("\nPoped element is:"+x);
return x;
}
return 0;
}

public void Sort(int x)
{
if(top > x)
{
int g = pop();
push(g);
}
push(x);
}


public int push(int x){
if(!isFull())
{
top = top+1;
a[top] = x;
}
return 0;
}

void display()
{
int i=0;
System.out.println("\nElement in the stack is: ");
while(i<=top)
{
System.out.println(+a[i]);
i++;
}
}

}

class Find_next_greter_num_stack{
public static void main(String args[]){
int op;
StackArray SA = new StackArray(2);

do{
System.out.println("\n\n1)Push\n2)Pop\n3)Display\n4)Quit");
System.out.println("\nEnter your choice:");
Scanner sc = new Scanner(System.in);
op = sc.nextInt();
switch(op)
{
case 1: System.out.println("\nEnter number to be push:");
int a = sc.nextInt();
SA.push(a);
SA.Sort(a);
break;
case 2: SA.pop();
break;
case 3:
SA.display();
break;
}
} while(op!=4);

}
}





