/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

class Sta {

    int top = -1;
    int[] arr = new int[30];

    public void push(int value) {
        arr[++top] = value;
    }

    public int pop() {
        return arr[top--];
    }

    public boolean Isfull() {
        return top == 30;
    }

    public boolean IsEmpty() {
        return top == -1;
    }

    public int peek() {
        return arr[top];
    }
    public void display()
    {
        for(int i =0 ; i<=top; i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }

}

public class stack {

    public static void main(String[] args) {
        Sta s = new Sta();
        System.out.println(s.IsEmpty());
        s.push(10);
        s.push(5);
        s.push(18);
        s.push(16);
        s.push(2);
        s.push(9);
        s.push(2);
        s.push(21);
        s.push(10);
        s.display();
        System.out.println(s.IsEmpty()+"\n");
  
        s.pop();
        System.out.println(s.peek());
        s.display();
        
        
      }

}

