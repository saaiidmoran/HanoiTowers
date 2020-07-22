package com.saidmoran.hanoitowers.intstack;

/**
 *
 * @author saaii
 */
public class Stack {
    
    private Node top;
    private int size;
    private final String idStack;
    
    public Stack(String idStack){
        top = null;
        size = 0;
        this.idStack = idStack;
    }
    
    public void push(int data){
        Node newNode = new Node(data,getTop());
        top = newNode;
        size++;        
    }
    
    public int pop(){
        if(!isEmpty()){
            int aux = getTop().getData();
            top = getTop().getPrevious();
            size--;
            return aux;
        }else{
            return 0;
        }   
    }
    
    public void clean(){
        while(!isEmpty()){
            pop();
        }        
    }
    
    public void print(){
        if(!isEmpty()){
            StringBuilder p = new StringBuilder();
            Node aux = getTop();
            p.append("[");
            for(int i = 1; i < getSize(); i++){
                p.append(aux.getData()).append(",");
                aux = aux.getPrevious();
            }
            p.append(aux.getData()).append("]");
            System.out.println(p.toString());
        }else{
             System.out.println("[]");
        }        
    }
    
    public Node getTop() {
        return top;
    }

    public int getSize() {
        return size;
    }

    public String getIdStack() {
        return idStack;
    }
    
    public boolean isEmpty(){
        return getSize() == 0;
    }
    
}
