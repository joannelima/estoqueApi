package br.com.pulse.controller;

import br.com.pulse.model.Filial;
import br.com.pulse.service.FilialService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filial")
@AllArgsConstructor
public class FilialController {

    FilialService service;

    @GetMapping("/{id}")
    public ResponseEntity<Filial> buscar(@PathVariable Integer id){
       Filial retorno = service.buscar(id);

        return retorno != null ?
                ResponseEntity.ok(retorno) :
                  ResponseEntity.notFound().build();
    }


}
