/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oper1;

/**
 *
 * @author LENOVO
 */
//NAMA : MUH.ASLAM
//NIM :13020240088

public class Oper1 {
    public static void main(String[] args) {

        int n = 10;  // 1010 (biner)
        int x = 1;   // 0001
        int y = 2;   // 0010

        System.out.println("n = " + n);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("n & 8 = " + (n & 8));     // AND
        System.out.println("x & ~8 = " + (x & ~8));   // AND + NOT
        System.out.println("y << 2 = " + (y << 2));   // shift kiri
        System.out.println("y >> 3 = " + (y >> 3));   // shift kanan
    }
}