/**
 * 
 */
package com.stack;

public class Stack {
	private int[] stack;
	private int top;
	private int size;

	public Stack() {
		stack = new int[50];
		top = -1;
		size = 50;
	}

	public Stack(int size) {
		top = -1;
		this.size = size;
		stack = new int[this.size];
	}

	public boolean push(int number) {
		if (!isFull()) {
			top++;
			stack[top] = number;
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		return (top == stack.length - 1);

	}

	public int pop() {

		top--;
		return stack[top];

	}

	public boolean isempty() {
		return (top == -1);
	}
}
