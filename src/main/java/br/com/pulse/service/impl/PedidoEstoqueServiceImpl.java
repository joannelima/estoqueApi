package br.com.pulse.service.impl;

import br.com.pulse.mapper.PedidoEstoqueMapper;
import br.com.pulse.model.PedidoEstoque;
import br.com.pulse.service.ItensPedidoService;
import br.com.pulse.service.PedidoEstoqueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class PedidoEstoqueServiceImpl implements PedidoEstoqueService {

    PedidoEstoqueMapper pedidoEstoqueMapper;
    ItensPedidoService itensPedidoService;

    @Override
    public PedidoEstoque salvar(PedidoEstoque pedido) {
      PedidoEstoque pedidoEstoque = salvarPedido(pedido);
      pedido.getItens().forEach(item -> itensPedidoService.salvar(item, pedidoEstoque));
      return pedidoEstoque;
    }

    public PedidoEstoque salvarPedido(PedidoEstoque pedido){
        PedidoEstoque novoPedido =
                PedidoEstoque.builder()
                        .filial(pedido.getFilial())
                        .tipoVenda(pedido.getTipoVenda()).build();
        pedidoEstoqueMapper.save(novoPedido);

        return pedidoEstoqueMapper.getById(novoPedido.getId());
    }
}
