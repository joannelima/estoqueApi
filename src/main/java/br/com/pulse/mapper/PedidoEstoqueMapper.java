package br.com.pulse.mapper;

import br.com.pulse.model.PedidoEstoque;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PedidoEstoqueMapper {
    void save(@Param("pedido") PedidoEstoque pedido);
    PedidoEstoque getById(@Param("id") Integer id);
}
