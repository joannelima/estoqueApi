package br.com.pulse.model;

/*
 * @author joanne-lima
 * @project desafio-pulse
 */
import lombok.*;

@Getter
@Setter
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Filial {

    private Integer id;
    private String descricao;

}
