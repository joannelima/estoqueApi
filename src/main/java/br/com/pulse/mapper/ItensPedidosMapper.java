package br.com.pulse.mapper;

import br.com.pulse.model.ItensPedidos;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ItensPedidosMapper {
    void inserirItem(@Param("itens")ItensPedidos itens);

}
