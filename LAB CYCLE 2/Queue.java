package queue;

import java.util.*;
class Queue{
	       int front=-1;
	       int rear=-1;
	       int n=0,x;
	       int size;
	       static Scanner sc=new Scanner(System.in);
	       static int a[];
	       Queue(int size1)
	       {
	         size=size1;
	         a=new int[size];
	       }
	       
	       Queue()
	      {
	         System.out.println("Enter 1 for insertion ,2 for deletion,and -1 for exit");
	         while(n!=-1)
	    {
	        System.out.println("enter the key value to perform the operation:");
	        n=sc.nextInt();
	        switch(n)
	        {
	         case 1:
	             System.out.println("Enter the element to be inserted:");
	             x=sc.nextInt();
	             enqueue(x);
	             System.out.println("The elements in  queue are:");
	             display();
	             break;
	         case 2:
	              dequeue();
	              System.out.println("The queue is:");
	              display();
	              break;
	         default:
	            System.out.println("no operation will be performed");
	             break;
	        }
	    }
	  }
	        

	        void  enqueue(int item){
	 
	     if((front==0)&&(rear==size-1))
	    {
	        System.out.println("full,cannot be inserted");
	    }
	    else if(front==-1)
	    {
	        front++;
	        rear++;
	       a[rear]=item;
	    }
	   else
	   {
	      rear++;
	      a[rear]=item;
	   }


	}

	 int dequeue(){
	    int item=-1;
	    if(front==-1||front==rear+1)
	    {
	        System.out.println("empty,cannot delete an element");
	    }
	    else
	    {
	        item =a[rear];
	        front++;
	        
	    }
	    return item;


	}
	 void display(){
	    int i;

	    for(i=front;i<=rear;i++)
	    {
	        System.out.println(" "+a[i]);
	    }
	}

		public static void main(String[]args){
	        System.out.println("enter the size of the queue:");
	        int size1=sc.nextInt();
	        new Queue(size1);
	        new Queue();
			
	  }
	}

