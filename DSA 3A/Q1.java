//MUHAMMED SHAJAHAN AM.EN.U4AIE21144
class Q1{
 
int size, front, rear;
 
int[]queue;
 
Q1(int size)
{
    this.size = size;
    this.front = this.rear = -1;
    queue = new int[size];
}
 

public void enQueue(int data)
{
     
    if((front == 0 && rear == size - 1) ||
      (rear == (front - 1) % (size - 1)))
    {
        System.out.print("Queue is Full");
    }
 
    else if(front == -1)
    {
        front = 0;
        rear = 0;
        queue[rear] = data;
    }
 
    else if(rear == size - 1 && front != 0)
    {
        rear = 0;
        queue[rear]=data;
    }
 
    else
    {
        rear = (rear + 1);
     
        if(front <= rear)
        {
            queue[rear]=data;
        }
     
        else
        {
            queue[rear]=data;
        }
    }
}
 
public int deQueue()
{
    int temp;
    if(front == -1)
    {
        System.out.print("Queue is Empty");
        return -1;
    }
 
    temp = queue[front];
 
    if(front == rear)
    {
        front = -1;
        rear = -1;
    }
 
    else if(front == size - 1)
    {
        front = 0;
    }
    else
    {
        front = front + 1;
    }
     
    return temp;
}
 

public boolean isEmpty() {
	if(front == -1 && rear == -1) {
	     return true ;
	}else {
		return false;
	}
}
public int length() {
	int l = 0;
	if (front<=rear) {
		l=(rear - front +1);
		
	}else if(front>=rear) {
		l =(size-front+rear);
	}else if(front==-1&&rear==-1){
		l = 0;
	}
	return l ;
}
public int peek() {
	return queue[front];
}
public void displayQueue()
{
     
    if(front == -1)
    {
        System.out.print("Queue is Empty");
        return;
    }
 
    
    System.out.print("Elements in the circular queue are: ");
 
    if(rear >= front)
    {
     
        
        for(int i = front; i <= rear; i++)
        {
            System.out.print(queue[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
 
   
    else
    {
         
       
        for(int i = front; i < size; i++)
        {
            System.out.print(queue[i]);
            System.out.print(" ");
        }
 
        
        for(int i = 0; i <= rear; i++)
        {
            System.out.print(queue[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
 
public static void main(String[] args)
{
     

    Q1 q = new Q1(7);
     
    q.enQueue(10);
    q.enQueue(11);
    q.enQueue(12);
    q.enQueue(23);
    q.enQueue(24);
    q.enQueue(25);
     
    q.displayQueue();
 
    
   
    System.out.println("Deleted value = "+q.deQueue());
    System.out.println("Deleted value = "+q.deQueue());
 
 
    q.displayQueue();
    
    System.out.println("length: "+q.length());
     
    q.enQueue(26);
    q.enQueue(27);
    q.enQueue(28);
    System.out.println("peek: "+q.peek());
     
    q.displayQueue();
     
    q.enQueue(2);
    q.enQueue(15);
    q.displayQueue();
}
}