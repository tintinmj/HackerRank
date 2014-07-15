/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hackerrank.categories.algorithms.warmup;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author tintinmj
 * problem link https://www.hackerrank.com/challenges/sherlock-and-queries
 * Difficulty : MODERATE
 */
public class SherlockAndQueries {
    
    private static final int modulo = 1000000007;
    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        int N,M;
        N = scanner.nextInt();
        M = scanner.nextInt();
        int []A = new int[N+1];
        int []B = new int[M+1];
        int []C = new int[M+1];
        
        A[0] = B[0] = C[0] = 0;
        
        for (int i = 1; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        
        for (int i = 1; i < B.length; i++) {
            B[i] = scanner.nextInt();
        }
        
        for (int i = 1; i < C.length; i++) {
            C[i] = scanner.nextInt();
        }
        
        for (int i = 1; i < B.length; i++) {
            for (int multiply = 1; multiply * B[i] < A.length; multiply++) {
                A[multiply * B[i]] = (A[multiply * B[i]] * C[i]) % modulo;
            }
        }
        
        
        try (PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8")) {
            for (int i = 1; i < A.length; i++) {
                writer.print(A[i] + " ");
            }
        }
        System.out.println("-------------------------\n ------------------");
        
    }
}
