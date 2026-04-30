package org.uade.structure.implement.statics;

import org.uade.structure.definition.QueueADT;

public class QueueADTImplement implements QueueADT {
    private int []queue;
    private int startOfQueue;
    private int endOfQueue;

    public QueueADTImplement(int capacity) {
        this.queue = new int[capacity];
        this.startOfQueue = -1;
        this.endOfQueue = -1;
    }

    @Override
    public int getElement() {
        return 0;
    }

    @Override
    public void add(int value) {
        if (isEmpty()) {
            this.startOfQueue = 0;
        }
        if (this.endOfQueue <= this.queue.length - 1) {
            this.endOfQueue++;
            this.queue[endOfQueue] = value;
        }
    }

    @Override
    public void remove() {

    }

    @Override
    public boolean isEmpty() {
        return this.startOfQueue == -1;
    }
}
