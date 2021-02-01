package br.com.pulse.service.impl;

import br.com.pulse.mapper.ItensPedidosMapper;
import br.com.pulse.model.Estoque;
import br.com.pulse.model.Filial;
import br.com.pulse.model.ItensPedidos;
import br.com.pulse.model.PedidoEstoque;
import br.com.pulse.service.EstoqueService;
import br.com.pulse.service.FilialService;
import br.com.pulse.service.ItensPedidoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ItensPedidoServiceImpl implements ItensPedidoService {

    private final EstoqueService estoqueService;
    private final ItensPedidosMapper itensPedidosMapper;
    private final FilialService filialService;

    @Override
    public void salvar(ItensPedidos item, PedidoEstoque pedidoEstoque) {
        Filial filial = filialService.buscarPorPedidoEstoque(pedidoEstoque.getId());
        Estoque estoque = estoqueService.consultaEstoque(filial, item.getProduto());
        Integer quantidadePedida = item.getQuantidadeProdutos();
        Integer quantidadeExistente = estoque.getQuantidadeProdutos();
        salvarItem(item, pedidoEstoque);

        if(quantidadePedida < quantidadeExistente){
            estoqueService.atualizaQtdProdutos(estoque, quantidadePedida);
        }

    }

    public void salvarItem(ItensPedidos item, PedidoEstoque pedidoEstoque){
        ItensPedidos novoItem =
                ItensPedidos.builder()
                        .quantidadeProdutos(item.getQuantidadeProdutos())
                        .pedidoEstoque(pedidoEstoque)
                        .produto(item.getProduto()).build();
        itensPedidosMapper.inserirItem(novoItem);
    }



}
