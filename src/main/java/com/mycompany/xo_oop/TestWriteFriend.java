/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xo_oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author USER
 */
public class TestWriteFriend {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        Friend f1 = new Friend("Kaeewmanee", 13, "0111111111");
        Friend f2 = new Friend("Tanakorn", 15, "022222222");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        File file = new File("data.dat");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(f1);
        oos.writeObject(f2);
        oos.close();
        fos.close();
    }
    
}
