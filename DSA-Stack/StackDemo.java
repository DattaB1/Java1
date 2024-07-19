//implementing a stack in the form of ArrayList

import java.util.ArrayList;

/**
 * StackDemo
 */
public class StackDemo {

  class Stack
  {
    ArrayList<Integer> list= new ArrayList<>(); 
    public boolean isEmpty()
    {
      return list.size()==0;
    }

    //push     
    public void push(int data)   //Adding the data on the top of the stack
    {
      list.add(data);
    }

    //pop
    public int pop()
    {
      int top=list.get(list.size()-1);
      list.remove(list.size()-1);
      return top; 
    }

    //peek
    public int peek()
    {
      return list.get(list.size()-1);
    }
  }

  public static void main(String[] args) 
  {
      StackDemo stackDemo = new StackDemo();
      Stack s = stackDemo.new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
      
    }
  }
}