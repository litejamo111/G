package org.example;

import org.example.pack.Enemy;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String Username="jamie";
        Hero object=new Hero(32,"jamie");
        Enemy object2=new Enemy();
        System.out.print(object.toString());
        System.out.println();
    }
}