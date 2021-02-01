package br.com.pulse.service;


import br.com.pulse.model.Produto;

import java.util.Collection;

public interface ProdutoService {
    Collection<Produto> produtosPorQuantidade(Integer quantidade);
    Collection<Produto> produtosPorFilial(Integer idFilial);
}
