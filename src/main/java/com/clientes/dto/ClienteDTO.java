package com.clientes.dto;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

@Data
public class ClienteDTO extends RepresentationModel<ClienteDTO> {
    private Integer idCliente;
    private Integer idUsuario;
    private String nombreCompleto;
    private String rut;
    private String direccion;
    private String telefono;
}
