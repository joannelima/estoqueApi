package br.com.pulse.service;

import br.com.pulse.mapper.ItensPedidosMapper;
import br.com.pulse.model.ItensPedidos;
import br.com.pulse.model.PedidoEstoque;
import br.com.pulse.model.Produto;
import br.com.pulse.model.TipoVenda;
import br.com.pulse.service.impl.ItensPedidoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ItensPedidosServiceImplTest {

    private ItensPedidoServiceImpl itensPedidoService;
    private ItensPedidosMapper itensPedidosMapper;



    @Before
    public void setup(){
        itensPedidosMapper = mock(ItensPedidosMapper.class);
        EstoqueService estoqueService = mock(EstoqueService.class);
        FilialService filialService = mock(FilialService.class);
        itensPedidoService = new ItensPedidoServiceImpl(estoqueService, itensPedidosMapper, filialService);
    }

    public Produto simularProduto(){
        return Produto.builder().id(1).descricao("Macarrão").build();
    }

    public ItensPedidos simularItem(){
        return ItensPedidos.builder().id(1L).produto(simularProduto()).pedidoEstoque(simularPedidoEstoque()).quantidadeProdutos(50).build();
    }

    public PedidoEstoque simularPedidoEstoque(){
        return PedidoEstoque.builder().id(1).tipoVenda(TipoVenda.SA).build();
    }

    @Test
    public void deveSalvarItemPedido(){
        //cenario
        ItensPedidos item = simularItem();
        Long idEsperado = 1L;
        //execucao
        itensPedidoService.salvarItem(item, simularPedidoEstoque());

        //verificacao
        Assert.assertEquals(idEsperado, item.getId());
    }
}
