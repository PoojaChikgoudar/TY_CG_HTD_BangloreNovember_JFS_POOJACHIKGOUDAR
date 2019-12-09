package stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1=new Stack();
		s1.add(12);
		s1.add(24);
		s1.push(36);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.search(new Integer(24)));
		System.out.println(s1);
		

	}

}
