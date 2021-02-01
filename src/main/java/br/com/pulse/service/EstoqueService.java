package br.com.pulse.service;

import br.com.pulse.model.Estoque;
import br.com.pulse.model.Filial;
import br.com.pulse.model.Produto;

public interface EstoqueService {

    Estoque atualizaQtdProdutos(Estoque estoque, Integer novaQuantidade);
    Estoque consultaEstoque(Filial filial, Produto produto);
}
