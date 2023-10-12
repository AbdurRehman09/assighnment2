import java.util.*;
class StackException extends Exception {
    public StackException(String message) {
        super(message);
    }
}

class Node<T>
{
    private T data;
    private Node<T> next;
    public Node(T data)
    {
        this.data=data;
        this.next=null;
    }
    public T getData()
    {
        return this.data;
    }
    public void setData(T data)
    {
        this.data=data;
    }
    public Node<T> getNext()
    {
        return this.next;
    }
    public void  setNext(Node<T> temp){
        this.next=temp;
    }
}

class GenericStack<T>
{
    private Node<T>top;
    public GenericStack(){
        this.top=null;
    }
    public boolean checkempty()
    {
        if(top==null)
        {
            return true;
        }
        return false;
    }
    public void push(T data)
    {
        Node<T>temp=new Node(data);
        temp.setNext(top);
        top=temp;

    }
    public  T pop()throws StackException
    {
        if(checkempty())
        {
            throw new StackException("Stack is empty cannot pop");
        }
        T data=top.getData();
        top=top.getNext();
        return data;
    }
    public T peek()throws StackException {
        if (checkempty()) {
            throw new StackException("Stack is empty cannot peek");
        }
        return top.getData();
    }
    public int size()
    {
        int count=0;
        Node<T> temp=top;
        while(temp!=null)
        {
            count++;
            temp=temp.getNext();
        }
        return count;
    }
    public void print(){
        Node<T> temp=top;
        while(temp!=null)
        {
            System.out.println(temp.getData()+" ");
            temp=temp.getNext();
        }
    }
}
public class q1 {

    public static void main(String[] args) {
        try{
            GenericStack<Integer> intobj = new GenericStack<>();
            intobj.push(1);
            intobj.push(2);
            intobj.push(3);
            System.out.println("Stack size: " + intobj.size());
            System.out.println("Top element: " + intobj.peek());
            intobj.pop();
            System.out.println("Popped an element.");
            System.out.println("Stack size after pop: " + intobj.size());
            intobj.print();
            GenericStack<String> sobj = new GenericStack<>();
            sobj.push("Hello");
            sobj.push("World");
            sobj.push("!");
            System.out.println("\nString Stack size: " + sobj.size());
            System.out.println("Top element (String Stack): " + sobj.peek());
            sobj.pop();
            System.out.println("Popped an element from String Stack.");
            System.out.println("String Stack size after pop: " + sobj.size());
            sobj.print();
            GenericStack<Float> fobj = new GenericStack<>();
            fobj.push(1.5f);
            fobj.push(2.5f);
            fobj.push(3.5f);
            System.out.println("\nFloat Stack size: " + fobj.size());
            System.out.println("Top element (Float Stack): " + fobj.peek());
            fobj.pop();
            System.out.println("Popped an element from Float Stack.");
            System.out.println("Float Stack size after pop: " + fobj.size());
            fobj.print();
        }catch(StackException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}

