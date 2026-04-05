/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ekspresi1;

/**
 *
 * @author LENOVO
 */
//NAMA : MUH.ASLAM
//NIM  : 13020240088

public class Ekspresi1 {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        float fx, fy;

        System.out.print("x/y (format integer) = " + x / y);
        System.out.print("\nx/y (format float) = " + x / y);

        fx = x;
        fy = y;

        System.out.print("\nx/y (format float) = " + fx / fy);

        System.out.print("\nfloat(x)/float(y) = " + (float) x / (float) y);

        x = 10;
        y = 3;

        System.out.print("\nx/y (format integer) = " + x / y);
        System.out.print("\nx/y (format float) = " + x / y);
    }
}
