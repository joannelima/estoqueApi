package br.com.pulse.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ItensPedidosDto {
    private Integer idProduto;
    private Integer quantidadeProduto;
    private Integer filial;

}
