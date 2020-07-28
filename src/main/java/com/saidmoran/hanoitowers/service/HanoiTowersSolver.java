package com.saidmoran.hanoitowers.service;

import com.saidmoran.hanoitowers.intstack.Stack;

/**
 *
 * @author saaii
 */
public class HanoiTowersSolver {
    
    private int numMovements;
    private final StringBuilder instructions;
    
    public HanoiTowersSolver(){
        numMovements = 0;
        instructions = new StringBuilder();
    }    
    
    public void solve(int n, Stack o, Stack a, Stack d){
        if(n == 1){
            d.push(o.pop());
            numMovements++;
            addInstruction(n, o, d);
        }else{
            solve(n - 1, o, d, a);
            d.push(o.pop()); 
            numMovements++;
            addInstruction(n, o, d);
            solve(n - 1, a, o, d);
        }
    }

    public int getNumMovements() {
        return numMovements;
    }
    
    public String getInstructions(){
        return instructions.toString();
    }
    
    private void addInstruction(int n, Stack o, Stack d){
        if(numMovements > 1){
            instructions.append("\n");                    
        }
        instructions.append(" -> Mover disco ")
                .append(n)
                .append(" de ")
                .append(o.getIdStack())
                .append(" a ")
                .append(d.getIdStack());       
    }
    
}
