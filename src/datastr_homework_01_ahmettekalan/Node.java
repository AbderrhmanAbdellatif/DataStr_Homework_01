/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastr_homework_01_ahmettekalan;

/**
 *
 * @author AhmetTekalan
 */
public class Node<t> {

    t rakem;
    Node<t> nextNode;
    t kuvvet;

    public Node(t rakem, t kuvvet) {
        this.rakem = rakem;
        this.nextNode = null;
        this.kuvvet = kuvvet;
    }

}
