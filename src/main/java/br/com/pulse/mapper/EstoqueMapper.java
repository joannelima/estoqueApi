package br.com.pulse.mapper;

import br.com.pulse.model.Estoque;
import br.com.pulse.model.Filial;
import br.com.pulse.model.Produto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface EstoqueMapper {

    Integer getQuantidadeProdutos(@Param("filial") Filial filial, @Param("produto") Produto produto);
    void updateEstoque(@Param("estoque") Estoque estoque, @Param("novaqtd") Integer novaQtd);
    Estoque buscar(@Param("filial") Filial filial, @Param("produto") Produto produto);
}
