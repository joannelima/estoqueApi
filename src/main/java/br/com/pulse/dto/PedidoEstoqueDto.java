package br.com.pulse.dto;

/*
 * @author joanne-lima
 * @project projeto
 */

import br.com.pulse.model.Filial;
import br.com.pulse.model.ItensPedidos;
import br.com.pulse.model.TipoVenda;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PedidoEstoqueDto {
    private TipoVenda tipoVenda;
    private Filial filial;
    List<ItensPedidos> itens;

}
