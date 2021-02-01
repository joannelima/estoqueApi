package br.com.pulse.service;


import br.com.pulse.model.ItensPedidos;
import br.com.pulse.model.PedidoEstoque;

public interface ItensPedidoService {
    void salvar(ItensPedidos item, PedidoEstoque pedidoEstoque);
}
