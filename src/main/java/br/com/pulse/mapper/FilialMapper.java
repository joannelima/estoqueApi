package br.com.pulse.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import br.com.pulse.model.Filial;

@Mapper
@Repository
public interface FilialMapper {

  Filial buscar(Integer filialId);

  Filial buscarPorPedidoEstoque(@Param("idPedidoEstoque") Integer idPedidoEstoque);

}