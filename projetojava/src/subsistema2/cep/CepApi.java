/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsistema2.cep;

import one.digitalinnovation.gof.singleton.SingletonLazyEager;

/**
 *
 * @author Vitor Hugo
 */
public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();

    }

    public static CepApi getInstancia() {

        return instancia;
    }
    
    public String recuperarCidade(String cep){
        return "Mongaguá";
    
    }
     public String recuperarEstado(String cep){
        return "São Paulo";
    
    }

}
