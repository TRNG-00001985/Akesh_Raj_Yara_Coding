package Advance_Java;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		
		String str="{{[(]}}";
		Stack <Character> s = new Stack();
		
		for(int i=0; i<str.length(); i++ ) {
			if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(')  {
				s.push(str.charAt(i));
			}
			else {
				if(str.charAt(i)=='}') 
					if(s.peek()=='{') {
						s.pop();
					}
				if(str.charAt(i)==']')
					if(s.peek()=='[') {
						s.pop();
					}
			}   if(str.charAt(i)==')')
					if(s.peek()=='(') {
						s.pop();
					}
		}
		if(s.isEmpty())
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
	}
}
