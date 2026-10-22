/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Josh
 */
public class PatternGeneratorWithEarlyExit {
    
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {
            if (i == 3) {
                continue;
            }

            for (int j = 1; j <= size; j++) {
                if (j > 3) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

