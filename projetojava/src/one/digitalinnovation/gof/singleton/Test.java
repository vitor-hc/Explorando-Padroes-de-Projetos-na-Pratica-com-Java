package one.digitalinnovation.gof.singleton;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {        
        //Testes relacionados ao Desing Pattern Singleton:
        //Singleton
        System.out.println("Singleton");
        SingletonLazy lazy =SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy =SingletonLazy.getInstancia();
        System.out.println(lazy);        
        SingletonLazyEager lazy2 = SingletonLazyEager.getInstancia();
        System.out.println(lazy2);
        lazy2 = SingletonLazyEager.getInstancia();
        System.out.println(lazy2);        
        SingletonLazyHolder lazy3 =SingletonLazyHolder.getInstancia();
        System.out.println(lazy3);
        lazy3=SingletonLazyHolder.getInstancia();
        System.out.println(lazy3);
        System.out.println();
        // Fim...        
        //Strategy
        System.out.println("Strategy");
        Comportamento normal=new ComportamentoNormal();
        Comportamento defensivo=new ComportamentoDefensivo();
        Comportamento agressivo=new ComportamentoAgressivo();
        Robo robo=new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        System.out.println("============");
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();
        System.out.println("============");
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();       
        //Facade
        System.out.println("Facade");        
        Facade facade=new Facade();
        facade.migrarCliente("Vitor", "1130000");
        
        


    }

}
