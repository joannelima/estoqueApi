package br.com.pulse.service.impl;

import br.com.pulse.mapper.ProdutoMapper;
import br.com.pulse.model.Produto;
import br.com.pulse.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@AllArgsConstructor
public class ProdutoServiceImpl implements ProdutoService {

    ProdutoMapper produtoMapper;

    @Override
    public Collection<Produto> produtosPorQuantidade(Integer quantidade) {
        return produtoMapper.getProdutosByQuantidade(quantidade);
    }

    @Override
    public Collection<Produto> produtosPorFilial(Integer idFilial) {
        return produtoMapper.getProdutosByFilial(idFilial);
    }
}
