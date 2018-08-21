/**
 * 
 */
package com.stack;

public class Stack {
private int [] stack;
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




}
