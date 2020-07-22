package com.saidmoran.hanoitowers.service;

import com.saidmoran.hanoitowers.intstack.Stack;

/**
 *
 * @author saaii
 */
public class HanoiDiscsMovements {
    
    private int numMovements;
    
    public HanoiDiscsMovements(){
        numMovements = 0;
    }
    
    public void moveDisks(int n, Stack o, Stack a, Stack d){
        if(n == 1){
            d.push(o.pop());
            numMovements++;
            System.out.println("-> Mover disco " + n +" de " + o.getIdStack() + " a " + d.getIdStack());
        }else{
            moveDisks(n - 1, o, d, a);
            d.push(o.pop()); 
            numMovements++;
            System.out.println("-> Mover disco " + n +" de " + o.getIdStack() + " a " + d.getIdStack());
            moveDisks(n - 1, a, o, d);
        }
    }

    public int getNumMovements() {
        return numMovements;
    }
    
}
