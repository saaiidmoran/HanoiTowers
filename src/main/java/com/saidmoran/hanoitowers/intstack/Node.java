package com.saidmoran.hanoitowers.intstack;

/**
 *
 * @author saaii
 */
public class Node {
    
    private int data;
    private Node previous;
    
    public Node(){}
    
    public Node(int data){
        this.data = data;
    }
    
    public Node(int data, Node previous){
        this.data = data;
        this.previous = previous;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    
}
