package br.com.pulse.service;

import br.com.pulse.mapper.EstoqueMapper;
import br.com.pulse.model.Estoque;
import br.com.pulse.model.Filial;
import br.com.pulse.model.Produto;
import br.com.pulse.service.impl.EstoqueServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

public class EstoqueServiceImplTest {

    private EstoqueServiceImpl estoqueService;
    private EstoqueMapper estoqueMapper;

    @Before
    public void setup(){
        estoqueMapper = mock(EstoqueMapper.class);
        estoqueService = new EstoqueServiceImpl(estoqueMapper);
    }

    public Produto simularProduto(){
        return Produto.builder().id(1).descricao("SOPA").build();
    }

    public Filial simularFilial(){
        return Filial.builder().id(1).descricao("MATEUS COHAMA").build();
    }

    public Estoque simularEstoque(){
        return Estoque.builder().id(1L).filial(simularFilial()).produto(simularProduto()).quantidadeProdutos(50).build();
    }


    @Test
    public void deveAtualizarQuantidadeProdutos(){
        //cenario
        Integer quantidadeInserida = 9;
        Integer quantidadeEsperada = 41;
        Estoque estoque = simularEstoque();

        //execucao
        Estoque retorno = estoqueService.atualizaQtdProdutos(estoque, quantidadeInserida);

        //verificacao
        Assert.assertEquals(retorno.getQuantidadeProdutos(), quantidadeEsperada);
    }
}
