package br.com.pulse.controller;

import br.com.pulse.dto.PedidoEstoqueDto;
import br.com.pulse.model.PedidoEstoque;
import br.com.pulse.service.PedidoEstoqueService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/pedido")
@AllArgsConstructor
public class PedidoEstoqueController {

    PedidoEstoqueService pedidoEstoqueService;
    ModelMapper modelMapper;

    @PostMapping("/comprar")
    public ResponseEntity<PedidoEstoque> iniciarPedido(@RequestBody PedidoEstoqueDto pedidoDto){
        PedidoEstoque pedido = pedidoEstoqueService.salvar(modelMapper.map(pedidoDto, PedidoEstoque.class));
        URI location = getUri(pedido.getId());
        return ResponseEntity.created(location).build();
    }

    private URI getUri(Integer id) {
        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
    }
}
