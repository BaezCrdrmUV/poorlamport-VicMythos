/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamport;

/**
 *
 * @author Mythos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lamport l = new lamport();
        l.p3(1);
        l.p2(11);
        l.p1(21);
    }

}
