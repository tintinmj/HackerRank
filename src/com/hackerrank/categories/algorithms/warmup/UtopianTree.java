/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hackerrank.categories.algorithms.warmup;

import java.util.Scanner;

/**
 *
 * @author tintinmj
 * problem link https://www.hackerrank.com/challenges/utopian-tree
 * Difficulty : EASY
 */
public class UtopianTree {
    
    public static int calculateHeight(int cycles) {
        int height = 1;
        for(int i = 0; i < cycles; i++) {
            if(i % 2 == 0) {
                height *= 2;
            }
            else {
                height++;
            }
        }
        return height;
    }
    
    public static int calculateHeightOptimized(int cycles) {
        int height = 1;
        int year = cycles % 2 == 0 ? (cycles / 2) : (cycles / 2) + 1;
        
        // year means full 2 cycles
        // 1st year 3  m
        // 2nd year 7  m
        // 3rd year 15 m
        // 4th year 31 m .... and so on
        height = pow(2, (year + 1)) - 1;
        
        // not a full cycle but due to round up needs to cut down 
        // one more meter
        if(cycles % 2 != 0) {
            height--;
        }
        return height;
    }
    
    private static int pow(int base, int exp) {
        return (int) Math.pow(base, exp);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        while(T --> 0) {
            int cycle = scanner.nextInt();
            System.out.println(calculateHeightOptimized(cycle));
        }
    }
}
