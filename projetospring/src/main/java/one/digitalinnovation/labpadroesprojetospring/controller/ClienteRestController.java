/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one.digitalinnovation.labpadroesprojetospring.controller;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;
import one.digitalinnovation.labpadroesprojetospring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vitor Hugo
 */
@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> bsucarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {

        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> iserir(@RequestBody Cliente cliente) {
        clienteService.inserir(cliente);                
    return ResponseEntity.ok(cliente);
    }
    
     @PostMapping("/{id}")
     public ResponseEntity<Cliente> atualizar (@PathVariable Long id,@RequestBody Cliente cliente ){
      clienteService.atualizar(id,cliente); 
      return ResponseEntity.ok(cliente);
     }
    
     @DeleteMapping("/{id}")
      public ResponseEntity<Void> deletar(@PathVariable Long id){
    clienteService.deletar(id);
    return ResponseEntity.ok().build();

}
    
    
    

}
