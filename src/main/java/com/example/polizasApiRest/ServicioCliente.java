package com.example.polizasApiRest;

public interface ServicioCliente {
    Cliente guardarCliente(Cliente cliente);

    Cliente consultarCliente(Long idCliente);

    Cliente modificarCliente(Long id, Cliente modificarCliente);
    boolean eliminarCliente(Long id);



}
