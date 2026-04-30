package org.uade.structure.implement.statics;

import org.uade.structure.definition.StackADT;

public class StackADTImplement implements StackADT {
    private int []stack;
    private int top;

    public StackADTImplement(int capacity) {
        this.stack = new int[capacity];
        this.top = -1;
    }

    @Override
    public int getElement() {
        return this.stack[top];
    }

    @Override
    public void add(int value) {
        if (top < stack.length - 1) {
            this.top++;
            this.stack[top] = value;
        }
    }

    @Override
    public void remove() {
        this.stack[top] = 0;
        this.top--;
    }

    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }
}
