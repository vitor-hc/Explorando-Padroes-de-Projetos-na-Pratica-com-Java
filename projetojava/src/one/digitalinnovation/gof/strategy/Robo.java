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
public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    
    public void mover(){
    comportamento.mover();
    }
    

    
    
}
