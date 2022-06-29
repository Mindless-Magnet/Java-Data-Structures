//MUHAMMED SHAJAHAN AM.EN.U4AIE21144

public class Q3 {
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
	

	Q3(int s) {
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

        
        return;
    }

    
    public int getlength() {
		int count = 0;
		for (int i = 0;i<arr.length;i++) {
			if(arr[i] != null) {
				count = count+1;
			}
		}
		
		return count;
		
	}
    public void getmin() {
    	if(isEmpty()) {
			System.out.println("Empty priority queue!!");
			return;
		}
    	int min = arr[0].p;
    	int index=0;
    	for(int i = 0;i<getlength()-1;i++) {
    		int comp = arr[i].p;
    		if(comp<min) {
    			min = comp;
    			index = i;
    			
    		}
    		
    	}
    	System.out.println("("+arr[index].p + ","+arr[index].v+")");
    }
    public int getminindex() {
    	
    	int min = arr[0].p;
    	int index=0;
    	for(int i = 0;i<=rear;i++) {
    		int comp = arr[i].p;
    		if(comp<min) {
    			min = comp;
    			index = i;
    			
    		}
    		
    	}
    	return index;
    }
    public void removemin() {
    	if(isEmpty()) {
			System.out.println("Empty priority queue!!");
			return;
		}
    	int ind = getminindex();
    	int removep = arr[ind].p;
    	int removev = arr[ind].v;
    	
    	for(int i = 0;i<getlength();i++) {
    		if(i<ind) {
    			arr[i]=arr[i];
    		}else if(i>ind) {
    			arr[i-1]=arr[i];	
    		
    		}
    	}
    	rear--;
    	System.out.println("Element removed: "+"("+removep+","+removev+")");
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
		Q3 pp = new Q3(7);
		System.out.println("Is Empty: "+pp.isEmpty());
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
