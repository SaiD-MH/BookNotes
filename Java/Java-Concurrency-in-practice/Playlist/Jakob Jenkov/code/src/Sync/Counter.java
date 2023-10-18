/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sync;

/**
 *
 * @author CLINIC
 */
public class Counter {

    long count = 0;

    public void add(long value) {
        this.count += value;
    }
    public void get(){
        System.out.println(count);
    }
}
