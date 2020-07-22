package com.saidmoran.hanoitowers;

import com.saidmoran.hanoitowers.control.Hanoi;
import java.util.Scanner;

/**
 *
 * @author saaii
 */
public class HanoiTowers {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("================= Ingrese la cantidad de discos =================");
        Hanoi.hanoiTowersInit(s.nextLine());      
        
    }
    
}
