package br.com.pulse.mapper;

import br.com.pulse.model.Produto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Mapper
public interface ProdutoMapper {
    Collection<Produto> getProdutosByQuantidade(@Param("quantidade") Integer quantidade);
    Collection<Produto> getProdutosByFilial(@Param("idFilial") Integer filial);
}
