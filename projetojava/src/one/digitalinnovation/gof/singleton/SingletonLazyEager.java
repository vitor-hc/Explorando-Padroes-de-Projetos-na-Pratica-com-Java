/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one.digitalinnovation.gof.singleton;

/**
 *
 * @author Vitor Hugo
 */
public class SingletonLazyEager {

    private static SingletonLazyEager instancia = new SingletonLazyEager();

    private SingletonLazyEager() {
        super();

    }

    public static SingletonLazyEager getInstancia() {

        return instancia;
    }

}
