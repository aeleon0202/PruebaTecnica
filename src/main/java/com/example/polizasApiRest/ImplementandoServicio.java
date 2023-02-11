package com.example.polizasApiRest;

import org.springframework.stereotype.Service;

@Service
public class ImplementandoServicio implements ServicioCliente{

    private final  RepositorioCliente repositorioCliente;

    public ImplementandoServicio(RepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }


    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    @Override
    public Cliente consultarCliente(Long idCliente) {
        return repositorioCliente.findById(idCliente).orElseThrow(()->{throw new RuntimeException();});
    }

    @Override
    public Cliente modificarCliente(Long id, Cliente modificarCliente) {
        Cliente clienteConsultado = repositorioCliente.findById(id).get();
        clienteConsultado.setDireccion(modificarCliente.getDireccion());
        clienteConsultado.setCiudad(modificarCliente.getCiudad());
        clienteConsultado.setFechaNacimiento(modificarCliente.getFechaNacimiento());
        return repositorioCliente.save(clienteConsultado);
    }

    @Override
    public boolean eliminarCliente(Long id) {

        try {
            repositorioCliente.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
