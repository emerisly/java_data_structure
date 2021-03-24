return (top == -1);
return top+1;
String result = "";

      for (int scan=0; scan <= top; scan++)
      {
         result = result + stack[scan].toString() + "\n";
      }
      
      return result;
      
      
      
      
      
if (isEmpty())
         throw new EmptyCollectionException("Stack"); 

      return top.getElement();
return (top == null);
int num = 0;

      LinearNode<T> current = top;
      while (current != null)
      {
	     num++;
	     current = current.getNext();
      }

      return num;
String result = "";
      LinearNode<T> current = top;

      while (current != null)
      {
         result = result + (current.getElement()).toString() + "\n";
         current = current.getNext(); 
      }

      return result;

      
      
first
if (isEmpty())
      {
         throw new EmptyCollectionException ("queue");
      }
    
      return queue[front];
      
      
isEmpty
return (front == (rear+1));


size
return rear - front + 1;


toString
String result = "";

      if (front <= rear)
      {
         for (int scan=front; scan <= rear; scan++)
         {
             result += queue[scan] + "\n";
         }
      }
      else
      {
         for (int scan=front; scan < queue.length; scan++)
         {
             result += queue[scan] + "\n";
         }
         for (int scan=0; scan <= rear; scan++)
         {
             result += queue[scan] + "\n";
         }
      }
    
      return result;

      
first
if (isEmpty())
      {
         throw new EmptyCollectionException ("queue");
      }

      return front.getElement();
      
      
isEmpty
return (front == null);


size
LinearNode<T> current = front;
      int num = 0;

      while (current != null)
      {
         num++;
         current = current.getNext();
      }

      return num;
      
      
toString
String result = "";
      LinearNode<T> current = front;

      while (current != null)
      {
         result = result + current.getElement() + "\n";
         current = current.getNext();
      }

      return result;