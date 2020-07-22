package com.saidmoran.hanoitowers.control;

import com.saidmoran.hanoitowers.intstack.Stack;
import com.saidmoran.hanoitowers.service.HanoiDiscsMovements;

/**
 *
 * @author saaii
 */
public class Hanoi {
    
    public static void hanoiTowersInit(String nDisks){
        if(nDisks.matches("[0-9]+")){
            if(Integer.valueOf(nDisks) > 0){
                Stack o = new Stack("Torre 1");        
                Stack a = new Stack("Torre 2");
                Stack d = new Stack("Torre 3");
                for(int i = Integer.valueOf(nDisks); i > 0; i--){
                    o.push(i);
                }
                System.out.println("================= Torres iniciales =================");
                printTowers(o, a, d);
                System.out.println("================= Movimientos =================");
                HanoiDiscsMovements hs = new HanoiDiscsMovements();
                hs.moveDisks(o.getSize(), o, a, d);
                System.out.println("================= Torres finales =================");
                printTowers(o, a, d);
                System.out.println("================= Movimientos realizados: " + hs.getNumMovements() + " =================");
            }else{
                System.err.println("Error, la cantidad de discos debe ser mayor que 0");
            }            
        }else{
            System.err.println("Error, la cantidad de discos que se ingresó es incorrecta");
        } 
    }
    
    private static void printTowers(Stack o, Stack a, Stack d){
        System.out.println("Torre 1");
        o.print(); 
        System.out.println("Torre 2");
        a.print();
        System.out.println("Torre 3");
        d.print();
    }
    
}
