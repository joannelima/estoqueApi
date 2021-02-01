package br.com.pulse.service.impl;

import br.com.pulse.mapper.EstoqueMapper;
import br.com.pulse.model.Estoque;
import br.com.pulse.model.Filial;
import br.com.pulse.model.Produto;
import br.com.pulse.service.EstoqueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EstoqueServiceImpl implements EstoqueService {

    EstoqueMapper estoqueMapper;

    @Override
    public Estoque atualizaQtdProdutos(Estoque estoque, Integer novaQuantidade) {
        estoqueMapper.updateEstoque(estoque, novaQuantidade);
        return estoque;
    }

    @Override
    public Estoque consultaEstoque(Filial filial, Produto produto) {
        return estoqueMapper.buscar(filial, produto);
    }

}
