public class Q3  
{  
   
  private int maxn;  
  private int[] qarray;  
  private int front;  
  private int back;  
  private int currentSize;  
    
  public Q3(int n)  
  {  
    this.maxn = n;  
    this.qarray = new int[n];  
    front = 0;  
    back = -1;  
    currentSize = 0;  
  }  
  
  public void insert(int element)  
  {  
     
    if(isQueueFull())  
    {  
      System.out.println("Queue is full!");  
      return;  
    }  
    if(back == maxn - 1)  
{  
      back = -1;  
    }  
    
    qarray[++back] = element;  
    currentSize++;  
    System.out.println("Item added to queue: " + element);  
  }  
     
  public int delete()  
  {  
     
    if(isQueueEmpty())  
    {  
      throw new RuntimeException("Queue is empty");  
    }  
  
    int temp = qarray[front++];  
    if(front == maxn)  
    {  
      front = 0;  
    }  
    currentSize--;  
    return temp;  
  }  
      
  public int peek()  
  {  
    return qarray[front];  
  }  
   
  public boolean isQueueFull()  
  {  
    return (maxn == currentSize);  
  }      
   
  public boolean isQueueEmpty()  
{  
    return (currentSize == 0);  
  }  

  public static void main(String[] args)   
  {  
    Q3 queue = new Q3(10);  
    queue.insert(7);  
    queue.insert(8);  
    System.out.println("Item deleted from queue: " + queue.delete());  
    System.out.println("Item deleted from queue: " + queue.delete());  
    queue.insert(9);      
    System.out.println("Item deleted from queue: " + queue.delete());      
  }  
}