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
public class Produto {
    private Integer id;
    private String descricao;

}
