
//MUHAMMED SHAJAHAN AM.EN.U4AIE21144

public class Q4 {
	class Priority{
		int p;
		int v;
		Priority(int p,int v){
			this.p=p;
			this.v=v;
		}
	
		
	}
	
	int size;
	Priority[] arr;
	int front;
	int rear;
	

	Q4(int s) {
		size = s;
		arr = new Priority[size];
		front = -1;
		rear = -1;
	}
	public boolean isEmpty() {
		if(rear<0) {
			return true;
		}else {
			return false;
		}
	}
	void add(int priorty,int value)
    {
    	Priority pr=new Priority(priorty,value);
    
        if (size-1 == rear) {
            System.out.println("\nQueue is full\n");
            return;
        }else if(front==-1){
        	front = 0;
        	rear = 0;
        	
        }
        else {
        	rear++;   
        }
        arr[rear] = pr;
        for(int i = 0;i<rear+1;i++) {
        	for(int j = i+1;j<rear+1;j++) {
        		if(arr[j].p<arr[i].p) {
        			Priority temp = arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        			
        			
        		}
        		
        	}
        	
        }
        

    }
	public void getmin() {
		if(isEmpty()) {
			System.out.println("Empty priority queue!!");
			return;
		}
		System.out.println("min: "+"("+arr[0].p+","+arr[0].v+")");
	}
	public void removemin() {
		if(isEmpty()) {
			System.out.println("Empty priority queue!!");
			return;
		}
		Priority temp = arr[0];
		rear = rear-1;
		for(int i = 0;i<rear+1;i++) {
			arr[i]= arr[i+1];
		}
		System.out.println("Element removed: "+"("+temp.p+","+temp.v+")");
	}
	public void displayQueue()
    {
         
        
        if(front == -1)
        {
            System.out.print("Queue is Empty");
            return;
        }
     
        
        System.out.print("Elements in the queue are: ");
     
         
          
            for(int i = front; i <= rear; i++)
            {
                System.out.print("("+arr[i].p+","+arr[i].v+")");
                System.out.print(" ");
            }
            System.out.println();
  
     
        
    }

	public static void main(String[]args) {
		Q4 pp = new Q4(7);
		System.out.println(pp.isEmpty());
		pp.add(2,12);
		pp.add(4, 45);
		pp.add(1, 24);
		pp.add(7,10);
		pp.add(1, 11);
		pp.displayQueue();
		pp.getmin();
		pp.removemin();
		pp.displayQueue();
		pp.removemin();
		pp.displayQueue();
		pp.removemin();
		pp.displayQueue();
		pp.removemin();
		pp.displayQueue();
		pp.removemin();
		pp.displayQueue();
		System.out.println("Is Empty: "+pp.isEmpty());
		pp.removemin();
		
	}

}
