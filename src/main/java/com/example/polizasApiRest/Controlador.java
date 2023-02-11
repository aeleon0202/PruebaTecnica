package com.example.polizasApiRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clientes")
public class Controlador {

    public Controlador(ServicioCliente servicioCliente) {
        this.servicioCliente = servicioCliente;
    }

    private final ServicioCliente servicioCliente;


    @PostMapping
    public ResponseEntity guardarCliente(@RequestBody Cliente cliente){
        return new ResponseEntity(servicioCliente.guardarCliente(cliente), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity consultarCliente(@PathVariable("id") Long idCliente){
        return new ResponseEntity(servicioCliente.consultarCliente(idCliente), HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity modificarCliente(@PathVariable("id") Long idCliente, @RequestBody Cliente cliente){
        return new ResponseEntity(servicioCliente.modificarCliente(idCliente, cliente ), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarCliente(@PathVariable("id") Long idCliente) {
        boolean respuesta = servicioCliente.eliminarCliente(idCliente);
        if (respuesta==true) {
            return new ResponseEntity(HttpStatus.OK);
        }
        else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
