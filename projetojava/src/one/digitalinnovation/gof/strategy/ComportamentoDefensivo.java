/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one.digitalinnovation.gof.strategy;

/**
 *
 * @author Vitor Hugo
 */
public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover(){
    System.out.println("Movendo-se defensivamente...");
    }
}
