// MUHAMMED SHAJAHAN AM.EN.U4AIE21144
class Q2
{
   
    int  queue[];
    int  front;
    int  rear;
    int  size;
     
    public Q2(int size)
    {
        
        front = -1;
        rear = 0;
        this.size = size;
        queue = new int[size];
    }
  
   
    boolean isFull()
    {
        return ((front == 0 && rear == size-1)||
            front == rear+1);
    }
  
   
    boolean isEmpty ()
    {
        return (front == -1);
    }
  
    void enqueuefront(int key)
    {
        
        if (isFull())
        {
            System.out.println("Overflow");
            return;
        }
  
        
        if (front == -1)
        {
            front = 0;
            rear = 0;
        }
         
        
        else if (front == 0)
            front = size - 1 ;
  
        else 
            front = front-1;
  
        
        queue[front] = key ;
    }
  
    
    void enqueuerear(int key)
    {
        if (isFull())
        {
            System.out.println(" Overflow ");
            return;
        }
  
        
        if (front == -1)
        {
            front = 0;
            rear = 0;
        }
  
        
        else if (rear == size-1)
            rear = 0;
  
        
        else
            rear = rear+1;
         
        
        queue[rear] = key ;
    }
  
    
    void dequeuefront()
    {
        
        if (isEmpty())
        {
            System.out.println("Queue Underflow\n");
            return ;
        }
  
        
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
            
            if (front == size -1)
                front = 0;
  
            else 
                
                front = front+1;
    }
  
    
    void dequeuerear()
    {
        if (isEmpty())
        {
            System.out.println(" Underflow");
            return ;
        }
  
        
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if (rear == 0)
            rear = size-1;
        else
            rear = rear-1;
    }
  
    
    int getFront()
    {
        
        if (isEmpty())
        {
            System.out.println(" Underflow");
            return -1 ;
        }
        return queue[front];
    }
  
    
    int getRear()
    {
        
        if(isEmpty() || rear < 0)
        {
            System.out.println(" Underflow\n");
            return -1 ;
        }
        return queue[rear];
    }
    public void displayQueue()
    {
         
        
        if(front == -1)
        {
            System.out.print("Queue is Empty");
            return;
        }
     
      
        System.out.print("Elements in the circular queue are: ");
     
         
            
            for(int i = front; i <= rear; i++)
            {
                System.out.print(queue[i]);
                System.out.print(" ");
            }
            System.out.println();
  
     
        
    }
     
  
    
    public static void main(String[] args)
    {
         
         Q2 q = new Q2(5);
          


         q.enqueuerear(1);
         q.enqueuerear(2);
         q.enqueuerear(3);
         q.enqueuerear(4);
         q.enqueuerear(5);
         
         q.displayQueue();
          
         System.out.println("get rear element : "+ q.getRear());
          
         q.dequeuerear();
         
          
         System.out.println("inserting element at front end");
         q.enqueuefront(6);
         q.displayQueue();
          
         System.out.println("get front element: " +q.getFront());
          
         q.dequeuefront();
         q.displayQueue();
          
         
         
    }
}