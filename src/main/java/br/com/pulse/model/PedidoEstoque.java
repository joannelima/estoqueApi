package br.com.pulse.model;

/*
 * @author joanne-lima
 * @project projeto
 */

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PedidoEstoque {
    private Integer id;
    private Filial filial;
    private TipoVenda tipoVenda;
    private List<ItensPedidos> itens;
}
