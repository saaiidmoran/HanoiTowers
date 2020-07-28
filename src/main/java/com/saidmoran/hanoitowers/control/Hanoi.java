package com.saidmoran.hanoitowers.control;

import com.saidmoran.hanoitowers.intstack.Stack;
import com.saidmoran.hanoitowers.service.HanoiTowersSolver;

/**
 *
 * @author saaii
 */
public class Hanoi {
    
    public static void hanoiTowersInit(String nDisks){
        if(numDiscsIsValid(nDisks)){
            Stack o = new Stack("Torre 1");        
            Stack a = new Stack("Torre 2");
            Stack d = new Stack("Torre 3");
            for(int i = Integer.valueOf(nDisks); i > 0; i--){
                o.push(i);
            }
            System.out.println("================= Torres iniciales =================");
            printTowers(o, a, d);
            HanoiTowersSolver hs = new HanoiTowersSolver();
            hs.solve(o.getSize(), o, a, d);
            System.out.println("================= Instrucciones =================");
            System.out.println(hs.getInstructions());
            System.out.println("================= Torres finales =================");
            printTowers(o, a, d);
            System.out.println("================= Movimientos realizados: " + hs.getNumMovements() + " =================");
        }else{
            System.err.println("Error, la cantidad de discos debe ser mayor que 0 y solo se aceptan valores numéricos enteros");
        } 
    }
    
    private static boolean numDiscsIsValid(String nDiscs){
        if(nDiscs.matches("[0-9]+")){
            return Integer.valueOf(nDiscs) > 0;
        }else{
            return false;
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
