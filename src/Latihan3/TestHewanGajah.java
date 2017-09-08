/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author SMK TELKOM
 */
public class TestHewanGajah {
    public static void main(String[]args)
    {
        Gajah myGajah=new Gajah();
        Hewan myHewan=myGajah;
        Hewan.testclassMethod();
        myHewan.testInstanceMethod();
    }
}
