package br.com.pulse.controller;

import br.com.pulse.model.Produto;
import br.com.pulse.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/produto")
@AllArgsConstructor
public class ProdutoController {

    ProdutoService produtoService;

    @GetMapping("/quantidade/{quantidade}")
    public ResponseEntity<Collection<Produto>> produtosPorQuantidade(@PathVariable Integer quantidade){
        Collection<Produto> produtos= produtoService.produtosPorQuantidade(quantidade);
        return produtos.isEmpty() ?
                    ResponseEntity.noContent().build() :
                          ResponseEntity.ok(produtos);
    }

    @GetMapping("/filial/{idFilial}")
    public ResponseEntity<Collection<Produto>> produtosPorFilial(@PathVariable Integer idFilial){
        Collection<Produto> produtos = produtoService.produtosPorFilial(idFilial);
        return produtos.isEmpty() ?
                ResponseEntity.noContent().build() :
                     ResponseEntity.ok(produtos);
    }
}
