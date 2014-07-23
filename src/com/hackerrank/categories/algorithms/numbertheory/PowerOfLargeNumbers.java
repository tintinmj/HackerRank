package com.hackerrank.categories.algorithms.numbertheory;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author tintinmj
 */
public class PowerOfLargeNumbers {

    /**
    *
    * @author tintinmj
    * problem link https://www.hackerrank.com/challenges/power-of-large-numbers
    * Difficulty : MODERATE
    */
    
    public static BigInteger modulo = new BigInteger("1000000007");
    public static BigInteger moduloLessOne = new BigInteger("1000000006");
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            
            run(a, b);
        }
    }
    
    public static void run(BigInteger x, BigInteger b) {
//        BigInteger result = (a.pow(b.mod(moduloLessOne).intValue())).mod(modulo);
//        System.out.println(result);
        int a = 10;
        BigInteger sum = BigInteger.valueOf((a*(a+1)) / 2);
    }
    
}
