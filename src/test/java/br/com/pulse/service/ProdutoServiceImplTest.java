package br.com.pulse.service;


import br.com.pulse.mapper.ProdutoMapper;
import br.com.pulse.model.Produto;
import br.com.pulse.service.impl.ProdutoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Collection;
import java.util.Collections;

import static org.mockito.Mockito.mock;

public class ProdutoServiceImplTest {

    private ProdutoServiceImpl produtoService;
    private ProdutoMapper produtoMapper;

    @Before
    public void setup(){
        produtoMapper = mock(ProdutoMapper.class);
        produtoService = new ProdutoServiceImpl(produtoMapper);
    }

    private Produto criarProduto(){
        return Produto.builder().id(1).descricao("Sabão").build();
    }

    private Collection<Produto> criarList(){
        return Collections.singletonList(criarProduto());
    }


    @Test
    public void deveRetornarProdutoPorQuantidade(){
        //cenario
        Integer quantidade = 8;
        Collection<Produto> produtos = criarList();
        Mockito.when(produtoMapper.getProdutosByQuantidade(quantidade)).thenReturn(produtos);

        //execucao
        Collection<Produto> produtosResultado = produtoService.produtosPorQuantidade(8);

        //verificacao
        Assert.assertEquals(produtos, produtosResultado);
    }

    @Test
    public void deveRetornarProdutoPorFilial(){
        //cenario
        Integer idFilial = 1;
        Collection<Produto> produtos = criarList();
        Mockito.when(produtoMapper.getProdutosByFilial(idFilial)).thenReturn(produtos);

        //execucao
        Collection<Produto> produtosResultado = produtoService.produtosPorFilial(idFilial);

        //verificacao
        Assert.assertEquals(produtos, produtosResultado);
    }



}

