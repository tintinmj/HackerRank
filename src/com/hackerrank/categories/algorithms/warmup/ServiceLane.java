package com.hackerrank.categories.algorithms.warmup;

import java.util.Scanner;

/**
 *
 * @author tintinmj
 * problem link https://www.hackerrank.com/challenges/service-lane
 * Difficulty : EASY
 */
public class ServiceLane {
    
    public static void main(String []args) {
        int N,T;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = sc.nextInt();
        int[] width = new int[N];
        for(int i = 0; i < N; i++) {
            width[i] = sc.nextInt();
        }
        while(T-- > 0) {
            System.out.println(minVeh(sc.nextInt(),sc.nextInt(),width));
        }
    }
    
    public static int minVeh(int i, int j, int[] width) {
        int v = Integer.MAX_VALUE;
        for(int k = i; k <= j; k++) {
            if(width[k] < v) {
                v = width[k];
                
                // no need to go further when only bike can fit in
                if(v == 1) {
                    break;
                }
            }
        }
        return v;
    }
}
