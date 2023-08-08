/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xo_oop;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Friend implements Serializable{

    private int id;
    private String name;
    private int age;
    private String tel;
    private static int lastId = 1;

    public Friend(String name, int age, String tel) {
        this.id = lastId++;
        this.name = name;
        this.age = age;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
        
        }
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public static int getLastId() {
        return lastId;
    }

    public static void setLastId(int lastId) {
        Friend.lastId = lastId;
    }

    @Override
    public String toString() {
        return "Friend{" + "id=" + id + ", name=" + name + ", age=" + age + ", tel=" + tel + '}';
    }
   

    public static void main(String[] args) {
        Friend f1 = new Friend("Pom", 70, "0813333333");
        System.out.println(f1.toString());

    }

}
