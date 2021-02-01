package br.com.pulse.model;

/*
 * @author joanne-lima
 * @project projeto
 */
import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ItensPedidos {
    private Long id;
    private Produto produto;
    private Integer quantidadeProdutos;
    private PedidoEstoque pedidoEstoque;
}
