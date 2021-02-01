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
public class Estoque {
    private Long id;
    private Filial filial;
    private Integer quantidadeProdutos;
    private Produto produto;
}
